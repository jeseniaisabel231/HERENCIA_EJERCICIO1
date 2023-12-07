public class Zombie extends PeliculaTerror{
    //atributo
    int premio;
    //constructor


    public Zombie(String nombre, String director, String escenas_terror, int premio) {
        super(nombre, director, escenas_terror);
        this.premio = premio;
    }

    public void setPremio(){
        System.out.println("Sus premios son: ");
    }
}
