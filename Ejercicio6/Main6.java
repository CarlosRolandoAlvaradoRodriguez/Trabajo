package Ejercicio6;
public class Main6
{
	public static void main(String args[])
    {
        Colegio descripcion = new Colegio(); 

        System.out.println("Cantidad de aulas: "+descripcion.mostrarCantidaddeaulas());
        System.out.println("estudiantes: "+descripcion.mostrarestudiantes());
        System.out.println("Tipo de educacion: "+descripcion.mostrartipodeeducacion());
    }
}