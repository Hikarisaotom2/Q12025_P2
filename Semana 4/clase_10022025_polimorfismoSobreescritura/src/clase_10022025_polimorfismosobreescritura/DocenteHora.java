/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_10022025_polimorfismosobreescritura;

/**
 *
 * @author claudiacortes
 */
public class DocenteHora extends Docente{
    private int cantidadClases;
    private double pagoPorClase;

    public DocenteHora(int cantidadClases, double pagoPorClase, String nombre, String apellido, String titulo, String titulosAdicionales, int numTalento) {
        super(nombre, apellido, titulo, titulosAdicionales, numTalento);
        this.cantidadClases = cantidadClases;
        this.pagoPorClase = pagoPorClase;
    }

    public int getCantidadClases() {
        return cantidadClases;
    }

    public void setCantidadClases(int cantidadClases) {
        this.cantidadClases = cantidadClases;
    }

    public double getPagoPorClase() {
        return pagoPorClase;
    }

    public void setPagoPorClase(double pagoPorClase) {
        this.pagoPorClase = pagoPorClase;
    }

    @Override
    public void calcularSueldo() {
        double pagoSubtotal = this.cantidadClases * this.pagoPorClase;
        double deduccion = pagoSubtotal *0.125;
        double total = pagoSubtotal-deduccion;
        System.out.println(" -> SUB TOTAL         "+pagoSubtotal);
        System.out.println("-> DEDUCCIONES          "+deduccion);
        System.out.println("->TOTAL                 "+total);
    }
    
    
    
    
}
