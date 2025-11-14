package h3;

public class H3_main {

	public static void main(String[] args) {
float celsiusFloat = 27 , fahrenheitFloat = 2;
double celsiusDouble = 23, fahrenheitDouble = 4;


fahrenheitFloat = celsiusFloat * (float) 9/5 + 32;
System.out.println(celsiusFloat + " Grad Celsius sind: " +fahrenheitFloat + " Grad Fahrenheit" );

fahrenheitDouble = celsiusDouble * (double) 9/5 + 32;
System.out.println(celsiusDouble + " Grad Celsius sind: " + fahrenheitDouble + " Grad Fahrenheit" );
	}

}
