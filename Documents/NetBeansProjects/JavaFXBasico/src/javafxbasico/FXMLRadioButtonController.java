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
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author Domingos
 */
public class FXMLRadioButtonController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private Button btSelecionado;

    @FXML
    private ToggleGroup grupoAlimento;

    @FXML
    void pegarSelecionado(ActionEvent event) {
        RadioButton radio =   (RadioButton) grupoAlimento.getSelectedToggle();
        System.out.println(radio.getText());
    }
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
