
public class Profesor extends Persona implements Materiable{

	//atributos
	private Materia mat; 

	//constructores
	
	public Profesor() {
		super();
		this.mat = Materia.MATEMATICAS;
	}

	public Profesor(String nombre, int edad, char sexo, String mat) {
		super(nombre, edad, sexo);
		materia(mat); //metodo que comprueba si la materia introducida se encentra en las posibles
	}

	public Profesor(String nombre) {
		super(nombre);
		this.mat=Materia.MATEMATICAS;
		
	}
	
	//metodo para mirar si la materia introducida es correcta
	
	public void materia (String mat)
	{
		String c = mat.toUpperCase();
		boolean comp = false;
		for (Materia i: Materia.values()) //comprobar si la materia es valida en caso contrario coger la materia por defecto
		{
			if(i.name().equals(c))
			{
				this.mat= Materia.valueOf(c);
				comp = true;
			}
		}
		if (comp == false)
			this.mat = Materia.MATEMATICAS;
	}
	
	//metodo para ver si la edad del profesor es coherente
	
		 public void vEdad(int edad)
		 {
			 if(edad >=23 && edad <=70) //considero edad minima para ser profesor los 23 y edad maxima los 70
				 this.edad=edad;
			 else
				 this.edad =0;//si la edad del profesor no esta entre el rango anterior, la inicializamos a 0 por defecto
		 }
	
	//metodo calcular la ausencia
	
	public void asistencia()
	{
		int num = (int)(Math.floor((Math.random()*5+0)));
		if(num == 1)
			this.falta=true;
		else
			this.falta = false;
	}
	
	//getters y setters
	
	public Materia getMat() {
		return mat;
	}

	public void setMat(String mat) {
		materia(mat);
	}

	//to string
	
	@Override
	public String toString() {
		return "Profesor [mat=" + mat + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", falta=" + falta
				+ "]";
	}
}
