package Criterios;

import Elementos.*;

public class CondicionTitulo implements Condicion {
    private String tituloBuscado;

    public CondicionTitulo(String tituloBuscado) {
        this.tituloBuscado = tituloBuscado;
    }

    public String getTituloBuscado() {
        return tituloBuscado;
    }

    public void setTituloBuscado(String tituloBuscado) {
        this.tituloBuscado = tituloBuscado;
    }

    @Override
    public boolean cumple(ElementoDirectorio elem) {
        return elem.getNombre().contains(tituloBuscado);
    }

    
}
