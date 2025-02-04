/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_03022025;

/**
 *
 * @author claudiacortes
 */
public class Clase_03022025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
        Enumeración / enum: 
         -> sirven para enumerar las posibles respuestas o posibles resultados. 
        -> sexo: 
         -> F 
         -> M
         -> N/A 
        
        -> Dias de la semana: 
           -> L,M,M,J,V,S,D
        -> Meses del año
          -> E,F,M,A,M,J,J,A,S,O,N,D
        
        */
       
       
       Dias ultimoDiaSemana = Dias.LUNES;
        System.out.println("Dia "+ultimoDiaSemana );
       System.out.println("Simbolo "+ultimoDiaSemana.getSimbolo());
       System.out.println("Numero "+ultimoDiaSemana.getSimboloNumero());
        System.out.println("____________________________________________");
       
       // Try-catch
       /*
       Es una estructura especial que nos ayuda a ejecutar codigo seguramente
       */
       try{
        /* 1: ponemos las instrucciones que queremos ejecutar, 
           normalmente ponemos codigo que pensamos puede producir una exception
           el codigo se ejecuta con normalidad 
           */
        
            Dias dia= Dias.valueOf("MIERCOLES");
            System.out.println(dia);
            System.out.println("Simbolo "+dia.getSimbolo());
            System.out.println("Numero "+dia.getSimboloNumero());
             
       }catch(Exception error){
        /* 2 ) si algo llega a fallar en el bloqque del try( si hay una exception), 
        automaticamente se salta al bloque del catch, el programa no para y podemos ejecutar otras instrucciones*/
           System.out.println("Ocurrio un error, ese valor no existe");
       }finally{
        // 3 ) Este bloque es opcional, se ejecuta en automatico despues try o del catch. 
           System.out.println("Esto se ejecuta al final del catch ");
       }
      
    }
    
}
