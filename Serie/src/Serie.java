/***
 * clase serie
 * @author evelyn
 *
 */
public class Serie implements Entregable{

	//atributos
	
	private String titulo;
	private int nTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	private final static int TEMPORADA = 3;
	private final static boolean ENTREGADO = false;
	
	//constructores
	
	public Serie()
	{
		this.titulo = "";
		this.nTemporadas = TEMPORADA;
		this.entregado = ENTREGADO;
		this.genero = "";
		this.creador = "";
		
	}
	
	public Serie(String titulo, String creador)
	{
		this();
		this.titulo = titulo;
		this.creador = creador;
	}
	
	public Serie(String titulo, int nTemporadas, String genero, String creador) {
		this(titulo,creador);
		this.nTemporadas = nTemporadas;
		this.genero = genero;
	}
	
	//getters y setters

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getnTemporadas() {
		return nTemporadas;
	}

	public void setnTemporadas(int nTemporadas) {
		this.nTemporadas = nTemporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}
	//metodo to string

	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", nTemporadas=" + nTemporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
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
		Serie s = (Serie)a;
		if (s.nTemporadas > this.nTemporadas)
			return s;
		else
			return this;
	}
	
}
