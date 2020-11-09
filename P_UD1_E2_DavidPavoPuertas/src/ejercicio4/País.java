package ejercicio4;

public class País 
{
	public String capital;
	public int población;
	
	public País(String c)
	{
		int min = 1;
		int max = 10;
		capital = c;
		población = (int)(min + Math.random() * (max - min + 1));
	}
	public País(int p)
	{
		int x = (int)(Math.random() * 4);
		if (x == 0)
		{
			capital = "Roma";
		}
		if (x == 1)
		{
			capital = "Berlín";
		}
		if (x == 2)
		{
			capital = "Tokyo";
		}
		if (x == 3)
		{
			capital = "Buenos Aires";
		}
		población = p;
	}
	public void Mostrar()
	{
		
		System.out.println("Capital: " + capital + " " + "Población: " + población + " millones");
		
	}
	public static void main(String[] args) 
	{
		País p1 = new País("Ottawa ");
		p1.Mostrar();
		País p2 = new País("Nairobi");
		p2.Mostrar();
		País p3 = new País(7);
		p3.Mostrar();
		País p4 = new País(2);
		p4.Mostrar();

	}

}
