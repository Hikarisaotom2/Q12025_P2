/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg04022025;

/**
 *
 * @author claudiacortes
 */
public class Paciente {
    /*
    private 
    public 
    protected : 
    */
    protected String nombre;
    protected String apellido;
    protected int edad; 
    protected String enfermedadBase;
    

    public Paciente(String nombre, String apellido, int edad, String enfermedadBase) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.enfermedadBase = enfermedadBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEnfermedadBase() {
        return enfermedadBase;
    }

    public void setEnfermedadBase(String enfermedadBase) {
        this.enfermedadBase = enfermedadBase;
    }

    @Override
    public String toString() {
        return "Paciente{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", enfermedadBase=" + enfermedadBase + '}';
    }
    

}
