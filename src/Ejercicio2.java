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
        int numero = 154326;
        System.out.println("El numero tiene "+numCifras(numero)+" cifras");
    }
    
}
