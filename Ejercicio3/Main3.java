package Ejercicio3;

public class Main3
{
	public static void main(String args[])
    {
        Mesa descripcion = new Mesa(); 

        System.out.println("Color: "+descripcion.mostrarColor());
        System.out.println("Material: "+descripcion.mostrarmaterial());
        System.out.println("Horas de trabajo: "+descripcion.mostrarhorasdetrabajo());
    }
}