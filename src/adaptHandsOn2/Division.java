package adaptHandsOn2;

import java.util.*;

public class Division {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter The Numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		Division d = new Division();
		System.out.println(d.divideTwoNumbers(num1, num2));
	}

	public String divideTwoNumbers(int number1, int number2) {
		int quotient = -1;
		String s = new String();
		try {
			quotient = number1 / number2;
			s = "The answer is" + quotient;
		} catch (ArithmeticException e) {
			s = "Division by zero is not possible";
		} finally {
			return s + ". Thanks for using the application";
		}
	}

}
