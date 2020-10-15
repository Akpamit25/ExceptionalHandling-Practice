/*
 * Code Snippet Of Arithmetic Exception With Try, Catch & Finally with "THROWS & THROW".
 */

package arithmeticException;

import java.io.*;

public class DivideByZeroExceptionUsingThrow {

	public static void main(String[] args) {

		try {
			int result = divide(100, 10);
			result = divide(100, 0);
			System.out.println("Result : " + result);
		} catch (ArithmeticException e) {
			System.out.println("Exception :" + e.getMessage());
		}
	}

	public static int divide(int Numerator, int Denominator) throws ArithmeticException {
		int quotient = -1;
		System.out.println("Computing Division");

		try {
			if (Denominator == 0) {

				throw new ArithmeticException("Division attempt by zero");
			}
			quotient = Numerator / Denominator;
		}
		/*
		 * catch (ArithmeticException e) { System.out.println("Exception : " +
		 * e.getMessage()); }
		 */
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
