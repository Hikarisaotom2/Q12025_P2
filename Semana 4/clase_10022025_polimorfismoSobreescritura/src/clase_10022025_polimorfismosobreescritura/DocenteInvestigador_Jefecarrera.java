/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_10022025_polimorfismosobreescritura;

/**
 *
 * @author claudiacortes
 */
public class DocenteInvestigador_Jefecarrera extends Docente{
    private double sueldoMensual;
    private double bono;

    public DocenteInvestigador_Jefecarrera(double sueldoMensual, double bono, String nombre, String apellido, String titulo, String titulosAdicionales, int numTalento) {
        super(nombre, apellido, titulo, titulosAdicionales, numTalento);
        this.sueldoMensual = sueldoMensual;
        this.bono = bono;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    @Override
    public void calcularSueldo() {
       double pagoTotal = this.sueldoMensual + this.bono;
       double impuesto; 
       if(pagoTotal >=18000 && pagoTotal <= 35999.99){
           impuesto = pagoTotal*0.15;
       }else if(pagoTotal >=36000 && pagoTotal <= 49999.99){
           impuesto = pagoTotal*0.20;
       }else if(pagoTotal>=50000){
           impuesto = pagoTotal*0.30;
       }else{
           impuesto = 0;
       }
       
       double deducciones = 500 + 300 +impuesto;
       
       double pagoNeto = pagoTotal - deducciones;
       
        System.out.println("PAGO DEL MES            "+pagoTotal);
        System.out.println("DEDUCCIONES             \n -> impuesto          "+ impuesto);
        System.out.println("TOTAL DEDUCCIONES:          "+deducciones);
        System.out.println("PAGO NETO MENSUAL:              "+pagoNeto);
    }

    
    
    
    
}
