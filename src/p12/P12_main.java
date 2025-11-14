package p12;

public class P12_main {

	public static void main(String[] args) {
		// nur switch nutzen
		int stockwerk = 2;
		
		switch(stockwerk) {
		
		case -1:
		System.out.println("Parkhaus");
		break;
		
		case 0:
		System.out.println("Angebote");
		break;
		
		case 1:
		System.out.println("Damenbekleidung");
		System.out.println("Angebote");
		break;
		
		case 2:
		System.out.println("Herrenbekleidung");
		System.out.println("Damenbekleidung");
		System.out.println("Angebote");
		break;
		
		case 3:
		System.out.println("Kinderbekleidung");
		System.out.println("Herrenbekleidung");
		System.out.println("Damenbekleidung");
		System.out.println("Angebote");
		break;
		
		default:
		System.out.println("Unbekannt");
		}

	}

}
