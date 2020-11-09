package ejercicio5;

public class Autobús 
{
	public int numLínea;
	public String matrícula;
	public static short numAutobuses = 0;
	
	public Autobús(String ma)
	{
		int max = 100;
		int min = 1;
		numLínea = (int)(min + Math.random() * (max - min + 1));
		matrícula = ma;
		numAutobuses++;
	}
	
	public void Mostrar()
	{
		System.out.println("Línea: " + numLínea + "\tMatrícula " + matrícula + "\tNº Autobuses: " + numAutobuses);
	}
	public static void main(String[] args) 
	{
		Autobús a1 = new Autobús("2093 GSW");
		a1.Mostrar();
		Autobús a2 = new Autobús("1234 BCD");
		a2.Mostrar();
		Autobús a3 = new Autobús("0202 ZBF");
		a3.Mostrar();
		Autobús a4 = new Autobús("3685 HDP");
		a4.Mostrar();
	}

}
