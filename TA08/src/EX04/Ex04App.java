package EX04;

public class Ex04App {

	public static void main(String[] args) {

		
		Serie serie1 = new Serie();
		Serie serie2 = new Serie("Batman","Spiderman");
		Serie serie3 = new Serie("Batman",7,"Accion","Spiderman");
		
		System.out.println(serie1);
		System.out.println(serie2);
		System.out.println(serie3);
	}

}
