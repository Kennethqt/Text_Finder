/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.awt.event.MouseEvent;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;


/**
 *
 * @author User
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    public AnchorPane Contenedor;
    public AnchorPane Pantalla;
    public ScrollPane scroll;

    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");

    }
    public void Siguiente(ActionEvent even ){
        
        
        
        
    }
    
    public void put(){
        String raiz=RLU.getURL();
      //  String[] Botones = {"C:\\Users\\User\\Documents\\GitHub\\Text_Finder\\Proyecto2\\Archivos_texto\\txt\\Mera.txt","C:\\Users\\User\\Documents\\GitHub\\Text_Finder\\Proyecto2\\Archivos_texto\\txt\\Kenet.txt"};
        String[] Botones=Manejo_txt.Carpetas();
        float y=0;
        for (String a : Botones) {
           // System.out.println(a);
            Button but=new Button (); 
           // but.setOnMouseClicked(e -> Siguiente(e)); 
            but.setOnAction(e -> Siguiente(e));
            String[] Nombre=a.split("[\\.]");
            but.setId(Nombre[0]); 
            but.setText(Nombre[0]);
            but.setLayoutX(0); 
            but.setLayoutY(y); 
            but.setPrefSize(700,35); 
            but.setMinSize(300, 35); 
            y+=40;
            Contenedor.getChildren().add(but);   

        }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb){
        put();
            
    } 
        
        
}    
    

