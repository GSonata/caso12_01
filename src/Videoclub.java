import java.io.IOException;
import java.util.ArrayList;

public class Videoclub {

    ArrayList<Cliente> listaClientes = new ArrayList<>();
    ArrayList<DVD> listaPeliculas = new ArrayList<>();

    public Videoclub(String ficheroClientes, String ficheroPeliculas) throws IOException {
        listaClientes = Conexiones.formarArrayClientes(ficheroClientes);
        listaPeliculas = Conexiones.formarArrayDVDS(ficheroPeliculas);
    }

    public ArrayList<DVD> copias(String titulo) throws VideoclubException {
        boolean creada = false;
        ArrayList<DVD> copias = new ArrayList<>();

        try{
        for (DVD item : listaPeliculas) {
            if (item.titulo.equals(titulo)) {
                if (!creada) {
                    copias.add(item);
                } else for (DVD item2 : copias) {
                    if (item.codigo != item2.codigo) {
                        copias.add(item);
                    }
                }
            }
        }

        if(copias.isEmpty()){
            throw new VideoclubException("No hay copias disponibles de esta pelicula");
        }}catch (VideoclubException e){
            System.out.println(e.getMessage());
        }

        return copias;
    }
}
