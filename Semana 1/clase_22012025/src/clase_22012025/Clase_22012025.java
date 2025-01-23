/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_22012025;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_22012025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
    Create
    Read
    Update
    Delete
         */

 /*
    CRUD -> libros
         */
 /*
    Clase != objeto
    -> crear nuevos tipos de datos 
    -> Aunque la clase no tega nada, desde que la creamos es un tipo de dato valido para java.
         */
        Libro miLibroFavorito = new Libro("El principito", 1958, "Antonhy");
        System.out.println(miLibroFavorito);

        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;
        ArrayList <Libro> listaLibros= new ArrayList<Libro>();
        
        while (continuar) {
            System.out.println("Bienvenido/a");
            System.out.println("1.  crear");
            System.out.println("2. listar ");
            System.out.println("3. actualizar");
            System.out.println("4. borrar");
            System.out.println("5. salir ");
            System.out.println("Ingrese una opción:");
            int op = entrada.nextInt();
            switch (op) {
                case 1 -> {
                    Libro  nuevo = crearLibro();
                    listaLibros.add(nuevo);
                    // eslo mismo que las lineas anteriores
                    //listaLibros.add(crearLibro());
                }
                case 2 -> {

                }
                case 3 -> {

                }
                case 4 -> {

                }
                case 5 -> {
                    continuar= false;
                }

                default -> {

                }
            }
        }

    }

    // un método que retorna un libro 
    public static Libro crearLibro(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del libro");
        String titulo = entrada.nextLine();
        System.out.println("Ingrese el nombre del autor");
        String autor = entrada.nextLine();
        System.out.println("Ingrese el año de publicacion");
        int anio = entrada.nextInt();
     
//        Libro nuevo = new Libro(titulo,anio,autor);
//        return nuevo;
        return new Libro(titulo,anio,autor);
    }
    // un método que recibe un libro como param
    public static void mostrarInformacion(Libro libroMostrar) {

    }

}
