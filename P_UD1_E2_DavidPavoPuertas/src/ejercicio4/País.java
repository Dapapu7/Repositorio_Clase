package ejercicio4;

public class Pa�s 
{
	public String capital;
	public int poblaci�n;
	
	public Pa�s(String c)
	{
		int min = 1;
		int max = 10;
		capital = c;
		poblaci�n = (int)(min + Math.random() * (max - min + 1));
	}
	public Pa�s(int p)
	{
		int x = (int)(Math.random() * 4);
		if (x == 0)
		{
			capital = "Roma";
		}
		if (x == 1)
		{
			capital = "Berl�n";
		}
		if (x == 2)
		{
			capital = "Tokyo";
		}
		if (x == 3)
		{
			capital = "Buenos Aires";
		}
		poblaci�n = p;
	}
	public void Mostrar()
	{
		
		System.out.println("Capital: " + capital + " " + "Poblaci�n: " + poblaci�n + " millones");
		
	}
	public static void main(String[] args) 
	{
		Pa�s p1 = new Pa�s("Ottawa ");
		p1.Mostrar();
		Pa�s p2 = new Pa�s("Nairobi");
		p2.Mostrar();
		Pa�s p3 = new Pa�s(7);
		p3.Mostrar();
		Pa�s p4 = new Pa�s(2);
		p4.Mostrar();

	}

}
