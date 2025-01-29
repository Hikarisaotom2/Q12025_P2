/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_28012025;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase {
    private String nombre;
    private String seccion;
    private ArrayList<Alumno> alumnos;

    public Clase(String nombre, String seccion) {
        this.nombre = nombre;
        this.seccion = seccion;
        this.alumnos = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    // crear un metodo para agregar un alumno nuevo a la lista actual de alumnos matriculados.
    public void matricuarAlumno(Alumno nuevoAlumno){
        alumnos.add(nuevoAlumno);
    }
    
    //Asistencia. 
   public void pasarLista(){
  
       Scanner entrada = new Scanner(System.in);
       for (int i = 0; i < alumnos.size(); i++) {
//           String nombre = alumnos.get(i).getNombre();
           Alumno alumno = alumnos.get(i);
           String nombre = alumno.getNombre();
           System.out.println(nombre);
           System.out.println("El alumno esta presente? 1. si, 2. no ");
           int presente = entrada.nextInt();
           /*
           verificar si el valor es 1 o 2 
           si el valor 1 , no aumentamos inasistencia 
           sino, aumentamos las faltas 
           */
       }
   }

    @Override
    public String toString() {
        return "Clase{" + "nombre=" + nombre + ", seccion=" + seccion + ", alumnos=" + alumnos + '}';
    }
    
    
    
    
    
}
