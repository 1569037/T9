/***
 * 
 * @author evelyn
 * clase Lavadora hija de electrodomestico
 */
public class Lavadora extends Electrodomestico {
	
	//atributos
	
	private float carga;
	final private static float CARGA = 5f;
	
	//contructores
	
	public Lavadora() {
		super();
		this.carga = CARGA;
	}
	public Lavadora(float precio, float peso) {
		super(precio, peso);
		this.carga = CARGA;
	}
	public Lavadora(float precio, String color, char consumo, float peso, float carga) {
		super(precio, color, consumo, peso);
		this.carga = carga;
	}
	
	//getters y setters
	
	public float getCarga() {
		return carga;
	}
	public void setCarga(float carga) {
		this.carga = carga;
	}
	
	//metodos
	
	public void precioFinal()
	{
		super.precioFinal();
		if (this.carga > 30)
			this.precioBase+=50;
	}
	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + ", precioBase=" + precioBase + ", color=" + color + ", consumo=" + consumo
				+ ", peso=" + peso + "]";
	}
	
	
	
	
	
	
}
