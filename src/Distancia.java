public class Distancia extends PeliculaRomantica{
    //atributos
    int premios;

    //constructor

    public Distancia(String nombre, String director, String escenas_memorables, int premios) {
        super(nombre, director, escenas_memorables);
        this.premios = premios;
    }
    public void setPremios(){
        System.out.println("Tienes de premios: " );
    }
}
