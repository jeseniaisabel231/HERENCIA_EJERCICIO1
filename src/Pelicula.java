public class Pelicula {
    //atributos
    String nombre, genero, director;
    double duracion;

    //constructor
    public Pelicula(String nombre, String director) {
        this.nombre = nombre;
        this.director = director;
    }
    //set y get

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
}
