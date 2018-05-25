/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Clases {
    
    private String nombreClase;
    private ArrayList atributo= new ArrayList();
    
    
    public Clases() {
    }

    public Clases(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    public ArrayList getAtributo() {
        return atributo;
    }

    public void setAtributo(ArrayList atributo) {
        this.atributo = atributo;
    }

    
    public String TodotoString() {
        return   "Nombre Clase:" + nombreClase + "\n Atributo:" + atributo + '\n';
    }
    
    @Override
    public String toString() {
        return  nombreClase;
    }

   

    
    
    
    
    
    
    
}
