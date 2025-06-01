/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 *
 * @author carri
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML 
    private TextArea getNotes;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        String GetText = getNotes.getText();
        
        System.out.println("You clicked me!");
        label.setText("Hello World!");
        
        try{
            File f = new File("First file.txt");
            f.createNewFile();
            
            if(f.exists()){
                FileWriter pen = new FileWriter(f);
                pen.write(GetText);
                pen.close();
            }
        }
        catch(IOException e){
            
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
