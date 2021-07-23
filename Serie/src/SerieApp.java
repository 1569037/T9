/***
 * Ejercicio2 version 1
 * @author evelyn
 * Fecha de edicion 14/07/2021
 * A pesar de que el ejecutable se llama SerieApp no unicamente contiene la clase Serie, tambien contiene objetos Videojuego
 */
public class SerieApp {

	public static void main(String[] args) {
		
		
		//declaracion de arrays de serie y videojuegos
		
		Serie s[] = new Serie[5];
		Videojuego v[] = new Videojuego[5];
		s[0] = new Serie("Sabrina",3,"Suspense", "Pepe");
		s[1] = new Serie("STA", "Maria");
		s[2] = new Serie();
		s[3] = new Serie("FAW", 7, "Amor", "Paula");
		s[4] = new Serie("Fluffis", 1, "Accion","Felipe");
		
		v[0]= new Videojuego("Uncharted", 32, "Aventura", "Misco");
		v[1] = new Videojuego("LOL", 9838492, "PerdidaDeVida", "Riot");
		v[2] = new Videojuego("Maincra", 4232, "Aventura","Nose");
		v[3] = new Videojuego("Valorant", 80, "Shotter", "Riot");
		v[4] = new Videojuego("El Juego de la vida", 134234, "Drama", "Diosito");
		
		//entrega de algunas series y videojuegos
		for (int i=0; i< s.length; i++)
		{
			if (i%2 == 0)
			{
				s[i].entregar();
				v[i].entregar();
			}
		}
		int contS = 0;
		int contV = 0;
		
		//recuento de series y videojuegos entregados y su posterior devolucion
		
		for (int i=0; i<s.length; i++)
		{
			if (s[i].isEntregado())
			{
				contS+=1;
				s[i].devolver();
			}
			if(v[i].isEntregado())
			{
				contV+=1;
				v[i].devolver();
			}	
		}
		System.out.println("Antes de ser devueltos habia "+contS+" series prestadas y "+contV+" videojuegos prestados");
		Serie m = s[0];
		Videojuego l = v[0];
		
		//comprovacion de la serie con mas temporadas y el juego con mas horas
		
		for (int i=0; i< s.length; i++)
		{
			m = (Serie) s[i].compareTo(m);
			l = (Videojuego) v[i].compareTo(l);		
		}
		System.out.println(m.toString());
		System.out.println(l.toString());
	}

}
