package ejercicio1;

public class Película 
{
	public int duración;
	public String título;
	public String director;
	
	public Película(String t, int du, String d)
	{
		duración = du;
		título = t;
		director = d;
	}
	
	public void Mostrar()
	{
		System.out.println("Título: " + título + "\tDuración: " + duración + " " + "Director: " + director);
	}
	public static void main(String[] args) 
	{
		Película p1 = new Película("El señor de los anillos",180,"Peter Jackson");
		p1.Mostrar();
		Película p2 = new Película("Tiburón	         ",120,"Steven Spielberg");
		p2.Mostrar();

	}

}
