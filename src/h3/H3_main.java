package h3;

public class H3_main {

	public static void main(String[] args) {
		
	        int[] a = {1, 2, 3};
	        int[] b = {1, 2, 4};
	        int[] c = {1, 3, 2};
	        int[] d = {1, 2};
	        int[] e = {1, 2, 3};
	        int[] f = {1, 1, 2};

	        System.out.println(compareArraysVal(a, b)); 
	        System.out.println(compareArraysVal(a, c)); 
	        System.out.println(compareArraysVal(a, d)); 
	        System.out.println(compareArraysVal(a, e)); 
	        System.out.println(compareArraysVal(a, f)); 
	    }

	    public static boolean compareArraysVal(int[] a, int[] b) {

	        if (a.length != b.length) {
	            return false;
	        }

	        int[] countA = new int[1001];
	        int[] countB = new int[1001];

	        for (int x : a) {
	            countA[x]++;
	        }

	        for (int x : b) {
	            countB[x]++;
	        }

	        for (int i = 0; i < countA.length; i++) {
	            if (countA[i] != countB[i]) {
	                return false;
	            }
	        }

	        return true;
	    }
	}