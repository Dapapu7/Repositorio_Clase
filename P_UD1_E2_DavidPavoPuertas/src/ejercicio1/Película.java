package ejercicio1;

public class Pel�cula 
{
	public int duraci�n;
	public String t�tulo;
	public String director;
	
	public Pel�cula(String t, int du, String d)
	{
		duraci�n = du;
		t�tulo = t;
		director = d;
	}
	
	public void Mostrar()
	{
		System.out.println("T�tulo: " + t�tulo + "\tDuraci�n: " + duraci�n + " " + "Director: " + director);
	}
	public static void main(String[] args) 
	{
		Pel�cula p1 = new Pel�cula("El se�or de los anillos",180,"Peter Jackson");
		p1.Mostrar();
		Pel�cula p2 = new Pel�cula("Tibur�n	         ",120,"Steven Spielberg");
		p2.Mostrar();

	}

}
