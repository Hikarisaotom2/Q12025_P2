/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_21012025;

/**
 *
 * @author claudiacortes
 */
public class Clase_21012025 {

    /**
     * @param args the command line arguments
     */
    
    public static int variableglobal;
    public static void main(String[] args) {
        /*El main siempre es el punto de inciio del programa*/
       int x = 6;
       int y = 8;  
       variableglobal++;
    }
    
    public static void prueba(){
       variableglobal++;
    }
    
    // tipos de escritura: 
    
    //camelCase
    //contadorCarrosRojos   
    
    //PascalCase 
    //ContadorCarrosRojos
    
    // kebab-case
    //contador-carros-rojos
    
    //snake_case
    //contador_carros_rojos
    
    
    /*
    Métodos: 
    
    Parametro: 
    
    */
    
    //void -> no retorna nada 
    
                /* tipo de retorno*/
    
   public static void imprimirMensaje(int x,int y){
       //crear variables
       // crear estructuras(if,while,do-while....)
       // llamar otros metodos
       // anidar cosas
       System.out.println(x);
       System.out.println(y);
       variableglobal++;
   }
  
   
    public static int realizarDivision1( int x, int y){
        if(y==0){
            System.out.println("valor incorrecto");
        }
        variableglobal++;
        return x/y;
    }
   
   
 public static int realizarDivision( int x, int y){
        if(y==0){
            System.out.println("valor incorrecto");
            return 0; 
        }variableglobal++;
        
        return x/y;
       
    }
    
    
}
