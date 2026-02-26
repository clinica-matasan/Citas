import java.util.Scanner;

import model.Cita;
import model.gestorCitas;

public class App {
    public static void main(String[] args)  {

        Scanner sc= new Scanner(System.in);
        gestorCitas gestor = new gestorCitas();

        int opcion;

        do{

        System.out.println("BIENVENIDO AL SISTEMA DE CITAS CABALLERO");
        System.out.println("Por favor seleccione una opción de tantas caballero");
        System.out.println("1.Para registar una cita");
        System.out.println("2.Para mostrar la cita");
        System.out.println("3. Salir porque esto no sirve");
        opcion = sc.nextInt();

        switch(opcion){

            case 1:
                System.out.println("Está en ek apartado para registrar su cita");
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

                    Cita nuevaCita = new Cita(idCita, idPaciente, idMedico, fechaHora, estado);
                    gestor.agregarCita(nuevaCita);
                    
                break;
            case 2:
                gestor.mostrarCitas();
                break;
            case 3:
                System.out.println("Muchas gracias, olajá no vuelva");
                break;
            default:
                System.out.println("Caballero, es usted un ser sin cerebro que no sabe utilizar un programa");
        }

        }while(opcion !=3);

        sc.close();
    }
}
