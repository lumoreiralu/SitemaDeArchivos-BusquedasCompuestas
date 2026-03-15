package Elementos;

public class Archivo extends ElementoDirectorio {
    private double tamanio;

    public Archivo(String nombre, double tamanio) {
        super(nombre);
        this.tamanio = tamanio;
    }

    @Override
    public double getTamanio() {
        return this.tamanio;
    }
    
    
}
