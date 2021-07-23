/***
 * clase videojuego
 * @author evelyn
 *
 */
public class Videojuego implements Entregable{

	//atributos
	
	private String titulo;
	private int horas;
	private boolean entregado;
	private String genero;
	private String compania;
	
	private final static int HORAS = 10;
	private final static boolean ENTREGADO = false;
	
	//constructores 
	
	public Videojuego() {
		this.titulo="";
		this.horas=HORAS;
		this.entregado = ENTREGADO;
		this.genero = "";
		this.compania = "";
	}
	public Videojuego(String titulo, int horas) {
		this();
		this.titulo = titulo;
		this.horas = horas;
	}
	public Videojuego(String titulo, int horas, String genero, String compania) {
		this(titulo,horas);
		this.genero = genero;
		this.compania = compania;
	}
	
	//getters y setters
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCompania() {
		return compania;
	}
	public void setCompania(String compania) {
		this.compania = compania;
	}
	//metodo to string
	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horas=" + horas + ", entregado=" + entregado + ", genero=" + genero
				+ ", compania=" + compania + "]";
	}	
	//metodos
	
	public void entregar()
	{
		this.entregado = true;
	}
	public void devolver()
	{
		this.entregado = false;
	}
	public boolean isEntregado()
	{
		return this.entregado;
	}
	
	public Object compareTo(Object a)
	{
		Videojuego v = (Videojuego)a;
		if (v.horas>this.horas)
			return v;
		else
			return this;
	}
}
