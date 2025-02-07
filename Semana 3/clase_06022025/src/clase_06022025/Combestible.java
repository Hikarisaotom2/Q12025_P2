/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_06022025;

/**
 *
 * @author claudiacortes
 */
public class Combestible extends Producto{
    private String fechaVencimiento;
    private String fechaElaboracion;
    private String fechaConsumoPreferente;

    public Combestible(String fechaVencimiento, String fechaElaboracion, String fechaConsumoPreferente, String nombre, Double precio) {
        super(nombre, precio); //llamar al constructor del padre
        this.fechaVencimiento = fechaVencimiento;
        this.fechaElaboracion = fechaElaboracion;
        this.fechaConsumoPreferente = fechaConsumoPreferente;
    }

 

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFechaElaboracion() {
        return fechaElaboracion;
    }

    public void setFechaElaboracion(String fechaElaboracion) {
        this.fechaElaboracion = fechaElaboracion;
    }

    public String getFechaConsumoPreferente() {
        return fechaConsumoPreferente;
    }

    public void setFechaConsumoPreferente(String fechaConsumoPreferente) {
        this.fechaConsumoPreferente = fechaConsumoPreferente;
    }
    
    public double getPrecioDescuento(){
        return precio - (precio*0.05);
    }

    @Override
    public String toString() {
        return "Combestible{" + "fechaVencimiento=" + fechaVencimiento + ", fechaElaboracion=" + fechaElaboracion + ", fechaConsumoPreferente=" + fechaConsumoPreferente + '}';
    }
    
    
    
    
}
