package Ejercicio28;

public class Main28
 {
    public static void main(String arg[])
    {
        
        Pasajero pasajero = new Pasajero();
        
        System.out.println("Nombre del Pasajero:"+ pasajero.mostrarNombrePasajero());
 
        System.out.println("Origen:"+ pasajero.mostrarOrigen());
 
        System.out.println("Destino:"+ pasajero.mostrarDestino());
    }
}
