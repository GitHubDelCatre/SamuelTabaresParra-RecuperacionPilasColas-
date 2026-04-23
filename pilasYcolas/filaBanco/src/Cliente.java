import java.util.Date;

public class Cliente {
    private int id;
    private String nombre;
    private String tipoServicio;
    private long horaLlegada;
    private boolean atendido;

    public Cliente(int id, String nombre, String tipoServicio) {
        this.id = id;
        this.nombre = nombre;
        this.tipoServicio = tipoServicio;
        this.horaLlegada = System.currentTimeMillis();
        this.atendido = false;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public long getHoraLlegada() {
        return horaLlegada;
    }

    public boolean isAtendido() {
        return atendido;
    }

    public void setAtendido(boolean atendido) {
        this.atendido = atendido;
    }

    @Override
    public String toString() {
        return "Turno: " + id + " | " + nombre + " | " + tipoServicio + " | Atendido: " + (atendido ? "Si" : "No");
    }
}
