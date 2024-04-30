import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Conexiones {

    public static ArrayList<Cliente> formarArrayClientes(String nombreArchivo) throws IOException {
        File listaClientes = new File(nombreArchivo);
        BufferedReader lectorClientes = new BufferedReader(new FileReader(listaClientes));

        ArrayList<String> nombresClientes = new ArrayList<>();
        ArrayList<Cliente> listaFinal = new ArrayList<>();

        while (lectorClientes != null) {
            nombresClientes.add(lectorClientes.readLine());
            Cliente cliente = new Cliente(lectorClientes.readLine());
            listaFinal.add(cliente);
        }
        lectorClientes.close();
        return listaFinal;
    }

    public static ArrayList<DVD> formarArrayDVDS(String nombreArchivo) throws IOException {
        File listaPeliculas = new File(nombreArchivo);
        BufferedReader lectorPeliculas = new BufferedReader(new FileReader(listaPeliculas));

        ArrayList<String> nombresPeliculas = new ArrayList<>();
        ArrayList<DVD> listaFinal = new ArrayList<>();

        while (lectorPeliculas != null) {
            nombresPeliculas.add(lectorPeliculas.readLine());
            String[] splitted1 = new ArrayList<>().toArray(new String[0]);
                ArrayList<String> actores=new ArrayList<>();
                splitted1=lectorPeliculas.readLine().split("\\*");
                String id=splitted1[0];
                String nombrePelicula=splitted1[1];
                String director=splitted1[2];
                String actoresUNCUT=splitted1[3];
                String[] actoresArray= actoresUNCUT.split(",");
                actores.addAll(Arrays.asList(actoresArray));
                listaFinal.add(new DVD(id,nombrePelicula,director,actores));
            }
        lectorPeliculas.close();
        return listaFinal;
    }
}
