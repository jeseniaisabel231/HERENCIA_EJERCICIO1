public class Exorsismo extends PeliculaTerror{
    //atributo
    int secuelas;

    //constructor


    public Exorsismo(String nombre, String director, String escenas_terror, int secuelas) {
        super(nombre, director, escenas_terror);
        this.secuelas = secuelas;
    }

    public void setSecuelas(){
        System.out.println("Est pelicula tiene: ");
    }
}
