import java.lang.Math;
public class Raices {

	//atributos
	
	private float a;
	private float b;
	private float c;
	
	//constructores 
	
	public Raices(float a, float b, float c)
	{
		this.a = a;
		this.c = c;
		this.b = b;
	}
	
	private void obtenerRaices(Double d)
	{
		
		float x1 = (float)((-this.b+Math.sqrt(d))/(2*this.a));
		float x2 = (float)((-this.b-Math.sqrt(d))/(2*this.a));
		System.out.println("Las dos soluciones son x1 = "+x1+" y x2 = "+x2);
	}
	
	private void obtenerRaiz()
	{
		float x = (-this.b/(2*this.a));
		System.out.println("La solucion es: "+x);
	}
	
	private double getDiscriminate()
	{
		double d = (Math.pow(b,2)-(4*this.a*this.c));
		return d;
	}
	
	private boolean tieneRaices(Double d)
	{
		if (d >=0)
			return true;
		else
			return false;
	}
	
	private boolean tieneRaiz(Double d)
	{
		if(d == 0)
			return true;
		else
			return false;
	}
	
	public void calcular()
	{
		if(tieneRaices(getDiscriminate()))
			if(tieneRaiz(getDiscriminate()))
				obtenerRaiz();
			else
				obtenerRaices(getDiscriminate());
		else
			System.out.println("La ecuacion no tiene solucion");			
	}
		
	
}
