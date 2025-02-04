/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_28012025;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_28012025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        1. crear estudiantes  x
        2. crear clases  x 
        3/ matricular alumnos en las clases x
        4. modiifcar alumnos
        5. modificar clases 
        6. eliminar alumno de una clase
        7. eliminar alumno 
        8. eliminar clase 
        9. listar clases x
        10. listar alumnos x
        11. buscar alumnos
        12. buscar clases 
        13. buscar alumnos en una clase 
        14. salir  x 
        */
        
        boolean continuar = true; 
        Scanner entrada = new Scanner(System.in);
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        
        Clase ejemploClase = new Clase("ejemplo","ejemplo");
            //    nombre = ejemplo
            //    seccion = ejemplo 
            //     alumnos =[ memoria_posx, ]
            
         Clase ejemploClase2 = new Clase("nombre1","nombre2");
            //    nombre = nombre1
            //    seccion = nombre2 
            //     alumnos =[memoria_posx]
            
            
         Alumno alumnoEjemplo = new Alumno("juan","Gomez",12,"Sistemas");
    //        this.nombre = juan;
    //        this.Apellido = gomez;
    //        this.cuenta = 12;
    //        this.faltas = 0;
    //        this.carrera = sistemas;
    //     direccion: memoria_posx
    
        ejemploClase.matricuarAlumno(alumnoEjemplo);
                    // this.alumnos.add(alumnoEjemplo);
                    
        ejemploClase2.matricuarAlumno(alumnoEjemplo);
                      // this.alumnos.add(alumnosEjemplo)
        
        ArrayList<Clase> clases = new ArrayList<Clase>();
        
        while (continuar) {
            System.out.println("-> 1. crear alumnos");
            System.out.println("-> 2. crear clases");
            System.out.println("-> 3. matricular alumnos");
            System.out.println("->4. modificarun alumno");
            System.out.println("-> 9. listar clases");
            System.out.println("-> 10. listar alumnos");
           int op = entrada.nextInt();
            switch (op) {
                case 1 ->{
//                    Alumno alumnonuevo = crearAlumno();
//                    alumnos.add(alumnonuevo);
                    alumnos.add(crearAlumno());
                }
                case 2 ->{
                    clases.add(crearClase());
                }
                case 3 -> {
                    // agregar un alumno a la lista de alumnos de una clase 
                    Alumno alumnoMatricular;
                    Clase claseMatricular;
                    // que alumno se matriculara
                    listarAlumnos(alumnos);
                    System.out.println(" Ingrese la pos del alumno a matricular");
                    // NOTA: recordar validar estos datos 
                    int posAlumno = entrada.nextInt();
                    listarClases(clases);
                    System.out.println("Ingrese la pos de la clase a la que desea matricular al alumno");
                    int posClase = entrada.nextInt();
                    // matricular al alumno.
                    claseMatricular = clases.get(posClase); 
                    alumnoMatricular = alumnos.get(posAlumno);
                    claseMatricular.matricuarAlumno(alumnoMatricular);
                    
                }
                
                //encapsulacion 
                
                case 4 ->{
                    alumnos = modificarAlumno(alumnos);   
                }
                case 9 ->{
                    listarClases(clases);
                }
                case 10 ->{
                    listarAlumnos(alumnos);
                }
                default ->{
                    continuar = false;
                }
            }
           
            
        }
        

    }
    public static ArrayList<Alumno> modificarAlumno( ArrayList<Alumno> alumnos){
        listarAlumnos(alumnos);
        System.out.println("Cual es la pos del alumno a modificar: ");
        Scanner entrada = new Scanner(System.in);
        int pos = entrada.nextInt(); // NOTA: deberiamos valiar esta entrada
        
        Alumno modificar = alumnos.get(pos);
        
         System.out.println("ingrese el nombre ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el apellido");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese la carrera");
        String carrera = entrada.nextLine();
        System.out.println("Ingrese el numero de cuenta");
        int cuenta = entrada.nextInt();
        
        modificar.setNombre(nombre);
        modificar.setApellido(apellido);
        modificar.setCarrera(carrera);
        modificar.setCuenta(cuenta);
        System.out.println("La información fue actualizada");
  
       return alumnos; 
    }
    
    public static void listarClases(ArrayList<Clase> clases){
        System.out.println("> listando clases");
        for (int i = 0; i < clases.size() ; i++) {
            System.out.println(i+ ") "+clases.get(i));
        }
        System.out.println("");
    }
    
      public static void listarAlumnos(ArrayList<Alumno> alumnos){
          System.out.println("> listando alumnos");
          for (int i = 0; i < alumnos.size(); i++) {
              System.out.println(i+") "+alumnos.get(i));
          }
          System.out.println("");
    }
    
    public static Alumno crearAlumno(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el nombre ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el apellido");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese la carrera");
        String carrera = entrada.nextLine();
        System.out.println("Ingrese el numero de cuenta");
        int cuenta = entrada.nextInt();

        return new Alumno(nombre,apellido,cuenta,carrera);
    }
    
    
    public static Clase crearClase(){
         Scanner entrada = new Scanner(System.in);
         System.out.println("Ingrese el nombre de la clase");
         String nombre = entrada.nextLine();
         System.out.println("Ingrese la seccion de la clase");
         String seccion = entrada.nextLine();
         return new Clase(nombre,seccion);
    }
    
    
    public static void ejemplosObjetos(){
         Alumno juan = new Alumno("Juan","Perez",123,"ing.datos");
        Alumno maria = new Alumno("Maria","Perez",124,"ing.sistemas");
        Alumno pedro = new Alumno("Pedro","Gomez",125,"ing.sistemas");
        
        Clase programacion = new Clase("Programacion 2", "123");
        programacion.matricuarAlumno(juan);/*pasar las direcciones del objeto*/
        programacion.matricuarAlumno(maria);
        programacion.matricuarAlumno(pedro);
        System.out.println(programacion);
        
        programacion.pasarLista();
        
        System.out.println("Verificando si los dats se actualizaron automaticamente: ");
        System.out.println(juan);
        System.out.println(maria);
        System.out.println(pedro);
        

        System.out.println("Actualizando el nombre de juan: ");
        juan.setNombre("Alejandro");
        System.out.println(programacion);
        
        
        /*
        INCORRECTO
        */
        
         Alumno a = new Alumno("Pedro","Gomez",125,"ing.sistemas");// guardado en algun lugar 
        Clase programacion2 = new Clase("Programacion 2", "123");
        //cada vez que se hace new, se crea un objeto completamente nuevo y se guarda en algun lugar
        Alumno b = new Alumno(a.getNombre(),a.getApellido(),a.getCuenta(),a.getCarrera());
        programacion2.matricuarAlumno(b);
        programacion2.pasarLista();
        
        System.out.println("El num de id de a "+ a.hashCode());
        System.out.println("El num de id de b "+ b.hashCode());
        
        Alumno buscar = b;
                //Ejemplo 2:
        
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        
        alumnos.add(b);
        alumnos.add(a);
        
        // id o el nombre 
        
        boolean objetomalo = alumnos.contains(new Alumno("nombre","",122,"")); // -> a.hashCode() === buscar.hasCode();
        
        System.out.println(objetomalo);
        
        boolean objetoBueno = alumnos.contains(buscar);
        System.out.println(objetoBueno);
    }
}
