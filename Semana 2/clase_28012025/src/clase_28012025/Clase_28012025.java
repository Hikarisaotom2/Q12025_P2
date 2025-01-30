/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_28012025;

import java.util.ArrayList;

/**
 *
 * @author claudiacortes
 */
public class Clase_28012025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno juan = new Alumno("Juan","Perez",123,"ing.datos");
        Alumno maria = new Alumno("Maria","Perez",124,"ing.sistemas");
        Alumno pedro = new Alumno("Pedro","Gomez",125,"ing.sistemas");
        
        Clase programacion = new Clase("Programacion 2", "123");
        programacion.matricuarAlumno(juan);/*pasar las direcciones del objeto*/
        programacion.matricuarAlumno(maria);
        programacion.matricuarAlumno(pedro);
        System.out.println(programacion);
        
        programacion.pasarLista();
        
        System.out.println("Verificando si los dats se actualizaron automaticamente: ");
        System.out.println(juan);
        System.out.println(maria);
        System.out.println(pedro);
        

        System.out.println("Actualizando el nombre de juan: ");
        juan.setNombre("Alejandro");
        System.out.println(programacion);
        
        
        /*
        INCORRECTO
        */
        
         Alumno a = new Alumno("Pedro","Gomez",125,"ing.sistemas");// guardado en algun lugar 
        Clase programacion2 = new Clase("Programacion 2", "123");
        //cada vez que se hace new, se crea un objeto completamente nuevo y se guarda en algun lugar
        Alumno b = new Alumno(a.getNombre(),a.getApellido(),a.getCuenta(),a.getCarrera());
        programacion2.matricuarAlumno(b);
        programacion2.pasarLista();
        
        System.out.println("El num de id de a "+ a.hashCode());
        System.out.println("El num de id de b "+ b.hashCode());
        
        Alumno buscar = b;
                //Ejemplo 2:
        
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        
        alumnos.add(b);
        alumnos.add(a);
        
        // id o el nombre 
        
        boolean objetomalo = alumnos.contains(new Alumno("nombre","",122,"")); // -> a.hashCode() === buscar.hasCode();
        
        System.out.println(objetomalo);
        
        boolean objetoBueno = alumnos.contains(buscar);
        System.out.println(objetoBueno);
        

    }
    
}
