package Criterios;

import java.time.LocalDate;

import Elementos.*;

public class CondicionFechaCreacion implements Condicion {
    private LocalDate fechaBuscada;

    public CondicionFechaCreacion(LocalDate fechaBuscada) {
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
        return elem.getFechaCreacion().isBefore(fechaBuscada);
    }

    

}
