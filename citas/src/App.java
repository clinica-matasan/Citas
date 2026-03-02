import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.*;


public class App {
     private static List<Paciente> listaPacientes = new ArrayList<>();
    public static void main(String[] args)  {

        Scanner sc= new Scanner(System.in);
        boolean salir = false;
        gestorCitas gestor = new gestorCitas();
        gestorConsultorio  gestionConsultorio = new gestorConsultorio();

        int opcion;

        do{

        System.out.println("BIENVENIDO AL SISTEMA DE CITAS");
        System.out.println("Por favor seleccione una opción");
        System.out.println("1.Registro paciente");
        System.out.println("2.Consutar medico");
        System.out.println("3.Programar Cita");
        System.out.println("4.Consultar consultorio");
        System.out.println("5.Consultar Cuota moderada");
        System.out.println("6. Salir porque esto no sirve");
   

        opcion = sc.nextInt();

        switch(opcion){

            case 1:
                System.out.println("BIENVENIDO AL SISTEMA DE GESTIÓN DE PACIENTES");

                while (!salir) {
                    System.out.println("\n1. Registrar Paciente");
                    System.out.println("2. Ver Lista de Pacientes");
                    System.out.println("3. Salir");
                    System.out.print("Selecciona una opción: ");

                    int elegir = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Ingrese Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese cedula: ");
                    String cedula = sc.nextLine();
                    System.out.print("Ingrese Edad: ");
                    int edad = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Ingrese EPS: ");
                    String EPS = sc.nextLine();
                    if (elegir == 1) {
   
                    Paciente nuevoPaciente = new Paciente(nombre, cedula, edad, EPS);
                    listaPacientes.add(nuevoPaciente);
                    } else if (elegir == 2) {
   
                    for (Paciente p : listaPacientes) { System.out.println(p); }
                    } else if (elegir == 3) {
                            salir = true;
                       }
                

                    Paciente nuevoPaciente = new Paciente(nombre, cedula, edad, EPS);

                    listaPacientes.add(nuevoPaciente);
                    System.out.println("¡Paciente registrado con éxito!");

                    nuevoPaciente.toString();
                 
                }
                break;
            case 2:
                // Consultar medico
               
                break;
            case 3:
                  System.out.println("Está en el apartado para registrar su cita");

                System.out.print("deme el id de su cita: ");
                    int idCita = sc.nextInt();


                    System.out.print("Ud que está que se muere, deme su id como paciente: ");
                    int idPaciente = sc.nextInt();

                    System.out.print("Deme el id del medico: ");
                    int idMedico = sc.nextInt();
                    sc.nextLine(); 

                    System.out.print("la fecha y hora de su cita: ");
                    String fechaHora = sc.nextLine();

                    System.out.print("Estado (Pendiente/Completada/Cancelada): ");
                    String estado = sc.nextLine();

                    if(idCita > 0){
                    Cita nuevaCita = new Cita(idCita, idPaciente, idMedico, fechaHora, estado);
                    gestor.agregarCita(nuevaCita);

                    }else{
                              System.out.println("Ud es como mongólico, ponga ese id paciente bien");
                    }

                     gestor.mostrarCitas();
               
                   
                break;
            case 4 :
                 System.out.println("Hola bienvenido al sistema de Registro del consultorio");

                System.out.println("ingresa el Consultorio mas sercano a tu residencia");
                System.out.println("Recuerda que tenemos 10 en todo Medellin");
                 int numConsultorio = sc.nextInt();

                System.out.println("Ingresa el piso del consultorio");
                int pisoConsultorio = sc.nextInt();
                sc.nextLine();

                if( numConsultorio > 0 &&  numConsultorio <= 10 ){
                               
                Consultorio Agregado = new Consultorio (numConsultorio,pisoConsultorio,"Disponible");
                gestionConsultorio.registrarConsultorio(Agregado);
             
                }else{
                    System.out.println("Error : Solo tenemos 10 Consultorios en el area Metropolitana");
                
                }

                gestionConsultorio.mostrarConsultorios();
                
                break; 
            case 5:
                // cuota moderada
                break;  
            case 6 :
                System.out.println("Muchas gracias por usar nuestro servicio");
                break;         
            default:
                System.out.println("Error, Opcion invalida");
        }

    }while(opcion !=6);
        
        sc.close();
        }
}


