package Ejercicio1;

public class Cuadros 
{
	public String estilo;
	public String autor;
	public String siglo;
	
	public Cuadros(String au)
	{
		int ale = (int)(Math.random() * 2);
		if (ale == 0)
			estilo = "Realista    ";
		else if (ale == 1)
			estilo = "Impresionista ";
		autor = au;
		siglo = "XVII";
	}
	
	
	public void Mostrar()
	{
		System.out.println("El estilo es: " + estilo + "\tEl autor es: " + autor + "\tSiglo: " + siglo);
	}
	public static void main(String[] args) 
	{
		Cuadros c1 = new Cuadros("Velázquez");
		c1.Mostrar();
		Cuadros c2 = new Cuadros("Goya");
		c2.Mostrar();
		Cuadros c3 = new Cuadros("Van Gogh ");
		c3.Mostrar();
	}

}
