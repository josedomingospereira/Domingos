
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package javafxbasico;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafxbasico.model.Categoria;

/**
 * FXML Controller class
 *
 * @author Domingos
 */
public class FXMLComboBoxController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private ComboBox<Categoria> cbCategorias;
    @FXML
    private void pegarComboBox(){
        Categoria categoria = cbCategorias.getSelectionModel().getSelectedItem();
        System.out.println("ID: "+categoria.getId()+"   Nome: "+categoria.getNome());
        
    }
    private List<Categoria> categorias = new ArrayList<>();
    private ObservableList<Categoria> obsCategorias;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        carregarCategorias();
    }   
    
    private void carregarCategorias()
    {
        Categoria categoria1 = new Categoria(1, "Pedido");
        Categoria categoria2 = new Categoria(2, "Venda");
        categorias.add(categoria1);
        categorias.add(categoria2);
        obsCategorias = FXCollections.observableArrayList(categorias);
        cbCategorias.setItems(obsCategorias);
    }        
    
}
