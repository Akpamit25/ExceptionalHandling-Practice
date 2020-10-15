package tryWithCatchExample;

public class TryWithCatch {

	public static void main(String[] args) {

		int sum = 0;
		for (String a : args) {
			try {
				sum += Integer.parseInt(a);
			} catch (NumberFormatException e) {
				System.err.println(a + " Is not an Integer");
			}
		}
		System.out.println("Sum is : " + sum);

	}

}

/*
 * Code Snippet Of Number Format Exception With Try & Catch
 */

// User Input : Java 8 12 four 3.0 2