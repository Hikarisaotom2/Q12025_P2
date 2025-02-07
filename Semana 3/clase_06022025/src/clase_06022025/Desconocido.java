/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_06022025;

import java.util.Random;

/**
 *
 * @author claudiacortes
 */
public class Desconocido extends Producto{
    private String descripcion;

    public Desconocido(String descripcion, String nombre, Double precio) {
        super(nombre, precio);
        this.descripcion = descripcion;
    }

    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public double getPrecioDescuento(){
        Random random = new Random();
        double descuento = random.nextInt(5, 50)/100;
        return precio - (precio*descuento);
    }

    @Override
    public String toString() {
        return "Desconocido{" + "descripcion=" + descripcion + '}';
    }
    
    
}
