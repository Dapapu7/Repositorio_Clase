package ejercicio7;

public class Ejercicio7
{
	public static void main(String[] args)
	{
		int max = 3;
		int x = (int) (Math.random() * (max + 1));
		System.out.println(x);
		
		while (x != 3) 
		{
			x = (int) (Math.random() * (max + 1));
			System.out.println(x);
		}
			
	}
}
	

