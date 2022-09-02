package Ejercicio30;

public class Main30
{
    public static void main(String arg[])
    {
        
        Productos  productos= new Productos();
 
        System.out.println("Nombre del Producto:"+ productos.mostrarnombreproducto());
        System.out.println("Fecha de vencimiento:"+ productos.mostrarfechadevencimiento());
        System.out.println("Codigo de Productos:"+ productos.mostrarCodigo());
    }
}
