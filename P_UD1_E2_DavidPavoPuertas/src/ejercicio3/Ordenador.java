package ejercicio3;

public class Ordenador
{
	public String sistemaOperativo;
	public String fabricante;
	public int RAM;
	
	public Ordenador(String so, String f)
	{
		sistemaOperativo = so;
		fabricante = f;
		RAM = (int)(Math.random() * 4);
	}
	public Ordenador(String f)
	{
		sistemaOperativo = "Windows";
		fabricante = f;
		RAM = (int)(Math.random() * 4);
	}
	
	public void Mostrar()
	{
		if (RAM == 0)
		{
			System.out.println("Sistema Operativo: " + sistemaOperativo + " " + "Fabricante: " + fabricante + " " + "RAM: 8");
		}
		if (RAM == 1)
		{
			System.out.println("Sistema Operativo: " + sistemaOperativo + " " + "Fabricante: " + fabricante + " " + "RAM: 16");
		}
		if (RAM == 2)
		{
			System.out.println("Sistema Operativo: " + sistemaOperativo + " " + "Fabricante: " + fabricante + " " + "RAM: 32");
		}
		if (RAM == 3)
		{
			System.out.println("Sistema Operativo: " + sistemaOperativo + " " + "Fabricante: " + fabricante + " " + "RAM: 64");
		}
	}
	
	public static void main(String[] args) 
	{
		Ordenador o1 = new Ordenador("Linux","Dell");
		o1.Mostrar();
		Ordenador o2 = new Ordenador("Linux","Toshiba");
		o2.Mostrar();
		Ordenador o3 = new Ordenador("Dell");
		o3.Mostrar();
		Ordenador o4 = new Ordenador("Toshiba");
		o4.Mostrar();

	}

}
