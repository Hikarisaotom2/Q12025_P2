/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_11022025_polimorfismoclasesabstractas;

/**
 *
 * @author claudiacortes
 */
public class Clase_11022025_polimorfismoClasesAbstractas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Polimorfismo por clases abstractas.
        1. Crear herencia con normalidad.
        2. Identificar cual es el metodo al que queremos aplicar polimorfismo.
        3. Modificar el metodo y convertirlo en un metodo abstracto 
        4. Modificar la clase y volverla abstracta. 
        5. Implementar el metodo polimorfico en el hijo.
            El hijo esta OBLIGADO a implementar el polimorfismo. 
        
        Clase abstracta: Clase comun y corriente, posee metodos abstractos.
        Las clases abstractas NO se pueden instanciar 
        
        NOTA: una clase normal NO puede contener metodos abstractos. 
        */
        
        // 1. validar o asegurarnos de ue todos los hijos agegan su propia definicion polimorfica .
        // 2 . donde no sea necesario crear objetos del tipo padre 
        
        Docente d = new DocentePlanta(10000,"a","a","sistemas","",123);
        d.calcularSueldo();
        
 
    }
    
}
