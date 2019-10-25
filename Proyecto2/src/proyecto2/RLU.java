/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

/**
 *
 * @author User
 */
public class RLU {   
    public static String getURL(){ 
        return "C:\\Users\\User\\Documents\\GitHub\\Text_Finder\\Proyecto2\\Archivos_texto";
    } 
    
    
    
    public static Integer Calcular(String world){
        Integer Valor=0;
        char[] Abecedario={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] Abecedario2={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};  
        Lista<Character> lista1=new Lista<>();        
        Lista<Character> lista2=new Lista<>();
        for (char a : Abecedario) {
            lista1.addFirst(a);
        } 
        for (char a : Abecedario2) {
            lista2.addFirst(a);
        } 
        for (int i=0;i<world.length()-1;i++){
            if(lista1.pos(world.charAt(i))>-1){
                Valor=(Valor*100)+(lista1.pos(world.charAt(i))+1);     
            }else{
                Valor=(Valor*100)+(lista2.pos(world.charAt(i))+1); 
            }
                     
        }
        return Valor;
    }
    
}
