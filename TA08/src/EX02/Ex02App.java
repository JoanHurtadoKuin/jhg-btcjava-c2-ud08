package EX02;

public class Ex02App {

	public static void main(String[] args) {
		
		Password contraseņa1 = new Password();
		Password contraseņa2 = new Password(10);
		Password contraseņa3 = new Password(5);
		
		System.out.println(contraseņa1);
		System.out.println(contraseņa2);
		System.out.println(contraseņa3);
	}

}
