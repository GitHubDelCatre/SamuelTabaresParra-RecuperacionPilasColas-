import java.util.Stack;

public class Navegador {
    private Stack<PaginaWeb> historialPaginas;
    private PaginaWeb paginaActual;

    public Navegador() {
        this.historialPaginas = new Stack<>();
        this.paginaActual = null;
    }


    public void visitarPagina(String url, String titulo) {
        if (paginaActual != null) {
            historialPaginas.push(paginaActual);
        }
        paginaActual = new PaginaWeb(url, titulo);
        System.out.println("Visitando: " + paginaActual.getTitulo() + " (" + paginaActual.getUrl() + ")");
    }

    public void retroceder() {
        if (historialPaginas.isEmpty()) {
            System.out.println("No hay páginas anteriores en el historial.");
            return;
        }
        paginaActual = historialPaginas.pop();
        System.out.println("Retrocediendo a: " + paginaActual.getTitulo() + " (" + paginaActual.getUrl() + ")");
    }


    public void verHistorial() {
        if (historialPaginas.isEmpty() && paginaActual == null) {
            System.out.println("\nEl historial esta vacio.\n");
            return;
        }

        System.out.println("\n--- HISTORIAL ---");
        
        if (paginaActual != null) {
            System.out.println("Pagina actual: " + paginaActual.toString());
        }

        if (!historialPaginas.isEmpty()) {
            System.out.println("\nHistorial anterior:");
            Stack<PaginaWeb> tempStack = new Stack<>();
            int contador = 1;
            while (!historialPaginas.isEmpty()) {
                PaginaWeb pagina = historialPaginas.pop();
                System.out.println(contador + ". " + pagina.toString());
                tempStack.push(pagina);
                contador++;
            }
            while (!tempStack.isEmpty()) {
                historialPaginas.push(tempStack.pop());
            }
        }
        System.out.println();
    }

    public PaginaWeb getPaginaActual() {
        return paginaActual;
    }
    
    public int getTamanioHistorial() {
        return historialPaginas.size();
    }
}
