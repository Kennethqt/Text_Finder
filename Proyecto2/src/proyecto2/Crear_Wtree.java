/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.net.URISyntaxException;

/**
 *
 * @author User
 */
public class Crear_Wtree {
    
    public static Arbol<Integer> ArbolW() throws URISyntaxException{
        Arbol<Integer>arbol=new Arbol<>();
        String raiz=RLU.getURL();
        Lista<String> Direcciones=Manejo_txt.L_split(raiz+"\\Direcciones.txt");
        Nodo<String> aux= Direcciones.getHead();
        while(aux !=null){
            //System.out.println(aux.getDato());
            Lista<String> Archivo_actual =Manejo_txt.L_split(raiz+aux.getDato());
            Nodo<String> aux2= Archivo_actual.getHead();
            Integer linea=0;
            Integer ini=0;
            while (aux2!=null){
                Lista<String>palabras=Manejo_txt.spliting("[\\ ,.:;]",aux2.getDato());
                Nodo<String>aux3=palabras.getHead();
                while(aux3!=null){
                    //System.out.println(aux3.getDato());
                    Clave nueva=new Clave(aux.getDato(),RLU.Calcular(aux3.getDato()),linea,ini,aux3.getDato());
                   // System.out.println(nueva.getIni());
                    arbol.insert(RLU.Calcular(aux3.getDato()), nueva);
                    ini++;
                    aux3=aux3.getNext();
                }
                
                linea++;
                ini=0;
                aux2=aux2.getNext();
            }
            
            
            aux=aux.getNext();          
        }return arbol;
    }

    
}
