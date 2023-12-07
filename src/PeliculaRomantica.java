public class PeliculaRomantica extends Pelicula{
    //Atributos
    String escenas_memorables;

    public PeliculaRomantica(String nombre, String director, String escenas_memorables) {
        super(nombre, director);
        this.escenas_memorables = escenas_memorables;
    }
    public void imprimirmiedo(){
        System.out.println("Est pelicula se llama: " + getNombre());
    }
}
