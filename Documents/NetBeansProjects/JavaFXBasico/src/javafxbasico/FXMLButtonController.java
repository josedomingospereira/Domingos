/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package javafxbasico;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Domingos
 */
public class FXMLButtonController implements Initializable {
    
    @FXML
    private Label label;
    
     @FXML
    private TextField txtNome;
    
    @FXML
    private void acaoDoBotao(ActionEvent event) {
        System.out.println("Você pressionou!");
        label.setText("Olá mundo! "+txtNome.getText());
    }
   

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
