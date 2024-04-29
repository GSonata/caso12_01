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

    @Override
    public boolean equals(Object o) {
        boolean result=false;
        if(o instanceof Cliente){
            if(((Cliente) o).nombre.toLowerCase().equals(this.nombre)){
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
