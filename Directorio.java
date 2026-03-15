import java.time.LocalDate;
import java.util.ArrayList;

public class Directorio extends ElementoDirectorio{

    private ArrayList<ElementoDirectorio> directorios;

    public Directorio(String nombre, LocalDate fechaCreacion, Double tamanio) {
        super(nombre, fechaCreacion, tamanio);
        this.directorios = new ArrayList<>();
    }
    
    public void addDirectorio(ElementoDirectorio nuevo){
        this.directorios.add(nuevo);
    }

    @Override
    public double getTamanio(){
        double tamanio = 0;
        for(ElementoDirectorio elem: directorios){
            tamanio+=elem.getTamanio();
        }
        return tamanio;
    }
}
