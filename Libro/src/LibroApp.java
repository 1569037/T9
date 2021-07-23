/***
 * @author evelyn
 * Ejercicio Libro version 1
 * Fecha de edicion 14/07/2021
 */
public class LibroApp {

	public static void main(String[] args) {
		
		Libro l = CrearLibros("2434029430E", "La puerta rota", "Miguel Torres", 1002);
		Libro p = CrearLibros("3432232423", "El manillar del vecino", "Pilar Moreno", 1002);
		l.compareTo(p);
	}
	
	public static Libro CrearLibros(String isbn, String titulo, String autor, int nPag)
	{
		Libro l = new Libro(isbn,titulo,autor,nPag);
		System.out.println(l.toString());
		return l;
	}

}
