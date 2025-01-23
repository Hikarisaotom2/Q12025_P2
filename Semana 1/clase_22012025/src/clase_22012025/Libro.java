/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_22012025;

/**
 *
 * @author claudiacortes
 */
            // case sensitive -> hace diferencia entre mayus y minus 
public class Libro {
   // atributos
    private String titulo;
    private int anioPublicacion;
    private String  autor;
    
    /*
    Constructores -> cargado/ vacio 
    Metodos ->  setters/getters
    Atributos  -> información o las caracteristicas 
    
     1. atributos 
     2. metodos 
        2.1 constructores  (metodos especiales)
        2.2 setters/getters
    */
    
    // constructor vacio 
     Libro (){
         this.titulo = "";
         this.anioPublicacion=2025;
         this.autor ="";
         
     }

    public Libro(String titulo, int anioPublicacion, String autor) {
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public  void  mostrarMensaje(){
        System.out.println("Este es otro metodo");
    }
   
    // toString: 
    // metoodd especial que nos ayuda a mostrar la informacion del objeto, en el formato que nosostros querramos
    // Override es obligatoria , no se pueden modificar los parametros ni el nombre
    @Override
    public String toString() {
//        mostrarMensaje();
        return this.titulo+ " - "+ this.autor;
    }
}
