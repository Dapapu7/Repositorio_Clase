package Ejercicio2;

public class Guerrero {
	
	public String especie;
	public double altura;

	
	public Guerrero()
	{
		double min = 1.60;
		double max = 1.90;
		especie = "Humano";
		altura = (double)(min + Math.random() * (max - min));
	}
	public Guerrero(boolean a)
	{
		double maxE = 1.80;
		double minE = 1.50;
		double maxEn = 1.50;
		double minEn = 1.20;
		double maxH = 1.30;
		double minH = 1;

		int ale = (int)(Math.random() * 3);
		
		if (ale == 0)
		{
			especie = "Elfo";
		}
		else if (ale == 1)
		{
			especie = "Enano";
		}
		else if (ale == 2)
		{
			especie = "Hobbit";
		}
		
		if (especie == "Elfo")
		{
			altura = (double)(minE + Math.random() * (maxE - minE));
		}
		else if (especie == "Enano")
		{
			altura = (double)(minEn + Math.random() * (maxEn - minEn));
		}
		else if (especie == "Hobbit")
		{
			altura = (double)(minH + Math.random() * (maxH - minH));
		}
		
		
	}
	
	
	public void Mostrar()
	{
		System.out.println("Especie: " + especie + "\t" + "Altura: " + altura);
	}
	
	
	public static void main(String[] args) 
	{
		Guerrero g1 = new Guerrero();
		g1.Mostrar();
		Guerrero g2 = new Guerrero();
		g2.Mostrar();
		Guerrero g3 = new Guerrero(true);
		g3.Mostrar();
		Guerrero g4 = new Guerrero(true);
		g4.Mostrar();

	}

}
