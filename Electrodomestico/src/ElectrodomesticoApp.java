/***
 * @author evelyn
 * Version 2 clase Electrodomestico
 * Fecha de edicion: 14/07/2021
 */
public class ElectrodomesticoApp {

	public static void main(String[] args) {
		
		//creacion de una lista llena de objetos tipo electrodomestico
		
		Electrodomestico lis[] = new Electrodomestico[10];
		lis[0] = new Lavadora(50f,"Amarillo",'B',61f,200f);
		lis[1] = new Television(30f, "Blanco",'L',300f,20f, true);
		lis[2] = new Electrodomestico(90f,"Negro",'A',402.3f);
		lis[3] = new Lavadora(200f, "Gris",'f',154.2f,230f);
		lis[4] = new Lavadora(180f,"verde",'D',91f, 120f);
		lis[5] = new Television(120f, "Blanco",'e',210f,19.3f,false);
		lis[6] = new Lavadora(179f,"lila",'a',199f,150f);
		lis[7] = new Lavadora(30f, "Blanco",'L',300f,150f);
		lis[8] = new Television(50.2f,"Amarillo",'B',61f,15f,true);
		lis[9] = new Lavadora(300f, "rojo",'L',100f,210f);
		
		//variables acumuladoras
		
		float precioLavadora=0;
		float precioTelevision=0;
		float precioTotal=0;
		
		//for para calcular el precio de cada tipo y el total de electrodomesticos
		
		for (int i=0; i<lis.length; i++)
		{
			
			if (lis[i] instanceof Lavadora)
			{
				lis[i].precioFinal();
				precioLavadora+=lis[i].precioBase;
				precioTotal += lis[i].precioBase;
			}
			else {
				if(lis[i] instanceof Television)
				{
					lis[i].precioFinal();
					precioTelevision+=lis[i].precioBase;
					precioTotal += lis[i].precioBase;
				}
				else
				{
					lis[i].precioFinal();
					precioTotal += lis[i].precioBase;
				}
			}
				
		}
		
		//muestra por pantalla de los precios 
		
		System.out.println("El precio de todo el conjunto de electrodomesticos es: "+precioTotal);
		System.out.println("El precio de las lavadoras es: "+precioLavadora);
		System.out.println("El precio de las televisiones es: "+precioTelevision);
	}
}
