import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int opcion1, opcion2, opcion3;
        Scanner entrada=new Scanner(System.in)
        System.out.println("Peliculas");
        System.out.println("1. Peliculas de terror");
        System.out.println("2.Peliculas romanticas");
        opcion1= entrada.nextInt();

        if(opcion1==1){
            System.out.println("1. Zombies");
            System.out.println("2. Exorsismo");
            opcion2=entrada.nextInt();
            if(opcion2==1){
                Zombie zombie1=new Zombie("Estacion zombie", "Zack Efron", "Muerte de erick", )
            }
        }
        else if(opcion1==2){
            System.out.println("1. Distancia");
            System.out.println("2. Lejos");
            opcion3=entrada.nextInt();
        }


    }
}