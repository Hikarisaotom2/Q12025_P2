/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_10022025_polimorfismosobreescritura;

/**
 *
 * @author claudiacortes
 */
public class Clase_10022025_polimorfismoSobreescritura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        polimorfismo por sobrescritura simple:
            1.  realizar la herencia con normalidad
            2. Identificar el metodo delpadre que qqueremos cambiar 
            3. Recordar y respetar a definición del metodo como esta en el padre. 
        */
       /*
        DOCENTES (PADRE)
        PLANTA  (HIJA)
        HORA (HIJA)
        INVESTIGADORES (HIJA) 
            -> Mini sistema de docentes 
                1) listar los docentes actualmente creados 
                2) crear nuevos docentes. 
                3) calcular el pago mensual del docente 
                4) eliminar un docente. 
        
        
            -> docentes planta
                -> Sueldo fijo ( todoslos meses ganàlo mismo). 
                -> deducciones: 
                    -> IHSS, RAP. 
            -> docentes hora catedra
                -> pago por clase, 
                -> deducciones: 
                    -> ISR (12.5% )
            -> Docentes investigadores / jefes carrera 
                -> pago fijo mensual 
                -> bonos 
                -> IHSS, RAP, ISR 
                 
        */
       
       
       Docente d = new Docente("Claudia", "Cortes", "sistemas", "sistemas", 123);
       Docente p = new DocentePlanta(10000,"Claudia", "Cortes", "sistemas", "sistemas", 123);
       
       d.calcularSueldo();
       
       p.calcularSueldo();
    }
    
}
