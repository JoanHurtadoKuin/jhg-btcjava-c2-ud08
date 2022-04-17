package EX01;

public class Persona {
	
	private String nombre;
	private int edad;
	private String DNI;
	private char sexo;
	final char SEXO_DEFAULT= 'H';
	
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		DNI = "";
		this.sexo = SEXO_DEFAULT;
	}
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = "";
		this.sexo = SEXO_DEFAULT;
	}
	
	public Persona(String nombre, int edad, String DNI, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = DNI;
		this.sexo = comprobarSexo(sexo);
	}

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
		this.edad = edad;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	private char comprobarSexo(char sexo) {
		
		if(sexo == 'H') {
			return 'H';
		}else if(sexo == 'M') {
			return 'M';
		}
		
		return SEXO_DEFAULT;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + "]";
	}
	
	
	
}
