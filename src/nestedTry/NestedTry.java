/*
 * Code Snippet Of Arithmetic Exception With "Nested" Try & Catch for multiple Exceptions
 */package nestedTry;

import java.io.*;

public class NestedTry {

	public static void main(String[] args) {
		int num1 = 2, num2 = 0, res = 0;
		try {
			FileInputStream fis = null;
			fis = new FileInputStream(new File(args[0]));

			try {
				res = num1 / num2;
				System.out.println("The result is : " + res);
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

// 1 // If an exception is not handled in a try catch block, it is thrown to the caller of that block.
// 2 // If an exception gets back to the main method and is not handled there, the program is terminated abnormally.