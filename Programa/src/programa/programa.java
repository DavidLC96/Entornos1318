package programa;
import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
        
        System.out.println("Vamos a jugar");
        Scanner scan = new Scanner(System.in);
        
        boolean jugar = true;
        
        while (jugar) {
            int adivinar = 1 + (int) (10.0 * Math.random());
            System.out.print("Dime un numero de 1 al 10: ");
            int num = scan.nextInt();
            
            if (num == adivinar) {
                System.out.println("¡Acertaste! :D");
                jugar = false;
            }
            
            if (num <= 0) {
                System.out.println("Adios...");
                jugar = false;
            }
            else {
                System.out.println("¡No! Era el " + adivinar);
             }
        }
    }
}
