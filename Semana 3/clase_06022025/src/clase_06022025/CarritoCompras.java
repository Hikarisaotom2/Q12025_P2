/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_06022025;

import java.util.ArrayList;

/**
 *
 * @author claudiacortes
 */
public class CarritoCompras {
    private double dineroDisponible;
    private ArrayList<Producto> compras;

    public CarritoCompras(double dineroDisponible) {
        this.dineroDisponible = dineroDisponible;
        this.compras = new ArrayList();
    }

    public double getDineroDisponible() {
        return dineroDisponible;
    }

    public void setDineroDisponible(double dineroDisponible) {
        this.dineroDisponible = dineroDisponible;
    }

    public ArrayList<Producto> getCompras() {
        return compras;
    }

//    public void setCompras(ArrayList<Producto> compras) {
//        this.compras = compras;
//    }
    
    public void agregarProducto(Producto nuevoProducto){
        this.compras.add(nuevoProducto);
        
    }
    
    public void pagar(){
        /*
          Nota: al momento de pagar el dia de hoy,
        hay una promoción en el super mercado. 
        al comprar productos de limpieza, estos tienen und escuento del 15% 
        al comprar un productos comestible tenemos un descuento del 5%
        los productos desconocidos tendran un descuento aleatorio de  5% - 50%
        */
        // si no hay dinero suficiente para agar informar al usuario 
        double subTotal = 0.0;
        System.out.println(".....FACTURA.....");
        for (Producto producto : compras) {
            if(producto instanceof Combestible){
                 Combestible nuevo = (Combestible)producto;
                 subTotal += nuevo.getPrecioDescuento();
                 System.out.println(nuevo.getNombre() +" . -> "+ nuevo.getPrecioDescuento());
            }else if(producto instanceof Limpieza){
                Limpieza nuevo = (Limpieza) producto;
                subTotal+= nuevo.getPrecioDescuento();
                System.out.println(nuevo.getNombre() +" . -> "+ nuevo.getPrecioDescuento());
            }else{
                Desconocido nuevo = (Desconocido) producto;
                subTotal+= nuevo.getPrecioDescuento();
                System.out.println(nuevo.getNombre() +" . -> "+ nuevo.getPrecioDescuento());
            }
        }
        
        double total = subTotal + (subTotal*0.15);
        System.out.println("SUBTOTAL:           " +subTotal);
        System.out.println("TOTAL:           " +total);
    }

    @Override
    public String toString() {
        String compras = "";
        for (int i = 0; i < this.compras.size(); i++) {
            compras+= i+") "+this.compras.get(i).toString()+"\n";
        }
        return "dineroDisponible=" + dineroDisponible + "\n "+compras ;
    }    
}
