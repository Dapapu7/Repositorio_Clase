package ejercicio2;

public class Alumno
{
	public int programaci�n;
	public int sistemasInform�ticos;
	public int lenguajeMarcas;
	
	public Alumno()
	{
		programaci�n = (int) (Math.random() * 10);
		sistemasInform�ticos = 20;
		lenguajeMarcas = (int) (Math.random() * 10);
	}
	
	public void Mostrar()
	{
		if (sistemasInform�ticos == 20) 
		{
			System.out.println("P: " + programaci�n + " " + "SI: No calificado " + "LM: " + lenguajeMarcas);
		}
		else if (programaci�n == 20) 
		{
			System.out.println("P: " + "No calificado" + " " + "SI: sistemasInform�ticos " + "LM: " + lenguajeMarcas);
		}
		else if (lenguajeMarcas == 20) 
		{
			System.out.println("P: " + programaci�n + " " + "SI: sitemasInform�ticos " + "LM: " + "No calificado");
		}
		
	}
	public static void main(String[] args) 
	{
		Alumno a1 = new Alumno();
		a1.Mostrar();
		Alumno a2 = new Alumno();
		a2.Mostrar();
		Alumno a3 = new Alumno();
		a3.Mostrar();
		Alumno a4 = new Alumno();
		a4.Mostrar();

	}

}
