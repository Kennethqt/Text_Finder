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
public class NodoArbol<T extends Comparable<T>> {
       /* Declaraciones de variables */
    private T valor;

    private NodoArbol<T> padre;
    private NodoArbol<T> left;
    private NodoArbol<T> right;

    /* Constructor */
    public NodoArbol(){
        this.valor=null;
    }
    public NodoArbol(T valor) {
        this.valor = valor;
    }

    /* Setters y Getters */
    public void setValor(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public NodoArbol<T> getPadre() {
        return padre;
    }

    public void setPadre(NodoArbol<T> padre) {
        this.padre = padre;
    }

    public NodoArbol<T> getLeft() {
        return left;
    }

    public void setLeft(NodoArbol<T> hojaIzquierda) {
        this.left = hojaIzquierda;
    }

    public NodoArbol<T> getRight() {
        return right;
    }

    public void setRight(NodoArbol<T> hojaDerecha) {
        this.left = hojaDerecha;
    }
    
}
