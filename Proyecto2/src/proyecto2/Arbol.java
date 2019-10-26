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
    private int len;
    
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
    

    private NodoArbol<T> insert_aux(T dato, NodoArbol<T> current,Clave nueva){
            
           // System.out.print(3);
            //System.out.println(nueva.getWorld());
            if (current==null) {
                    len++;

                    //7NodoArbol<T>nuevo=new NodoArbol<>();
                    //nuevo.setClave(nueva);
                    //nuevo.setValor(dato);
                    
                    //System.out.println(nueva.getValor());
                   // nuevo.setWorld(nueva.getWorld());
                    //System.out.println("se inserto");
                    if(nueva==null){
                     return new NodoArbol<>(dato);   
                    }else{
                    return new NodoArbol<>(dato,nueva,nueva.getWorld());
                    }
            }if (dato.compareTo(current.getValor())<0) {
                    current.setLeft(insert_aux(dato,current.getLeft(),nueva));
            }else if (dato.compareTo(current.getValor())>0){
                    current.setRight(insert_aux(dato,current.getRight(),nueva));
            }else if(dato.compareTo(current.getValor())==0){
                    current.setClave(nueva);
            }return current;
            
    }
   // public void insert()
    public void insert( T nodo , Clave nueva) {
        //System.out.println(nueva.getWorld());
        this.insert_aux( nodo , this.raiz ,nueva);
    }
    
    public void insert2(T dato){
        this.insert_aux(dato,this.raiz,null);
    }
    
    public void preOrden() {
            preOrden(this.raiz);
    }
    private void preOrden(NodoArbol<T> temp){
            if (temp != null) {
                    
                System.out.print(temp.getValor()+"\n");
                preOrden(temp.getLeft());
                preOrden(temp.getRight());
            }
    }
    public void inOrden() {
            inOrden1(this.raiz);
    }
    private void inOrden1(NodoArbol<T> temp) {
       // System.out.print("AMMADNJRNFVKNRKNCKKRFMJFNKRMFRKFN");
        //System.out.print(temp);
            if (temp != null) {
                inOrden1(temp.getLeft());
                System.out.print(temp.getValor()+",");
                inOrden1(temp.getRight());
            }
    }
    public void postOrden() {
            postOrden(this.raiz);
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
            if (dato.compareTo(temp.getValor())==0) {
                    return temp;
            }else if (dato.compareTo(temp.getValor())< 0) {
                //System.out.println(temp.getValor());
                return temp.getValor()==null? null:buscarDato_aux(dato,temp.getLeft());
            }else{
                //System.out.println(temp.getValor());
                return temp.getRight()==null? null:buscarDato_aux(dato,temp.getRight()); 
                
            }
    }
}
    
    
    
    


