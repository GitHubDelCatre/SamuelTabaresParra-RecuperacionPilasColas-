public class Cola {
    private Nodo inicio;

    private class Nodo {
        Cliente dato;
        Nodo siguiente;

        Nodo(Cliente dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    public Cola() {
        this.inicio = null;
    }

    public void encolar(Cliente cliente) {
        Nodo nuevoNodo = new Nodo(cliente);
        if (inicio == null) {
            inicio = nuevoNodo;
        } else {
            Nodo temp = inicio;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
        }
    }

    public Cliente desencolar() {
        if (inicio == null) {
            return null;
        }
        Cliente cliente = inicio.dato;
        inicio = inicio.siguiente;
        return cliente;
    }

    public Cliente peek() {
        if (inicio == null) {
            return null;
        }
        return inicio.dato;
    }

    public void mostrar() {
        if (inicio == null) {
            System.out.println("Cola vacia");
            return;
        }
        Nodo temp = inicio;
        int i = 1;
        while (temp != null) {
            System.out.println(i + ". " + temp.dato);
            temp = temp.siguiente;
            i++;
        }
    }

    public boolean estaVacia() {
        return inicio == null;
    }
}
