package h2;

public class H2_main {

	public static void main(String[] args) {
		 int n = 299;           
	        int digits = 0;        
	        int[] a = new int[9];  

	        int temp = n;
	        do {
	            digits++;
	            temp /= 10;
	        } while (temp > 0);


	        temp = n;
	        for (int i = 8; i >= 0 && temp > 0; i--) {
	            a[i] = temp % 10;
	            temp /= 10;
	        }


	        System.out.print("Array: ");
	        for (int value : a) {
	            System.out.print(value + " ");
	        }
	}
	}


