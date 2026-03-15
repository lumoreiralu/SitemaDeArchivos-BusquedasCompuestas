import java.time.LocalDate;

public abstract class ElementoDirectorio {
    private String nombre;
    private LocalDate fechaCreacion;
    private double tamanio;

    public ElementoDirectorio(String nombre, LocalDate fechaCreacion, double tamanio) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    

    
}