import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Ejercicio2 {
    public static int numCifras (int numero){
        var cifras = 0;

        while (numero != 0) {
            numero = numero / 10;
            cifras++;
        }
        return cifras;
    }


    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("Introduce un numero entero: ");
        int numero = sc.nextInt();
        System.out.println("El numero tiene "+numCifras(numero)+" cifras");
    }
    
}
