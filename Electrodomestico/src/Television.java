/***
 * clase Television hija de electrodomestico
 * @author evelyn
 *
 */
public class Television extends Electrodomestico{

	//atributos
	
	private float resolucion;
	private boolean tdt;
	
	//consructores 
	
	public Television() {
		super();
		this.resolucion = 20;
		this.tdt = false;
	}

	public Television(float precio, float peso) {
		super(precio, peso);
		this.resolucion = 20;
		this.tdt = false;
	}

	public Television(float precio, String color, char consumo, float peso,float resolucion, boolean tdt) {
		super(precio, color, consumo, peso);
		this.resolucion = resolucion;
		this.tdt = tdt;
	}
	//getters y setters

	public float getResolucion() {
		return resolucion;
	}

	public void setResolucion(float resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isTdt() {
		return tdt;
	}

	public void setTdt(boolean tdt) {
		this.tdt = tdt;
	}
	
	//metodos
	
	public void precioFinal()
	{
		super.precioFinal();
		if(this.resolucion > 40)
			this.precioBase+=(0.3*this.precioBase);
		if (this.tdt == true)
			this.precioBase += 50;
	}

	@Override
	public String toString() {
		return "Television [resolucion=" + resolucion + ", tdt=" + tdt + ", precioBase=" + precioBase + ", color="
				+ color + ", consumo=" + consumo + ", peso=" + peso + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
