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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author Domingos
 */
public class FXMLAlertaController implements Initializable {

    @FXML
    private Button btAlerta;

    @FXML
    void exibirAlerta(ActionEvent event) {
        
        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setTitle("Titulo");
        alerta.setHeaderText("Cabecalho");
        alerta.setContentText("Conteudo");
        alerta.show();
        

    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
