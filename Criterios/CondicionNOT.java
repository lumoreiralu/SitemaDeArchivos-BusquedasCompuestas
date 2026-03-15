package Criterios;

import Elementos.*;

public class CondicionNOT implements Condicion {
    private Condicion c1;

    public CondicionNOT(Condicion c1) {
        this.c1 = c1;
    }

    public Condicion getC1() {
        return c1;
    }

    public void setC1(Condicion c1) {
        this.c1 = c1;
    }

    @Override
    public boolean cumple(ElementoDirectorio elem) {
        return !c1.cumple(elem);
    }

    
}
