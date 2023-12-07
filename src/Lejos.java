public class Lejos extends PeliculaRomantica{
    //atributos
    int secuela;
    //constructor

    public Lejos(String nombre, String director, String escenas_memorables, int secuela) {
        super(nombre, director, escenas_memorables);
        this.secuela = secuela;
    }
    public void setSecuela(){
        System.out.println("Tiene secuelas: ");
    }
}
