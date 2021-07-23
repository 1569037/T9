import java.lang.Math;
public abstract class Persona {

	//atributos
	
	protected String nombre;
	protected int edad;
	protected char sexo;
	protected boolean falta;
	
	//constructores
	
	public Persona()
	{
		this.nombre="";
		this.edad = 0;
		this.sexo = '-';
		asistencia();
	}
	public Persona(String nombre)
	{
		this();
		this.nombre = nombre;
	}
	public Persona(String nombre, int edad, char sexo)
	{
		this(nombre);
		vEdad(edad);
		vSexo(sexo);
	}
	
	//getters y setters
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		vEdad(edad);
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		vSexo(sexo);
	}
	public boolean isFalta() {
		return falta;
	}
	public void setFalta(boolean falta) {
		this.falta = falta;
	}
	
	//toString
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + "]";
	}
	
	//metodo de asistencia
	
	abstract public void asistencia();
	abstract public void vEdad(int edad);
	public void vSexo(char c)
	{
		String sexo = String.valueOf(c).toUpperCase();
		if (sexo.charAt(0) != 'H' && sexo.charAt(0) != 'M')
			this.sexo = 'M'; //si el sexo introducido no es valido iniciamos la variable sexo a mujer
		else
			this.sexo = c;
		
	}
	
	
	
}
