import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        GestorBanco banco = new GestorBanco();
        Scanner sc = new Scanner(System.in);
        int opcion;

        while (true) {
            System.out.println("\n--- Menu Banco ---");
            System.out.println("1. Llegada cliente");
            System.out.println("2. Atender cliente");
            System.out.println("3. Ver siguiente cliente");
            System.out.println("4. Ver cola");
            System.out.println("5. Ver turnos");
            System.out.println("6. Salir");
            System.out.print("Opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Servicio (retiro/consignacion/asesoria): ");
                    String servicio = sc.nextLine();
                    banco.llegadaCliente(nombre, servicio);
                    break;

                case 2:
                    banco.atenderCliente();
                    break;

                case 3:
                    banco.verSiguiente();
                    break;

                case 4:
                    banco.verCola();
                    break;

                case 5:
                    banco.mostrarTurnos();
                    break;

                case 6:
                    System.out.println("Bye");
                    sc.close();
                    return;

                default:
                    System.out.println("Opcion invalida");
            }
        }
    }
}
