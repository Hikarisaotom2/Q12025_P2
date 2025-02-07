/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_06022025;

/**
 *
 * @author claudiacortes
 */
public class Limpieza extends Producto{
    
   private String fechaVencimiento;
    private String fechaElaboracion;

    public Limpieza(String fechaVencimiento, String fechaElaboracion, String nombre, Double precio) {
        super(nombre, precio);
        this.fechaVencimiento = fechaVencimiento;
        this.fechaElaboracion = fechaElaboracion;
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
    
    public double getPrecioDescuento(){
        return precio - (precio*0.15);
    }

    @Override
    public String toString() {
        return "Limpieza{" + "fechaVencimiento=" + fechaVencimiento + ", fechaElaboracion=" + fechaElaboracion + '}';
    }  
    
}
