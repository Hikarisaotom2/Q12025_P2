/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg04022025;

/**
 *
 * @author claudiacortes
 */
    /*

    extends: nos ayuda a establecer herencia entre un padre y un hijo.
    siempre le corresponde al hijo, decir quien es su padre.
    */
                      // extends nombrePadre
public class Femenino extends Paciente {
    /*
        Por que no ponemos los atributos? 
        R// no queremos repetir codigo, al establecer la herencia los atributos seran prestados por el padre 
    */
     // información extra que nos interesa, cosas especificas 
    String fechaDeMamografia;
    String ultimoPeriodoMenstrual;
 

    public Femenino(String fechaDeMamografia, String ultimoPeriodoMenstrual, String nombre, String apellido, int edad, String enfermedadBase) {
        super(nombre, apellido, edad, enfermedadBase); // llamar al constructor del padre
        this.fechaDeMamografia = fechaDeMamografia;
        this.ultimoPeriodoMenstrual = ultimoPeriodoMenstrual;
        
    }
   
   
}
