package h1;

public class H1_main {

	public static void main(String[] args) {
		
		int zone = 4;
		double price;
		price = 2;

		switch(zone) {
		case 1:
		System.out.println("Ihre Fahrkarte kostet: " + price + "€");
		break;
		
		case 2:
		price = price + 0.35;	
		System.out.println("Ihre Fahrkarte kostet: " + price + "€");
		break;
		
		case 3,4:
		price = price + 0.35 + 0.50;	
		System.out.println("Ihre Fahrkarte kostet: " + price + "€");
		break;
		
		case 5:
		price = price + 0.35 + 0.50 + 0.70;	
		System.out.println("Ihre Fahrkarte kostet: " + price + "€");
		break;
		
		case 6:
		price = 4.00;	
		System.out.println("Ihre Fahrkarte kostet: " + price + "€");
		break;	
		}
	}

}
//Hab das mit System.out.prtintln gemacht damit man das in der Konsole sieht falls das okay ist.