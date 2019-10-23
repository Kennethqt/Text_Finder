/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import static proyecto2.Sorted.radixsort;

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
     */
    public static void main(String[] args) {
        Lista<Integer> lista=new Lista<>();
        lista.addFirst(16);
        lista.addFirst(0);
        lista.addFirst(7);
       // lista.addFirst(3);
        lista.addFirst(2);
        lista.addFirst(1);
        lista.addFirst(14);
        lista.addFirst(9);
        lista.addFirst(4);
       // lista.addFirst(5);
        lista.addFirst(10);
        lista.addFirst(6);
        lista.addFirst(8);
        
        System.out.println();
        //Sorted.bubbleSort(lista);
       // Sorted.quickSort(lista);
        //Sorted.selectionSort(lista);
        Sorted.radixsort(lista);


        lista.print();
        
        launch(args);
    }
    
}
