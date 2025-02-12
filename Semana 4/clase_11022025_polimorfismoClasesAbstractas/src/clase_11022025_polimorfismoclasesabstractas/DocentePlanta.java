/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_11022025_polimorfismoclasesabstractas;

/**
 *
 * @author claudiacortes
 */
public class DocentePlanta extends Docente{
    private double sueldoMensual;
    
    public DocentePlanta(double sueldoMensual, String nombre, String apellido, String titulo, String titulosAdicionales, int numTalento) {
        super(nombre, apellido, titulo, titulosAdicionales, numTalento);
        this.sueldoMensual = sueldoMensual;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }
    
   @Override
    public void calcularSueldo(){
       double deducciones = 500+320.98;
       double sueldoNeto = sueldoMensual-deducciones;
        System.out.println("BOLETA DE PAGO: ");
        System.out.println("-> sueldo base "+sueldoMensual );
        System.out.println("-> deducciones: "+ deducciones);
        System.out.println("-> SUELDO NETO: "+sueldoNeto );
    }
    
    
}
