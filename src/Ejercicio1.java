public class Ejercicio1 {
    
    public static String saludo(String nombre){
        String cadenaSaludo = "Hola "+nombre;
        return cadenaSaludo;
    }
    public static void main(String[] args) {
        String nombre = "Tripulante P61";

        String saludoCompleto = saludo(nombre);

        System.out.println(saludoCompleto);
    } 
}
