/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_27012025;

/**
 *
 * @author claudiacortes
 */
public class Alumno {
    private int id;
    private String nombre;
    private String carrera;
    private String titulo;
    private boolean matriculaEspecial;
    private int descuento =0;
        /*
    1. normal 
        -> id, carrera, titulo, nombre,...
    2. especial 
        -> id, carrera, nombre....
    3. matricula para estudiante becado 
    
    
    4. matricula estudiante con descuento 
    */
    
    Alumno(int id, String nombre, String carrera){
        // constructor para matricula especial 
        this.id = id;
        this.nombre = nombre;
        this.carrera = carrera;
        this.matriculaEspecial = true;
    }
    
    
    Alumno(int id, String nombre, String carrera, String titulo){
        // constructor para matricula normal
        this.id = id;
        this.nombre = nombre;
        this.carrera = carrera;
        this.titulo = titulo;
        this.matriculaEspecial = false;
    }
    

    
}
