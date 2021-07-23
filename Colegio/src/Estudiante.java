
public class Estudiante extends Persona{

	//atributos
	
	private float nota;

	//constructores 
	
	public Estudiante() {
		super();
		this.nota = 0;
		// TODO Auto-generated constructor stub
	}

	public Estudiante(String nombre, int edad, char sexo,float nota) {
		super(nombre, edad, sexo);
		vNota(nota);
		// TODO Auto-generated constructor stub
	}

	public Estudiante(String nombre) {
		super(nombre);
		this.nota = 0;
		// TODO Auto-generated constructor stub
	}
	
	//metodo para comprobar si la nota esta en el rango valido
	
	private void vNota(float nota)
	{
		if (nota >= 0 && nota <= 10)
			this.nota = nota;
		else
			nota=0; // si la nota no esta en el rango valido le daremos un 0 por defecto
	}
	
	//metodo para ver si la edad del alumno es coherente
	
	 public void vEdad(int edad)
	 {
		 if(edad >=10 && edad <=60) //considero edad minima para saltarse clase 10 y edad maxima para estudiar 60(por decir)
			 this.edad=edad;
		 else
			 this.edad =0;//si la edad del alumno no esta entre 10 y 60 la inicializamos a 0 por defecto
	 }
	
	//metodo para calcular la asistencia
	
	public void asistencia()
	{
		int rand = (int)(Math.floor((Math.random()*2+0)));
		if (rand == 0)
			this.falta = true;
		else
			this.falta = false;
	}
	
	//getters y setters

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		vNota(nota);
	}

	//toString
	@Override
	public String toString() {
		return "Estudiante [nota=" + nota + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", falta="
				+ falta + "]";
	}

}
