import java.util.ArrayList;
import java.util.Objects;

public class Cliente {

    String nombre;
    ArrayList<DVD> peliculasAlquiladas=new ArrayList<>();

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public Cliente() {
    }

    public void alquilarPelicula(DVD p){
        peliculasAlquiladas.add(p);
    }

    public void devolverPelicula(DVD p){
        peliculasAlquiladas.remove(p);
    }


    @Override
    public boolean equals(Object o) {
        boolean result=false;
        if(o instanceof Cliente){
            if(((Cliente) o).nombre.toLowerCase().equals(this.nombre.toLowerCase())){
                result=true;
            }
        }
        return result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, peliculasAlquiladas);
    }
}
