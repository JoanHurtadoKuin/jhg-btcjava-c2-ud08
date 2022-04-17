package EX01;

public class Ex01App {

	public static void main(String[] args) {

		Persona persona1 = new Persona();
		Persona persona2 = new Persona("Joan",22);
		Persona persona3 = new Persona("Gerard",20,"39994423X",'M');
		
		System.out.println(persona1);
		System.out.println(persona2);
		System.out.println(persona3);
				
	}

}
