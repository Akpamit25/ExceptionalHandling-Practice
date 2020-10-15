package numberFormatException;

public class NumberFormatException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		for (String a : args) {
			sum += Integer.parseInt(a);
			System.out.println("Sum is : " + sum);
		}
	}

}

/*
 * Code Snippet Of Number Format Exception Without Try & Catch
 */

// User Input : Java 8 12 four 3.0 2