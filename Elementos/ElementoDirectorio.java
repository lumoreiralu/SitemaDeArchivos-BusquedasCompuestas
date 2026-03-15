package Elementos;
import java.time.LocalDate;
import java.util.ArrayList;

import Criterios.*;

public abstract class ElementoDirectorio {
    private String nombre;
    private LocalDate fechaCreacion;

    public ElementoDirectorio(String nombre) {
        this.nombre = nombre;
        this.fechaCreacion = LocalDate.now();
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

    public abstract double getTamanio();
    public abstract ArrayList<ElementoDirectorio> buscar(Condicion condicion);
    
}