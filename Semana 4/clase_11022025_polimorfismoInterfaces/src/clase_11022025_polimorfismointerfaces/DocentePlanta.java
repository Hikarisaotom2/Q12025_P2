/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_11022025_polimorfismointerfaces;

/**
 *
 * @author claudiacortes
 */
public class DocentePlanta extends ClaseDocente implements Docente{
    private double sueldo;

    public DocentePlanta(double sueldo, String nombre) {
        super(nombre);
        this.sueldo = sueldo;
    }
    
    
    @Override 
    public void calcularSueldo(){
    }
    
}
