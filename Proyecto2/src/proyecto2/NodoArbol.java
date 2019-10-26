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
    private String world;
    private Lista<Clave> listaClaves=new Lista<>();

    private NodoArbol<T> padre;
    private NodoArbol<T> left;
    private NodoArbol<T> right;

    /* Constructor */
    public NodoArbol(){
        this.valor=null;
        this.listaClaves=new Lista<>();
        this.world=null;
    }
    public NodoArbol(T valor) {
        this.valor = valor;
        this.listaClaves=new Lista<>();
        this.world=null;
    }
    

    public NodoArbol(T valor,Clave Claves,String world) {
        this.valor = valor;
        this.listaClaves.addFirst(Claves);
        this.world=world;
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
        this.right = hojaDerecha;
    }

    public Lista<Clave> getListaClaves() {
        return listaClaves;
    }

    public void setListaClaves(Lista<Clave> listaClaves) {
        this.listaClaves = listaClaves;
    }

    public void setClave(Clave clave){
        this.listaClaves.addFirst(clave);
    }

    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }
    
    
}
