import java.util.Scanner;
public class Ejercicio3 {
    

    public static int[] dobleYtriple(int numero)
     {
          int[]resultado = new int[2];
          int doble = numero*2;
          int triple = numero*3;
          resultado[0]=doble;
          resultado[1]=triple;
          return resultado;
     }

     public static void main(String[] args) {

          var sc = new Scanner(System.in);
          System.out.println("Por favor ingrese un numero entero: ");
          var numero= sc.nextInt();
          var resultado1 = dobleYtriple(numero);
          System.out.println("El doble y triple del numero ingresado es: "+ resultado1[0] +","+resultado1[1]);
          
     }
     
}

