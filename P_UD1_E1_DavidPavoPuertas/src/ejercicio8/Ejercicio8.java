package ejercicio8;

public class Ejercicio8 
{

	public static void main(String[] args) 
	{
		int max = 100;
		int x = (int) (Math.random() * (max + 1));
		System.out.println(x);
		
		while (x >= 5) 
		{
			x = (int) (Math.random() * (max + 1));
			System.out.println(x);
		}

	}

}
