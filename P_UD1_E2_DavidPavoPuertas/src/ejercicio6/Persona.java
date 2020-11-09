package ejercicio6;

public class Persona 
{
	
	public double altura;
	public static int numPersonas = 0;
	public static double totalAlturas = 0;

	public Persona()
	{
		double max = 1.95;
		double min = 1.55;
		altura = (double)(min + Math.random() * (max - min));
		
		numPersonas++;
		totalAlturas += altura;
	}
	
	public void Mostrar()
	{
		System.out.println("Altura: " + altura + "\tNº Personas: " + numPersonas + "\tTotal alturas: " + totalAlturas);
	}
	
	public static void main(String[] args) 
	{
		Persona p1 = new Persona();
		p1.Mostrar();
		Persona p2 = new Persona();
		p2.Mostrar();
		Persona p3 = new Persona();
		p3.Mostrar();
		Persona p4 = new Persona();
		p4.Mostrar();
		Persona p5 = new Persona();
		p5.Mostrar();
		Persona p6 = new Persona();
		p6.Mostrar();
	}

}
