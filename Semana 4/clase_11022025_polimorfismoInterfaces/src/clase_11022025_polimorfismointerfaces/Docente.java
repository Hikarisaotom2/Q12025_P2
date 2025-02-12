/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package clase_11022025_polimorfismointerfaces;

/**
 *
 * @author claudiacortes
 */

public interface Docente {
    String nombre ="";
    String apellido ="";
    // dentro de una interaz todos los metodos son abstractos 
    public void calcularSueldo();
//    public abstract void saludar(); el uso del abstract es opcional solamente dentro de las interfaces 
}
