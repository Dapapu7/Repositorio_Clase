package ejercicio5;

public class Autob�s 
{
	public int numL�nea;
	public String matr�cula;
	public static short numAutobuses = 0;
	
	public Autob�s(String ma)
	{
		int max = 100;
		int min = 1;
		numL�nea = (int)(min + Math.random() * (max - min + 1));
		matr�cula = ma;
		numAutobuses++;
	}
	
	public void Mostrar()
	{
		System.out.println("L�nea: " + numL�nea + "\tMatr�cula " + matr�cula + "\tN� Autobuses: " + numAutobuses);
	}
	public static void main(String[] args) 
	{
		Autob�s a1 = new Autob�s("2093 GSW");
		a1.Mostrar();
		Autob�s a2 = new Autob�s("1234 BCD");
		a2.Mostrar();
		Autob�s a3 = new Autob�s("0202 ZBF");
		a3.Mostrar();
		Autob�s a4 = new Autob�s("3685 HDP");
		a4.Mostrar();
	}

}
