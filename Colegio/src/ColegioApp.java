
public class ColegioApp {

	public static void main(String[] args) {
		
		Profesor p = new Profesor("Luis", 40,'H',"MATEMATICAS");
		System.out.println(p);
		Estudiante es[] = alumnos(20);
		mostrarEstudiantes(es,20);
		Aula a = new Aula(32,30,"MATEMATICAS",20,es);
		if(a.clase(p)==true)
			a.aprobados();
		
	}
	
	public static Estudiante[] alumnos(int num)
	{
		Estudiante es[]=new Estudiante[num];
		char c = 'a';
		for (int i=0; i< num; i++) {
			c++;
			es[i] = new Estudiante();
			es[i].setNombre(((String.valueOf(c)+c)));
			es[i].setEdad((int)(Math.random()*80));
			es[i].asistencia();
			es[i].setNota((float)(Math.random()*11));
			es[i].setSexo(aSexo());
		}
		return es;
	}
	public static char aSexo()
	{
		int ran =(int) (Math.floor((Math.random()*2+0)));
		if (ran == 0)
			return 'H';
		else
			return 'M';
	}
	
	public static void mostrarEstudiantes(Estudiante[] es, int tam)
	{
		for (int i=0; i<tam;i++)
		{
			System.out.println(es[i]);
		}
	}

}
