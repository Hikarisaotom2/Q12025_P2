/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_11022025_polimorfismoclasesabstractas;

/**
 *
 * @author claudiacortes
 */
public abstract class Docente {
    protected String nombre;
    protected String apellido;
    protected String titulo; 
    protected String titulosAdicionales;
    protected int numTalento;

    public Docente(String nombre, String apellido, String titulo, String titulosAdicionales, int numTalento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.titulosAdicionales = titulosAdicionales;
        this.numTalento = numTalento;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulosAdicionales() {
        return titulosAdicionales;
    }

    public void setTitulosAdicionales(String titulosAdicionales) {
        this.titulosAdicionales = titulosAdicionales;
    }

    public int getNumTalento() {
        return numTalento;
    }

    public void setNumTalento(int numTalento) {
        this.numTalento = numTalento;
    }
    
    // Metodo abstracto: es un metodo que no tiene cuerpo;
    public  abstract void calcularSueldo();

    @Override
    public String toString() {
        return "Docente{" + "nombre=" + nombre + ", apellido=" + apellido + ", titulo=" + titulo + ", titulosAdicionales=" + titulosAdicionales + ", numTalento=" + numTalento + '}';
    }
    
    
}