package Ejercicio29;

public class Main29
 {
    public static void main(String arg[])
    {
        Taxi taxi = new Taxi();
        
        System.out.println("Modelo:"+ taxi.mostrarModelo());
        System.out.println("Placa del Taxi:"+ taxi.mostrarPlaca());
        System.out.println("Pasaje :"+ taxi.mostrarPasaje());
    }
}
