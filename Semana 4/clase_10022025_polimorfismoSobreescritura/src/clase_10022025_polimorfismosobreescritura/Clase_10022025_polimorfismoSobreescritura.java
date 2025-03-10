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
            4. El hijo puede o no decicidir si implementar el polimorfismo, 
                ES OPCIONAL QUE HAGAMOS EL METODO
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
                        -> 18000 >= 15 % 
                        -> 36000 => 20%
                        -> 50000=> 30%
                 
        */
       
       
       Docente d = new Docente("Juan", "Perez", "sistemas", "sistemas", 123);
       Docente planta = new DocentePlanta(10000,"Martin", "Galvez", "sistemas", "sistemas", 123);
       Docente hora = new DocenteHora(5,10000,"Claudia", "Cortes", "sistemas", "sistemas", 123);
       Docente jefe = new DocenteInvestigador_Jefecarrera(70000,7000,"Reynod", "Bocanegra", "sistemas", "sistemas", 123);
        System.out.println("CALCULO DE SUELDOS");
        System.out.println("Docente planta");
        planta.calcularSueldo();
        System.out.println("Docente Hora");
        hora.calcularSueldo();
        System.out.println("Docente investigador / jefe");
        jefe.calcularSueldo();
    }
    
}
