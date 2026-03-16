import Elementos.*;

import java.time.LocalDate;
import java.util.ArrayList;

import Criterios.*;
public class Main {
    public static void main(String[] args) {
        Archivo Musica = new Archivo("Musica.mp3", 129.4);
        Archivo Foto = new Archivo("Fotos.jpg", 390.2);

        ArchivoComprimido cloud = new ArchivoComprimido("cloud", 0.3);

        Directorio privado = new Directorio("Privado");

        privado.addElementos(Musica);
        privado.addElementos(Foto);

        Link accesoMusica = new Link(Musica);
        
        privado.addElementos(accesoMusica);
        privado.addElementos(cloud);

        CondicionFechaCreacion fecha = new CondicionFechaCreacion(LocalDate.of(2026,03,20));

        ArrayList<ElementoDirectorio> busquedaFecha = cloud.buscar(fecha);

        System.out.println(busquedaFecha);

    
    }
}
