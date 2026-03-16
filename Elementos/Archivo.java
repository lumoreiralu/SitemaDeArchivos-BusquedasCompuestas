package Elementos;

import java.util.ArrayList;

import Criterios.Condicion;

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

    @Override
    public ArrayList<ElementoDirectorio> buscar(Condicion condicion) {
        ArrayList<ElementoDirectorio> resultado = new ArrayList<>();
        if(condicion.cumple(this)){
            resultado.add(this);
        }
        return resultado;
    }
    
    
}
