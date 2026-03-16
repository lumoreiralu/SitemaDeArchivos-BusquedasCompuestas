package Elementos;
import java.util.ArrayList;

import Criterios.Condicion;

public class Directorio extends ElementoDirectorio{

    private ArrayList<ElementoDirectorio> elementos;

    public Directorio(String nombre) {
        super(nombre);
        this.elementos = new ArrayList<>();
    }
    
    public void addElementos(ElementoDirectorio nuevo){
        this.elementos.add(nuevo);
    }

    @Override
    public double getTamanio(){
        double tamanio = 0;
        for(ElementoDirectorio elem: elementos){
            tamanio+=elem.getTamanio();
        }
        return tamanio;
    }

    @Override
    public ArrayList<ElementoDirectorio> buscar(Condicion condicion) {
        ArrayList<ElementoDirectorio> resultado = new ArrayList<>();
        for(ElementoDirectorio elem : elementos){
            if(condicion.cumple(elem)){
                resultado.add(elem);
            }
            resultado.addAll(elem.buscar(condicion));
        }
        return resultado;
    }

    @Override
    public String toString(){
        return "Directorio: " + this.getNombre();
    }
}
