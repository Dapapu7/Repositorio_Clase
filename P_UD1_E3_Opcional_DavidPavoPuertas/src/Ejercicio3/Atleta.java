package Ejercicio3;

public class Atleta 
{
	
	public String nombre;
	public int oros;
	public int platas;
	public int bronces;
	public int total;
	
	
	public Atleta(String n, int o, int p, int b)
	{
		nombre = n;
		oros = o;
		platas = p;
		bronces = b;
		total = oros + platas + bronces;
	}
	public Atleta()
	{
		nombre = "Usain Bolt";
		oros = 4;
		platas =6;
		bronces =1;
		total = oros + platas + bronces;
	}
	
	
	public void Mostrar()
	{
		System.out.println("Atleta: " + nombre + " " + "Oros: " + oros + " " + "Platas: " + platas + " " + "Bronces: " + bronces + " " + "Total de medallas: " + total);
	}
	
	
	public static void main(String[] args)
	{
		Atleta a1 = new Atleta("Usain Bolt",8,0,0);
		a1.Mostrar();
		Atleta a2 = new Atleta("Fanny Blankers-Koen",4,0,0);
		a2.Mostrar();
		Atleta a3 = new Atleta("Ville Ritola",5,3,0);
		a3.Mostrar();
		Atleta a4 = new Atleta();
		a4.Mostrar();
		
	}

}
