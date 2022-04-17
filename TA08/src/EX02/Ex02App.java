package EX02;

public class Ex02App {

	public static void main(String[] args) {
		
		Password contraseña1 = new Password();
		Password contraseña2 = new Password(10);
		Password contraseña3 = new Password(5);
		
		System.out.println(contraseña1);
		System.out.println(contraseña2);
		System.out.println(contraseña3);
	}

}
