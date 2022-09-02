package Ejercicio24;

public class Lapiz {

    public int precio = 3;
    public String marca = "Faber Castell";
    public String color = "Blanco";

    public int mostrarPrecio()
    {
        return precio;
    }

    public String mostrarColor()
    {
        return color;
    }

    public String mostrarmarca()
    {
        return marca;
    }
    public static void main(String args[])
        {
            Lapiz lapiz = new Lapiz();
    
            System.out.println("El precio del lapiz es: " + lapiz.mostrarPrecio());
            System.out.println("Marca " + lapiz.mostrarmarca());
            System.out.println("Color: " + lapiz.mostrarColor());
        }
    

}
