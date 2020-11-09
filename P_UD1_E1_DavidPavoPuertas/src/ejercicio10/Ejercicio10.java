package ejercicio10;

public class Ejercicio10 
{

	public static void main(String[] args)
	{
		int max = 12, min = 1;
		int x = (int) (min + (Math.random() * (max - min + 1)));
		
		switch (x) 
		{
		case 1:
			System.out.println(x + " --> Enero");break;
		case 2:
			System.out.println(x + " --> Febrero");break;
		case 3:
			System.out.println(x + " --> Marzo");break;
		case 4:
			System.out.println(x + " --> Abril");break;
		case 5:
			System.out.println(x + " --> Mayo");break;
		case 6:
			System.out.println(x + " --> Junio");break;
		case 7:
			System.out.println(x + " --> Julio");break;
		case 8:
			System.out.println(x + " --> Agosto");break;
		case 9:
			System.out.println(x + " --> Septiembre");break;
		case 10:
			System.out.println(x + " --> Octubre");break;
		case 11:
			System.out.println(x + " --> Noviembre");break;
		case 12:
			System.out.println(x + " --> Diciembre");break;
		default:
			
		}
		

	}

}
