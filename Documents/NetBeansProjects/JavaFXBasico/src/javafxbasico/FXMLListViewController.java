/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package javafxbasico;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafxbasico.model.Categoria;

/**
 * FXML Controller class
 *
 * @author Domingos
 */
public class FXMLListViewController implements Initializable {

    @FXML
    private ListView<Categoria> lvCategorias;
    
    private  List<Categoria> lista = new ArrayList<>();
    
    private ObservableList<Categoria> obCategorias;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        carregaLista();
    }    
    public void carregaLista()
    {
        Categoria c1 = new Categoria(1, "Comidas");
        Categoria c2 = new Categoria(2, "Bebidas");
        
        lista.add(c1);
        lista.add(c2);
        
        obCategorias = FXCollections.observableArrayList(lista);
        lvCategorias.setItems(obCategorias);
        
    }
}
