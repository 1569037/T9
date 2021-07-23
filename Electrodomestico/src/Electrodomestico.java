/***
 * 
 * @author evelyn
 * clase electrodomestico
 */
enum COLOR
{
		BLANCO,NEGRO,ROJO,AZUL,GRIS;
}

public class Electrodomestico {

	//atributos
	
	protected float precioBase;
	protected COLOR color;
	protected char consumo;
	protected float peso;
	protected static final char[] CONSUMO = {'A','F', 'B', 'C', 'D','E'};
	protected static final float PRECIO_BASE = 100f;
	protected static final float PESO = 5f;
	
	
	//metodos
	
	public Electrodomestico()
	{
		this.color =  COLOR.BLANCO;
		this.consumo = CONSUMO[1];
		this.precioBase = PRECIO_BASE;
		this.peso=PESO;
	}
	
	public Electrodomestico(float precio, float peso)
	{
		this();
		this.precioBase = precio;
		this.peso = peso;
	}
	public Electrodomestico (float precio, String color, char consumo, float peso)
	{
		this(precio, peso);
		comprobarConsumoEnergetico(consumo);
		comprobarColor(color);
	}
	
	//metodos para el control de excecpiones y errores
	
	private void comprobarConsumoEnergetico(char letra)
	{
		Character.toUpperCase(letra);
		if (letra != 'A' && letra != 'F' &&  letra != 'B' && letra != 'C' && letra !='D' && letra!='E')
			this.consumo = CONSUMO[1];
		else
			this.consumo = letra;
	}
	
	private void comprobarColor(String color)
	{
		String c = color.toUpperCase(); //pasar color a mayuscula
		boolean comp = false;
		for (COLOR i: COLOR.values()) //comprobar si el color es valido en caso contrario coger el color por defecto
		{
			if(i.name().equals(c))
			{
				this.color= COLOR.valueOf(c);
				comp = true;
			}
		}
		if (comp == false)
			this.color = COLOR.BLANCO;		
	}
	
	public void precioFinal() //calcula el precio final del producto segun los atributos
	{
		switch(this.consumo)
		{
		case 'A':
			this.precioBase = this.precioBase+100;
			break;
		case 'B':
			this.precioBase+=80;
			break;
		case 'C':
			this.precioBase+=60;
			break;
		case 'D':
			this.precioBase+=50;
			break;
		case 'E':
			this.precioBase+=30;
			break;
		case 'F':
			this.precioBase = this.precioBase+10;
			break;
		default:
			break;
		}
		if ( this.peso >=50)
		{
			if(this.peso >=80)
				this.precioBase+=100;
			else
				this.precioBase+=80;
		}
		else {
			if ( this.peso >=20)
				this.precioBase+=50;
			else
				this.precioBase+=10;
		}
	}
	//getters y setters
	
	public float getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(float precioBase) {
		this.precioBase = precioBase;
	}

	public COLOR getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = COLOR.valueOf(color);
	}

	public char getConsumo() {
		return consumo;
	}

	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	//mostrar resultado por pantalla
	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumo=" + consumo + ", peso="
				+ peso + "]";
	}
	
}
