package EX02;

public class Password {
	
	private int longitud;
	private String contrase�a;
	
	public Password() {
		this.longitud = 8;
		this.contrase�a = "";
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.contrase�a = generarContrase�a(longitud);
		
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
	private String generarContrase�a(int longitud) {
		
		String contrase�a ="";
		
		for (int i = 0; i < longitud; i++) {
			 int numeroAleatorio = (int) Math.floor(Math.random() * 9);
			 contrase�a += numeroAleatorio;
		}
	    
	     
		return contrase�a;
	}

	@Override
	public String toString() {
		return "Password [longitud=" + this.longitud + ", contrase�a=" + this.contrase�a + "]";
	}
	
	

}
