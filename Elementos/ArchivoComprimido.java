package Elementos;
import Criterios.Condicion;
import java.util.ArrayList;

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

    @Override
    public ArrayList<ElementoDirectorio> buscar(Condicion condicion){
        ArrayList<ElementoDirectorio>resultado = new ArrayList<>();
        ArrayList<ElementoDirectorio>resultadoInterno = super.buscar(condicion);
        if (!resultadoInterno.isEmpty()||condicion.cumple(this)) {
            resultado.add(this);
        }
        return resultado;
       
    }

    @Override
    public String toString(){
        return "Archivo Comprimido: " + this.getNombre();
    }
    
}
