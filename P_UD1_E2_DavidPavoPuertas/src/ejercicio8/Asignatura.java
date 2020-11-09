package ejercicio8;

public class Asignatura 
{
	
	public int numAlumnos;
	public String nombre;
	public static int contador = 0;
	public static int total = 0;
	public static double mediaAlumnos = 0;
	
	
	public Asignatura(String nom)
	{
		int max = 30;
		int min = 15;
		numAlumnos = (int)(min + Math.random() * (max - min + 1));
		nombre = nom;
		
		contador++;
		total += numAlumnos;
		mediaAlumnos = total / contador;
	}	
	
	public void Mostrar()
	{
		System.out.println("Nº Alumnos: " + numAlumnos + "\tNombre: " + nombre + "\tMedia de alumnos: " + mediaAlumnos);
	}
	
	public static void main(String[] args)
	{
		Asignatura a1 = new Asignatura("Matemáticas");
		a1.Mostrar();
		Asignatura a2 = new Asignatura("Lengua     ");
		a2.Mostrar();
		Asignatura a3 = new Asignatura("Informática");
		a3.Mostrar();
		Asignatura a4 = new Asignatura("Historia");
		a4.Mostrar();

	}

}
