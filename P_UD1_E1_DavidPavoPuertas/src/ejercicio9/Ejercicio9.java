package ejercicio9;

public class Ejercicio9
{

	public static void main(String[] args)
	{
		int max = 1000; //Decir el maximo numero permitido
		int x = (int) (Math.random() * (max + 1)); //Implementa el modulo random
		System.out.println(x);
		
		if (x > 500) 
		{
			System.out.println("x es mayor");
		}
		if ((x <= 500) && (x >= 200)) 
		{
			System.out.println("x es mediano");
		}
		if (x < 200) 
		{
			System.out.println("x es pequeño");
		}
		
	}

}
