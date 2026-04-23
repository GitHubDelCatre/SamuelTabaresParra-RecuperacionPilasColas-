import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PaginaWeb {
    private String url;
    private String titulo;
    private LocalDateTime fechaAcceso;

    public PaginaWeb(String url, String titulo) {
        this.url = url;
        this.titulo = titulo;
        this.fechaAcceso = LocalDateTime.now();
    }

    public String getUrl() {
        return url;
    }

    public String getTitulo() {
        return titulo;
    }

    public LocalDateTime getFechaAcceso() {
        return fechaAcceso;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return "URL: " + url + " | Título: " + titulo + " | Acceso: " + fechaAcceso.format(formatter);
    }
}
