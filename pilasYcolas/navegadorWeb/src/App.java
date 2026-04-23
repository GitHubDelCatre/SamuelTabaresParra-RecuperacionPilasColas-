import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Navegador navegador = new Navegador();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("SIMULADOR DE NAVEGADOR WEB");
        System.out.println();

        while (continuar) {
            mostrarMenu();
            System.out.print("Opcion: ");
            String opcion = scanner.nextLine().trim();

            switch (opcion) {
                case "1":
                    visitarNuevaPagina(scanner, navegador);
                    break;
                case "2":
                    retrocederPagina(navegador);
                    break;
                case "3":
                    verHistorialPaginas(navegador);
                    break;
                case "4":
                    mostrarPaginaActual(navegador);
                    break;
                case "5":
                    System.out.println("\nSaliendo...\n");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opcion invalida.\n");
            }
        }

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n--- MENU ---");
        System.out.println("1. Visitar nueva pagina");
        System.out.println("2. Retroceder");
        System.out.println("3. Ver historial");
        System.out.println("4. Ver pagina actual");
        System.out.println("5. Salir");
    }

    private static void visitarNuevaPagina(Scanner scanner, Navegador navegador) {
        System.out.println();
        System.out.print("URL: ");
        String url = scanner.nextLine().trim();

        if (url.isEmpty()) {
            System.out.println("La URL no puede estar vacia.\n");
            return;
        }

        System.out.print("Titulo: ");
        String titulo = scanner.nextLine().trim();

        if (titulo.isEmpty()) {
            System.out.println("El titulo no puede estar vacio.\n");
            return;
        }

        navegador.visitarPagina(url, titulo);
        System.out.println();
    }

    private static void retrocederPagina(Navegador navegador) {
        System.out.println();
        if (navegador.getTamanioHistorial() == 0) {
            System.out.println("No hay paginas anteriores.\n");
        } else {
            navegador.retroceder();
            System.out.println();
        }
    }

    private static void verHistorialPaginas(Navegador navegador) {
        navegador.verHistorial();
    }

    private static void mostrarPaginaActual(Navegador navegador) {
        System.out.println();
        PaginaWeb paginaActual = navegador.getPaginaActual();
        if (paginaActual == null) {
            System.out.println("No hay pagina actual.\n");
        } else {
            System.out.println(paginaActual.toString());
            System.out.println();
        }
    }
}
