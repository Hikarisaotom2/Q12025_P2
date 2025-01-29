/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_23012025;

/**
 *
 * @author claudiacortes
 */
public class Clase_23012025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] lista ={3,2,1}; 
        int res = sumarLista(lista,0);
        
        System.out.println(res);
    }
    
    public static int sumarLista( int[] numeros, int i){
        if(i==numeros.length-1){ //caso base 
            return numeros[i];
        }else{// caso recusivo
            return numeros[i]+sumarLista(numeros,i++);
        }
    }
    
    /*
    1. siempre que llamemos a un metodo, eso entra a la pila (callstack)
    2. la computadora solamente se concentra en una cosa a la vez. (en lo mas reciente)
    3. funciona como una caja, llenamos de abajo hacia arriba 
    4. cuando hacemos un return, debemos sacar la funcion de la pila (callstack)
    
    */
       /*
    Recursión: 
    1. es un ciclo
    2. un ciclo infinito en una recursion, puede llevar a un error que se llama StackOverflow
      partes 
      1. caso recursivo :  mantiene vivo el ciclo
      2. caso base: hace parar el ciclo 
    */
    
}
