/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_28012025;

/**
 *
 * @author claudiacortes
 */
public class Alumno {
    private String nombre;
    private String Apellido;
    private int cuenta;
    private int faltas;
    private String carrera;

    public Alumno(String nombre, String Apellido, int cuenta,String carrera) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.cuenta = cuenta;
        this.faltas = 0;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", Apellido=" + Apellido + ", cuenta=" + cuenta + ", faltas=" + faltas + ", carrera=" + carrera + '}';
    }
    
}
