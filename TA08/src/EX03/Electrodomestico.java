package EX03;

public class Electrodomestico {

	private double precioBase;
	private String color;
	private char consumoEnergetico;
	private double peso;
	final private String CONSUMO_ENERGETICO_LETRAS = "ABCDEF";
	
	public Electrodomestico() {
		
		this.color = "blanco";
		this.consumoEnergetico = 'F';
		this.precioBase = 100;
		this.peso = 5;
	}
	
	public Electrodomestico(double precio,double peso) {
		
		this.color = "blanco";
		this.consumoEnergetico = 'F';
		this.precioBase = precio;
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Electrodomestico(double precio,double peso,String color, char consumoEnergetico) {
		
		this.color = comprobarColor(color);
		this.consumoEnergetico = comprobarConsumo(consumoEnergetico);
		this.precioBase = precio;
		this.peso = peso;
	}

	private String comprobarColor(String color) {
		
		if(color.equalsIgnoreCase("negro")) {
			return "negro";
		}else if(color.equalsIgnoreCase("rojo")) {
			return "rojo";
		}else if(color.equalsIgnoreCase("azul")) {
			return "azul";
		}else if(color.equalsIgnoreCase("gris")) {
			return "gris";
		}else {
			return "blanco";
		}
			
	}
	
	private char comprobarConsumo(char letra) {
		
		for (int i = 0; i < CONSUMO_ENERGETICO_LETRAS.length(); i++) {
			if(CONSUMO_ENERGETICO_LETRAS.charAt(i) == letra) {
				return CONSUMO_ENERGETICO_LETRAS.charAt(i);
			}
		}
		
		return 'F';
	}
}
