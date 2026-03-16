package Elementos;

import java.util.ArrayList;

import Criterios.Condicion;

public class Link extends ElementoDirectorio {
    private final double TAMANIO_FIJO = 1;
    private ElementoDirectorio elem;

    public Link(ElementoDirectorio elem) {
        super("Acceso directo a: "+elem.getNombre());
    }

    @Override
    public double getTamanio() {
        return this.TAMANIO_FIJO;
    }

    public double getTAMANIO_FIJO() {
        return TAMANIO_FIJO;
    }

    public ElementoDirectorio getElem() {
        return elem;
    }

    public void setElem(ElementoDirectorio elem) {
        this.elem = elem;
    }

    @Override
    public ArrayList<ElementoDirectorio> buscar(Condicion condicion) {
        ArrayList<ElementoDirectorio> resultado = new ArrayList<>();
        if(condicion.cumple(this)){
            resultado.add(elem);
        }
        return resultado;
    }

    @Override
    public String toString(){
        return "Link: " + this.getNombre();
    }
    
    
}
