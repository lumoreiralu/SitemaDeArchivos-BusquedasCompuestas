package Criterios;

import Elementos.*;

public class CondicionOR implements Condicion{
    private Condicion c1;
    private Condicion c2;

    
    public CondicionOR(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public Condicion getC1() {
        return c1;
    }

    public void setC1(Condicion c1) {
        this.c1 = c1;
    }

    public Condicion getC2() {
        return c2;
    }

    public void setC2(Condicion c2) {
        this.c2 = c2;
    }

    @Override
    public boolean cumple(ElementoDirectorio elem) {
        return c1.cumple(elem)||c2.cumple(elem);
    }
}
