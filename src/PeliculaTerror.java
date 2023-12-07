public class PeliculaTerror extends Pelicula{
    String escenas_terror;

    //constructor

    public PeliculaTerror(String nombre, String director, String escenas_terror) {
        super(nombre, director);
        this.escenas_terror = escenas_terror;
    }
    public void imprimirTerror(){
        System.out.println("Las escenas mas terrorifica fue: ");
    }
}
