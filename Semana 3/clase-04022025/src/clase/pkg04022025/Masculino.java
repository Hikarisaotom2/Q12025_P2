/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg04022025;

/**
 *
 * @author claudiacortes
 */
            // Masculino y paciente 
public class Masculino extends Paciente{
    // información extra que nos interesa, cosas especificas 
    private String ultimaRevision;
    private String resultadosExamenProstata;

    public Masculino(String ultimaRevision, String resultadosExamenProstata, String nombre, String apellido, int edad, String enfermedadBase) {
        super(nombre, apellido, edad, enfermedadBase);
        this.ultimaRevision = ultimaRevision;
        this.resultadosExamenProstata = resultadosExamenProstata;
    }
    
        public void consultaMasculina(){
        System.out.println("Este metodo es exclusivo para los objetos del tipo paciente masculino");
    }
    
    
}
