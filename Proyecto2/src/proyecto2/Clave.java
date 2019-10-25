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
public class Clave {
    private String Archivo;
    private Integer valor;
    private Integer linea;
    private Integer ini;
    private String world;

    public Clave(String Archivo, Integer valor, Integer linea, Integer ini, String world) {
        this.Archivo = Archivo;
        this.valor = valor;
        this.linea = linea;
        this.ini = ini;
        this.world = world;
    }

    public String getArchivo() {
        return Archivo;
    }

    public void setArchivo(String Archivo) {
        this.Archivo = Archivo;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Integer getLinea() {
        return linea;
    }

    public void setLinea(Integer linea) {
        this.linea = linea;
    }

    public Integer getIni() {
        return ini;
    }

    public void setIni(Integer ini) {
        this.ini = ini;
    }

    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }
    
    
    
    
}
