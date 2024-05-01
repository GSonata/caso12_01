import java.util.ArrayList;

public class DVD implements Comparable{

    String codigo;
    String titulo;
    String director;
    ArrayList<String> actores= new ArrayList<>();

    //CONSTRUCTORES
    public DVD(String codigo, String titulo, String director, ArrayList<String> actores) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.director = director;
        this.actores = actores;
    }

    public DVD() {
    }

    @Override
    public int compareTo(Object o) {
        int result=-2;
        if(o instanceof DVD){
            int codigo1=(Integer.valueOf(this.getCodigo()));
            int codigo2=(Integer.valueOf(((DVD) o).getCodigo()));
            if(codigo1>codigo2){
                result=1;
            }else if(codigo2>codigo1){
                result=-1;
            }else result=0;
        }
        return result;
    }

    @Override
    public String toString() {
        return codigo+" : "+titulo+". (Dirigida por: "+director+", interpretada por "+actores+" ).";
    }

    //SETTERS Y GETTERS
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public ArrayList<String> getActores() {
        return actores;
    }

    public void setActores(ArrayList<String> actores) {
        this.actores = actores;
    }
}
