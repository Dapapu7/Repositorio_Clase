package ejercicio2;

public class Alumno
{
	public int programación;
	public int sistemasInformáticos;
	public int lenguajeMarcas;
	
	public Alumno()
	{
		programación = (int) (Math.random() * 10);
		sistemasInformáticos = 20;
		lenguajeMarcas = (int) (Math.random() * 10);
	}
	
	public void Mostrar()
	{
		if (sistemasInformáticos == 20) 
		{
			System.out.println("P: " + programación + " " + "SI: No calificado " + "LM: " + lenguajeMarcas);
		}
		else if (programación == 20) 
		{
			System.out.println("P: " + "No calificado" + " " + "SI: sistemasInformáticos " + "LM: " + lenguajeMarcas);
		}
		else if (lenguajeMarcas == 20) 
		{
			System.out.println("P: " + programación + " " + "SI: sitemasInformáticos " + "LM: " + "No calificado");
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
