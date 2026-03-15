package Criterios;

import java.time.LocalDate;

import Elementos.*;

public class CondicionFechaModificacion implements Condicion{
    private LocalDate fechaBuscada;

    public CondicionFechaModificacion(LocalDate fechaBuscada) {
        this.fechaBuscada = fechaBuscada;
    }

    public LocalDate getFechaBuscada() {
        return fechaBuscada;
    }

    public void setFechaBuscada(LocalDate fechaBuscada) {
        this.fechaBuscada = fechaBuscada;
    }

    @Override
    public boolean cumple(ElementoDirectorio elem) {
        return elem.getFechaCreacion().isAfter(fechaBuscada);
    }

    
}
