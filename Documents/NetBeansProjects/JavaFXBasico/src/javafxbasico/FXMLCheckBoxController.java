/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package javafxbasico;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

/**
 * FXML Controller class
 *
 * @author Domingos
 */
public class FXMLCheckBoxController implements Initializable {

    
    @FXML
    private Button cb;

    @FXML
    private CheckBox cbJava;

    @FXML
    private CheckBox cbPHP;

    @FXML
    void pegarValor(ActionEvent event) {
        
        System.out.println(cbJava.selectedProperty().getValue());
         System.out.println(cbPHP.selectedProperty().getValue());
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
