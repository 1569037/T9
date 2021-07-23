public class Aula implements Materiable{

	//atributos 
	
	private int id;
	private int maxEstudiantes;
	private int numEs;
	private Estudiante estudiantes[];
	private Materia mat;
	
	//constructores
	
	public Aula()
	{
		this.id=0;
		this.maxEstudiantes = 0;
		this.numEs=0;
		this.mat=Materia.MATEMATICAS;
	}
	
	public Aula(int id)
	{
		this();
		this.id = id;
	}
	
	public Aula(int id, int maxEstudiantes, String mat, int numEs, Estudiante[] estudiantes)
	{
		this(id);
		this.maxEstudiantes=maxEstudiantes;
		if(numEs <= maxEstudiantes)
			this.numEs=numEs;
		else
			this.numEs=maxEstudiantes;
		this.estudiantes = new Estudiante[this.numEs];
		this.estudiantes = estudiantes;
		materia(mat);
	}
	
	//metodo que comprueba si la materia introducida es correcta
	
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
	
	//metodos para ver si en un aula se puede dar clase
	
	public boolean clase(Profesor p)
	{
		if ( !p.isFalta() && p.getMat().equals(this.mat) && this.numEs > (this.maxEstudiantes/2))
			return true;
		else
			if(p.isFalta())
			{
				System.out.println("No se puede dar clase porque el profesor ha faltado");
				if(this.numEs <= (this.maxEstudiantes/2))
					System.out.println("Ademas no hay suficientes estudiantes");
				return false;
			}
			else
			{
				if(!p.getMat().equals(this.mat))
				{
					System.out.println("El profesor que ha venido no da esta asignatura");
					if(this.numEs <= (this.maxEstudiantes/2))
						System.out.println("Ademas no hay suficientes estudiantes");
					return false;
				}
				else
					if(this.numEs <= (this.maxEstudiantes/2)) {
						System.out.println("No hay suficientes alumnos para dar clase");
						return false;
					}
				return false;
			}	
	}
	
	public void aprobados()
	{
		int contf = 0;
		int contm = 0;
		
		for (int i=0; i<this.numEs; i++)
		{
			if (this.estudiantes[i].getNota()>=5)
				if(this.estudiantes[i].getSexo()=='H')
					contm++;
				else
					contf++;
		}
		System.out.println("Hay "+contf+ " chicas aprobadas y "+contm+" chicos aprobados"); //y el genero no binario todos un 10
	}
	
	//getters y setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMaxEstudiantes() {
		return maxEstudiantes;
	}

	public void setMaxEstudiantes(int maxEstudiantes) {
		this.maxEstudiantes = maxEstudiantes;
	}

	public Materia getMat() {
		return mat;
	}

	public void setMat(String mat) {
		materia(mat);
	}

	//metodo toString
	
	@Override
	public String toString() {
		return "Aula [id=" + id + ", maxEstudiantes=" + maxEstudiantes + ", mat=" + mat + "]";
	}	
}
