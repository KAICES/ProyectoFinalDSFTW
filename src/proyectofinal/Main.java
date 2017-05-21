package proyectofinal;
import java.util.Scanner;


/**
 *
 * @author KAICES
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);	
        
        double a , b ;
        
        System.out.println("Numero del extremo izquierdo : ");
        a = leer.nextInt();
        System.out.println("Numero del extremo derecho : ");
        b = leer.nextInt();
        
        DividirVencer dvc = new DividirVencer(a,b);
        dvc.biseccion();
        
    }
    
}
