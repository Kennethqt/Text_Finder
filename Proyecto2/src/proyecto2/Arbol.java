/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

/**
 *
 * @author User
 * @param <T>
 */
public class Arbol<T extends Comparable<T>> {
     /* Atributos */
    private NodoArbol<T> raiz;

    /**
     *
     */
    public int len;
    
    public Arbol() {
        this.len = 0;
        this.raiz = null;
    }
    /* Contructories */    
  
    public Arbol( T valor ) {
        this.len = 0;
        this.raiz = new NodoArbol<>( valor );
    }

    public Arbol( NodoArbol<T> raiz ) {
        this.len = 0;
        this.raiz = raiz;
    }

    /* Setters y Getters */
    public NodoArbol<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoArbol<T> raiz) {
        this.raiz = raiz;
    }
    

    private NodoArbol<T> insert(T dato, NodoArbol<T> current){
            if (current==null) {
                    len++;
                    return new NodoArbol<>(dato);
            }if (dato.compareTo(current.getValor())<0) {
                    current.setLeft(insert(dato,current.getLeft()));
            }else if (dato.compareTo(current.getValor())>0){
                    current.setRight(insert(dato,current.getRight()));
            }return current;
    }

    public void inserter( T nodo ) {
        this.insert( nodo , this.raiz );
    }
    
    public void preOrden() {
            preOrden(raiz);
    }
    private void preOrden(NodoArbol<T> temp){
            if (temp != null) {
                    System.out.print(temp.getValor()+"\n");
                    preOrden(temp.getLeft());
                    preOrden(temp.getRight());
            }
    }
    public void inOrden() {
            inOrden1(raiz);
    }
    private void inOrden1(NodoArbol<T> temp) {
            if (temp != null) {
                    inOrden1(temp.getLeft());
                    System.out.print(temp.getValor()+",");
                    inOrden1(temp.getRight());
            }
    }
    public void postOrden() {
            postOrden(raiz);
    }
    private void postOrden(NodoArbol<T> temp) {
            if (temp != null) {
                    postOrden(temp.getLeft());
                    postOrden(temp.getRight());
                    System.out.print(temp.getValor()+"\n");
            }
    }
    
    public NodoArbol<T> search(T dato) {
            return buscarDato_aux(dato,raiz);
    }
    private NodoArbol<T> buscarDato_aux(T dato, NodoArbol<T> temp) {
            if (temp.getValor().equals(dato)) {
                    return temp;
            }else if (dato.compareTo(temp.getValor())< 0) {
                    return temp.getValor()==null? null:buscarDato_aux(dato,temp.getLeft());
            }else{
                    return temp.getRight()==null? null:buscarDato_aux(dato,temp.getRight()); 
            }
    }
}
    
    
    
    


