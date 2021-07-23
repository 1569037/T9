public class Libro {

	//atributos
	
	private String isbn;
	private String titulo;
	private String autor;
	private int nPag;
	
	//constructores
	
	public Libro()
	{
		this.isbn = "";
		this.titulo = "";
		this.autor = "";
		this.nPag = 0;
	}
	
	public Libro(String isbn, String titulo)
	{
		this();
		this.isbn = isbn;
		this.titulo = titulo;
	}
	
	public Libro(String isbn, String titulo, String autor, int pag)
	{
		this(isbn,titulo);
		this.autor=autor;
		this.nPag=pag;
	}
	
	//getters y setters
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getnPag() {
		return nPag;
	}
	public void setnPag(int nPag) {
		this.nPag = nPag;
	}
	
	//to string
	@Override
	public String toString() {
		return "El libro con ISBN "+ this.isbn+" creado por el autor "+this.autor+" tiene "+this.nPag+" paginas";
	}
	
	//metodo compareTo
	
	public void compareTo(Libro l)
	{
		if(l.nPag>this.nPag)
			System.out.println("El libro con mas paginas es "+l.titulo+" del autor "+l.autor+" con "+l.nPag+ " paginas");
		else
			if(this.nPag> l.nPag)
				System.out.println("El libro con mas paginas es "+this.titulo+" del autor "+this.autor+" con "+this.nPag+" paginas");
			else
				System.out.println("El libro "+this.titulo+ " y el libro "+l.titulo+" tienen las mismas paginas.");
	}
	
	
}
