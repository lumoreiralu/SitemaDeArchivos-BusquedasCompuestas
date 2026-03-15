package Elementos;
public class ArchivoComprimido extends Directorio {
    private double tasaCompresion;

    public ArchivoComprimido(String nombre, double tasaCompresion) {
        super(nombre);
        this.tasaCompresion = tasaCompresion;
    }

    @Override
    public double getTamanio(){
        return super.getTamanio()*(this.tasaCompresion);
    }
    
}
