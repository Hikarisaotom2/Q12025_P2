/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package clase_03022025;

/**
 *
 * @author claudiacortes
 */

/*Se parece a las clases, pero no son clases*/
/*Desde qque creamos el archivo, ya es un tipo de dato valido*/
public enum Dias {
    LUNES("L",1),// new Dias("L",1)
    MARTES("M",2), // new Dias("M",2)
    MIERCOLES("MI",3),
    JUEVES("J",4),
    VIERNES("V",5); 
    
    private String simbolo;
    private int simboloNumero;
    
    private Dias(String simbolo, int simboloNumero){
        this.simbolo = simbolo;
        this.simboloNumero =simboloNumero;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public int getSimboloNumero() {
        return simboloNumero;
    }
    
    
    
}
