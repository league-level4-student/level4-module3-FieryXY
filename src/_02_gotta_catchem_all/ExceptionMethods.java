package _02_gotta_catchem_all;

public class ExceptionMethods {
	
	public static double divideDoubles(int d1, int d2) throws IllegalArgumentException {
		if(d2 == 0) {
			throw new IllegalArgumentException();
		}
		return d1/d2;
	}
	
	public static String reverseString(String original) throws IllegalStateException {
		if(original.equals("")) {
			throw new IllegalStateException();
		}
		return new StringBuilder(original).reverse().toString();
	}
	
}
