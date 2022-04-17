package EX03;

public class Ex03App {

	public static void main(String[] args) {

		
		Electrodomestico electrodomestico1 = new Electrodomestico();
		Electrodomestico electrodomestico2 = new Electrodomestico(350,10);
		Electrodomestico electrodomestico3 = new Electrodomestico(125,15,"NegRo",'A');
		
		System.out.println(electrodomestico1);
		System.out.println(electrodomestico2);
		System.out.println(electrodomestico3);
		
	}

}
