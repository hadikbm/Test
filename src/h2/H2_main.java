package h2;

public class H2_main {

	public static void main(String[] args) {
		boolean x,y,a,b,c;
		int input;
		
		input = 0;
		
		x = true;
		y = true;
		a = true;
		b =	true;
		c = true;
		x =! y;
		
		switch(input) {
		
		case 0:
		x = false;
		y = false;
		break;
		
		case 1:
		x = false;
		y = true;
		break;
		
		case 10:
		x = true;
		y = false;
		break;
		
		case 11:
		x = true;
		y = true;
		break;
		
		}
		
		if(x == true && y == true) {
			a = true;
			
		} 
		else a = false;
		
		if (x == true || x != y) {
			b = true;
		}
		else b = false;
		
		if(x == true && y == true) {
			c = false;
		}
		else if(x == true && y == false) {
			c = true;
		}
		else if(x == false && y == true) {
			c = false;
		}
		else if(x == false && y == false) {
			c = true;
		}
		
		
		System.out.println("Wert von x: " + x);
		System.out.println("Wert von y: " + y);
		System.out.println("Wert von a: " + a);
		System.out.println("Wert von b: " + b);
		System.out.println("Wert von c: " + c);
	}
	}


