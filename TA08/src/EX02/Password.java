package EX02;

public class Password {
	
	private int longitud;
	private String contraseña;
	
	public Password() {
		this.longitud = 8;
		this.contraseña = "";
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = generarContraseña(longitud);
		
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	private String generarContraseña(int longitud) {
		
		String contraseña ="";
		
		for (int i = 0; i < longitud; i++) {
			 int numeroAleatorio = (int) Math.floor(Math.random() * 9);
			 contraseña += numeroAleatorio;
		}
	    
	     
		return contraseña;
	}

	@Override
	public String toString() {
		return "Password [longitud=" + this.longitud + ", contraseña=" + this.contraseña + "]";
	}
	
	

}
