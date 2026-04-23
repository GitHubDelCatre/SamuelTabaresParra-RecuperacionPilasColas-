import java.util.ArrayList;

public class GestorBanco {
    private Cola cola;
    private ArrayList<Cliente> atendidos;
    private int contador;

    public GestorBanco() {
        cola = new Cola();
        atendidos = new ArrayList<>();
        contador = 1;
    }

    public void llegadaCliente(String nombre, String servicio) {
        Cliente c = new Cliente(contador, nombre, servicio);
        cola.encolar(c);
        System.out.println("Cliente " + nombre + " encolado. Turno: " + contador);
        contador++;
    }

    public void atenderCliente() {
        Cliente c = cola.desencolar();
        if (c == null) {
            System.out.println("No hay clientes en la cola");
            return;
        }
        c.setAtendido(true);
        atendidos.add(c);
        System.out.println("Cliente atendido: " + c.getNombre());
    }

    public void verSiguiente() {
        Cliente c = cola.peek();
        if (c == null) {
            System.out.println("No hay clientes en la cola");
            return;
        }
        System.out.println("Siguiente cliente: " + c);
    }

    public void verCola() {
        System.out.println("--- Clientes en espera ---");
        cola.mostrar();
    }

    public void mostrarTurnos() {
        System.out.println("\n--- Turnos en espera ---");
        cola.mostrar();

        System.out.println("\n--- Turnos atendidos ---");
        if (atendidos.isEmpty()) {
            System.out.println("No hay turnos atendidos");
        } else {
            for (int i = 0; i < atendidos.size(); i++) {
                System.out.println((i + 1) + ". " + atendidos.get(i));
            }
        }
    }
}
