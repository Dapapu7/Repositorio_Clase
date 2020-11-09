package ejercicio7;

public class Aleatorios 
{
	
	public short aleatorio;
	public static double total = 0;
	public static double contador = 0;
	public static double mediaAleatorios = 0;
	
	public Aleatorios()
	{
		short max = 20;
		short min = 10;
		aleatorio = (short)(min + Math.random() * (max - min + 1));
		
		contador++;
		total += aleatorio;
		mediaAleatorios = aleatorio / contador;
	}
	
	public void Mostrar()
	{
		System.out.println("Aleatorio: " + aleatorio + "\tTotal: " + total + "\tContador: " + contador + "\tmediaAleatorios: " + mediaAleatorios);
	}

	public static void main(String[] args) 
	{
		Aleatorios a1 = new Aleatorios();
		a1.Mostrar();
		Aleatorios a2 = new Aleatorios();
		a2.Mostrar();
		Aleatorios a3 = new Aleatorios();
		a3.Mostrar();
		Aleatorios a4 = new Aleatorios();
		a4.Mostrar();
		Aleatorios a5 = new Aleatorios();
		a5.Mostrar();
		Aleatorios a6 = new Aleatorios();
		a6.Mostrar();
		Aleatorios a7 = new Aleatorios();
		a7.Mostrar();
		
	}

}
