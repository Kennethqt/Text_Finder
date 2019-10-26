/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.io.IOException;
import java.net.URISyntaxException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class Proyecto2 extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     * @throws java.net.URISyntaxException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws URISyntaxException, IOException {

      //  Arbol.preOrden();
      //  Arbol<Integer>arbol=Crear_Wtree.
       // String Direc="\\txt\\Mera.txt";
        Arbol<Integer>arbol=Crear_Wtree.ArbolW();
      //  String Plano="Arroz con pollo\n y maria";
        String Direc2="C:\\Users\\User\\Documents\\GitHub\\Text_Finder\\Proyecto2\\Archivos_texto\\mama.docx";
        
        //Arbol.search(6);
       // arbol.inOrden();
       arbol.inOrden();
       /**
       Lista<Clave>lista=arbol.search(RLU.Calcular("Pero")).getListaClaves();
       Nodo<Clave>aux=lista.getHead();
       while(aux!=null){
           System.out.println(aux.getDato().getArchivo());
           System.out.println(aux.getDato().getLinea());
           aux=aux.getNext();
        
       }*/
      // Manejo_txt.Actualizar_Archivo_docx(Direc2,Plano);
     // System.out.print(Manejo_txt.Leer_docx(Direc2));
     // Lista<String>lista2=Manejo_txt.spliting("[\\.]",Direc2);
     // lista2.print();
      //String raiz=RLU.getURL();
      //Lista<String>lista=Manejo_txt.spliting("[\\.]",Direc2 );
     // lista.print();
       //Lista<String>lista=Manejo_txt.spliting(" ", "mario y maria se quedaron solos");
       //lista.print();
       launch(args);
    }
    
}
