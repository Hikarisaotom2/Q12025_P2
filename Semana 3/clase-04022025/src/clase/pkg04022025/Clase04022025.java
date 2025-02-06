/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase.pkg04022025;

import java.util.ArrayList;

/**
 *
 * @author claudiacortes
 */
public class Clase04022025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Paciente nuevoPaciente =new Paciente("Juan","perez",30,"N/A");
//        Paciente nuevopacienteMujer =new Femenino("12/01/2023","12/01/2025","Juana","perez",30,"N/A");
//        Paciente nuevopacienteHombre = new Masculino("12/01/2023","N/A","Juan","perez",30,"N/A");
//        Femenino nuevoPacienteX  = new Paciente("Juan","perez",30,"N/A");
        
        ArrayList<Paciente> pacientes = new ArrayList();
        
        Paciente nuevoPaciente =new Paciente("Juan","perez",30,"N/A");
        Femenino nuevopacienteMujer =new Femenino("12/01/2023","12/01/2025","Juana","perez",30,"N/A");
        Masculino nuevopacienteHombre = new Masculino("12/01/2023","N/A","Juan","perez",30,"N/A");
        
        pacientes.add(nuevopacienteHombre);
        pacientes.add(nuevoPaciente); 
        pacientes.add(nuevopacienteMujer);
        
        
     
        nuevopacienteMujer.consultaFemenina();
        nuevopacienteHombre.consultaMasculina();
        System.out.println("consultas");
        for (int i = 0; i < pacientes.size(); i++) {
            // instanceof : verificar si un objeto es de un determinado tipo 
            // objeto instanceof NombreClase
            if(pacientes.get(i) instanceof Femenino){
               // Casteo: conversion explicita de datos.
               //  (ClaseConvertir) objeto               
               Femenino paciente = (Femenino)pacientes.get(i);
               paciente.consultaFemenina();
//            ((Femenino)pacientes.get(i)).consultaFemenina();
            
            }else if(pacientes.get(i) instanceof Masculino){
                 Masculino paciente = (Masculino)pacientes.get(i);
               paciente.consultaMasculina();
 
            }else{
            System.out.println("El paciente en la pos "+i+" es un paciente");
            }
        }
        
        
        System.out.println(pacientes);
        
        /*
        1) crear pacientes 
        2) listarlos 
        4) consulta     
            -> mujeres 
            -> hombres 
        
        
        */
       
    }
    
}
