/*
 * Code Snippet Of Arithmetic Exception With Try & Multiple Catch for multiple Exceptions
 */
package tryWithMultiCatch;

public class MultipleCatch {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30 };
		int num1 = 10;
		int num2 = 1;
		int result = 0;

		try {
			result = num1 / num2;
			System.out.println("The result is : " + result);
			for (int i = 0; i < 4; i++) {
				System.out.println("The value of array are :" + arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error : " + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("Error : " + e.getMessage());
		}
	}
}
