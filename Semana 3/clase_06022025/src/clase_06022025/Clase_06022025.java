/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_06022025;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_06022025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
       mini supermercado 
        -> crear productos  (Padre)
            -> comestibles  (Hijo)
            -> limpieza     (Hijo)
            -> desconocido  (Hijo)
        Nota: todos los productos tiene 
        nombre , un precio 
        los productos comestibles tienen una fecha de preferencia de consumo , fecha vencimiento y de creacion 
        los productos de limpieza fecha de elaboracion y vencimiento 
        los otros productos tiene una descripción 
        
        -> listar los productos 
        -> eliminar productos 
        -> comparar productos   
        -> pagar productos 
        
        Nota: al momento de pagar el dia de hoy, hay una promoción en el super mercado. 
        al comprar productos de limpieza, estos tienen und escuento del 15% 
        al comprar un productos comestible tenemos un descuento del 5%
        los productos desconocidos tendran un descuento aleatorio de  5% - 50%
         */

 /*
      Producto
      Limpieza 
      comestible
      desconocido
      Carrito ( dinero y lista de productos a comprar) *Clase compuesta
         */
        boolean bandera = true;
        Scanner entrada = new Scanner(System.in);
        ArrayList<Producto> productos = new ArrayList();
        CarritoCompras carrito = new CarritoCompras(3000.5);
        while (bandera) {
            System.out.println("1. crear producto");
            System.out.println("2. listar productos");
            System.out.println("3. eliminar producto");
            System.out.println("4. agregar al carrito de compra");
            System.out.println("5. pagar compras");
            int op = entrada.nextInt();
            switch (op) {
                case 1 -> {
//                    Producto nuevo = crearProducto();
//                    productos.add(nuevo);
                    productos.add(crearProducto());
                }
                case 2 -> {
                    listarProducto(productos);
                }
                case 3 -> { // eliminar 

                }
                case 4 -> {
                    listarProducto(productos);
                    System.out.println("Que producto desea agregar al carrito de compras: ");
                    int pos = entrada.nextInt();
//                    Producto nuevoProducto = productos.get(pos);
//                    carrito.agregarProducto(nuevoProducto);
                    carrito.agregarProducto(productos.get(pos));
                    System.out.println(carrito);
                }
                case 5 -> {
                     carrito.pagar();
                }
                default -> {
                    bandera = false;
                }
            }
        }
    }
    
    public static void listarProducto(ArrayList<Producto> productos){
        //        for (int i = 0; i < productos.size(); i++) {
//            Producto producto = productos.get(i);
//        }

        for (Producto producto : productos) {
            System.out.println(producto);
        }
        
    }
    public static Producto crearProducto() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el precio del producto:");
        double precio = entrada.nextDouble();
        System.out.println("Cual es el tipo de producto: \n 1. comestibles \n 2. limpieza  \n 3. Desconocido");
        int tipo = entrada.nextInt();
        /*
       1) crear una variable producto y asignarle un valor en cada case 
       2) hacer un return en cada case 
         */
//       Producto nuevo;
        switch (tipo) {
            case 1 -> { // comestibles
                System.out.println("Ingrese fecha de consumo");
                entrada.nextLine();
                String fechaConsumo = entrada.nextLine();
                System.out.println("Ingrese fecha de vencimiento");
                String fechaVencimiento = entrada.nextLine();
                System.out.println("Ingrese fecha de elaboracion");
                String fechaElab = entrada.nextLine();
                Combestible producto = new Combestible(fechaVencimiento, fechaElab, fechaConsumo, nombre, precio);
                return producto;
//                return new Combestible(fechaVencimiento,fechaElab,fechaConsumo, nombre,precio);
//                nuevo = producto;
            }
            case 2 -> { // limpieza
                System.out.println("Ingrese fecha de vencimiento");
                entrada.nextLine();
                String fechaVencimiento = entrada.nextLine();
                System.out.println("Ingrese fecha de elaboracion");
                String fechaElab = entrada.nextLine();
                Limpieza producto = new Limpieza(fechaVencimiento, fechaElab, nombre, precio);
//                nuevo = producto;
                return producto;
            }
            default -> { // desconocido
                System.out.println("Ingrese una descripcion");
                String descrp = entrada.nextLine();
                Desconocido producto = new Desconocido(descrp, nombre, precio);
//               nuevo = producto;
                return producto;
            }
        }
//       return nuevo ;
    }

}
