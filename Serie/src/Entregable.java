//interface para las clases serie y videojuego
public interface Entregable {

	public void entregar();
	public void devolver();
	public boolean isEntregado();
	public Object compareTo(Object a);
}
