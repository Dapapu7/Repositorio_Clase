package ejercicio5;

public class Ejercicio5 
{

	public static void main(String[] args)
	{
		short a = 40;
		short b = 10;
		short c = 14;
		
		if ((a >= b) && (a >= c))
		{
			System.out.println(a + " es el mayor n�mero");
		}
		else if ((b >= a) && (b >= c)) 
		{
			System.out.println(b + " es el mayor n�mero");
		}
		else if ((c >= a) && (c >= b)) 
		{
			System.out.println(c + " es el mayor n�mero");
		}
		
		if ((a <= b) && (a <= c))
		{
			System.out.println(a + " es el menor n�mero");
		}
		else if ((b <= a) && (b <= c)) 
		{
			System.out.println(b + " es el menor n�mero");
		}
		else if ((c <= a) && (c <= b)) 
		{
			System.out.println(c + " es el menor n�mero");
		}
	

	}

}
