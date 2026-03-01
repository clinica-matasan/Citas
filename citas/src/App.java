import java.util.Scanner;

import model.Cita;
import model.Consultorio;
import model.gestorCitas;
import model.gestorConsultorio;

public class App {
    public static void main(String[] args)  {

        Scanner sc= new Scanner(System.in);
        gestorCitas gestor = new gestorCitas();
        gestorConsultorio  gestionConsultorio = new gestorConsultorio();

        int opcion;

        do{

        System.out.println("BIENVENIDO AL SISTEMA DE CITAS CABALLERO");
        System.out.println("Por favor seleccione una opción de tantas caballero");
        System.out.println("1.Para registar una cita");
        System.out.println("2.Para mostrar la cita");
        System.out.println("3.para registrar Consultorio");
        System.out.println("4.para mostar el consultorio");
        System.out.println("5. Salir porque esto no sirve");
        opcion = sc.nextInt();

        switch(opcion){

            case 1:
                
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

                    
                break;
            case 2:
                gestor.mostrarCitas();
                break;
            case 3:
                System.out.println("Hola bienvenido al sistema de Registro del consultorio");

                System.out.println("ingresa el numero de tu consultorio Recuerda que cada consultorio tine una capacidad max : 10");
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
                   
                break;
            case 4 :
                gestionConsultorio.mostrarConsultorios();
                break;    
            default:
                System.out.println("Caballero, es usted un ser sin cerebro que no sabe utilizar un programa");
        }

        }while(opcion !=5);

        sc.close();
    }
}
