package Ejercicio9;
public class Main9
{
	public static void main(String args[])
    {
        Restaurante informacion = new Restaurante(); 

        System.out.println("RUC: "+informacion.mostrarRUC());
        System.out.println("Nombre: "+informacion.mostrarNombre());
        System.out.println("Capacidad: "+informacion.mostrarCapacidad());
    }
}