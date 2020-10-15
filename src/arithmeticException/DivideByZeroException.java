/*
 * Code Snippet Of Arithmetic Exception With Try, Catch & Finally.
 */

package arithmeticException;

import java.io.*;

public class DivideByZeroException {

	public static void main(String[] args) {
		int result = divide(100, 0);
		System.out.println("Result : " + result);
	}

	public static int divide(int Numerator, int Denominator) {
		int quotient = -1;
		System.out.println("Computing Division");

		try {
			quotient = Numerator / Denominator;
		} catch (ArithmeticException e) {
			System.out.println("Exception : " + e.getMessage());
		}

		finally {
			if (quotient != -1) {
				System.out.println("Finally Block Executes");
				System.out.println("Quotient : " + quotient);
			} else {
				System.out.println("Finally Block Executes, Exception Occured");
			}
		}
		return quotient;
	}

}
