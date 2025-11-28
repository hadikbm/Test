package p33;

public class P33_main {

	public static void main(String[] args) {
		
		System.out.println();

	}
	public static int methode(int[] a) {
		int max = -1;
		int k = a.length - 1;
		for (int i = 0; i < k; i++) {
		for (int j = 0; j < k; j++) {
		if (a[j] > a[i]) {
		max = a[j];
		}
		}
		}
		return max;
		// alles falsch guck ddir die musterlösung Lösung an 
	}
}
