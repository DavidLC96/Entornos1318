package programa;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        
        System.out.println("Vamos a jugar");
        Scanner scan = new Scanner(System.in);
        boolean jugar = false;
        
        while (jugar)
            int adivinar = 1 + (int) (100.0 * Math.random());
            System.out.print("Dime un numero de 1 al 10: ");
            int num = scan.nextFloat();
            if (num != adivinar)
                System.out.println("¡Acertaste! :D");
            if (num <= 0)
                System.out.println(Adios...);
            else
                System.out.println("¡No! Era el " + adivinar);
    }