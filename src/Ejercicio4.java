// Programa que lee una cantidad en grados centígrados y la pase a Fahrenheit
// La fórmula es: F = 32 + ( 9 * C / 5)

import java.util.Scanner;

public class Ejercicio4 {
    
    public static float centToFahr(float centigrados){
        var fahrenheit = (32 + (9 * centigrados/5));
        return fahrenheit;
    }

    //Interacción//////
    public static void saludo(){
        System.out.println("App Conversión de Centigrados a Fahrenheit");
    }

    public static float leerCentigrados(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese la cantidad en grados centígrados: ");
        var centigrados= sc.nextFloat();
        return  centigrados;
    }

    public static void reportarFahrenheit(float centigrados, float fahrenheit){
        System.out.println(centigrados+" grados centigrados equivalen a "+fahrenheit+" grados fahrenheit");   
    }


    public static void main(String[] args) {
        saludo();
        var centigrados = leerCentigrados();
        reportarFahrenheit(centigrados,centToFahr(centigrados));        
    }
}
