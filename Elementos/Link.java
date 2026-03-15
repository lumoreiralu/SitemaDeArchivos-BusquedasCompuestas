package Elementos;


public class Link extends ElementoDirectorio {
    private final double TAMANIO_FIJO = 1;

    public Link(String nombre) {
        super(nombre);
    }

    @Override
    public double getTamanio() {
        return this.TAMANIO_FIJO;
    }

    
    
}
