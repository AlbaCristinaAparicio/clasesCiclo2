//Escribe un programa java que lea una variable de tipo entero y asígnale un valor.
//A continuación muestra un mensaje indicando si la variable es par o impar.
//Utiliza el operador condicional ( ? : ) para resolverlo.
//Ej: “14 es par” o “15 es impar”
import java.util.Scanner;
public class Ejercicio5 {

    public static String verificarParImpar (int numero) {
        String tipoParImpar= (numero%2==0)? "Par.": "Impar.";
        return tipoParImpar;
    }

    //Interacción//////
    public static void saludo(){
        System.out.println("App Conversión de Centigrados a Fahrenheit");
    }

    public static int leerNumero(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese el numero a evaluar: ");
        var numero= sc.nextInt();
        return  numero;
    }

    public static void reportarParImpar(int numero, String tipoParImpar){
        System.out.println("El número "+numero+" es "+tipoParImpar);   
    }
    public static void main(String[] args) {
        saludo();
        var numero = leerNumero();
        reportarParImpar(numero,verificarParImpar(numero));  
    }


}
