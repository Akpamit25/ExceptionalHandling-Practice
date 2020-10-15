package adaptHandsOn1;

import java.util.*;
public class ArrayException {

	 Scanner sc = new Scanner(System.in);
	//static int[] arr;

	public static void main(String[] args) {
		ArrayException a = new ArrayException();
		System.out.println(a.getPriceDetails());

	}

	public String getPriceDetails() {
try {
		System.out.println("Enter The No. Of Elements In The Array");
		int num = sc.nextInt();
		int arr[] = new int[num];
		System.out.println("Enter The Price Details");
		for(int i : arr)
		{
			arr[i]=sc.nextInt();
		}
	
	System.out.println("Enter the index of the array element you want to access");
	int index = sc.nextInt();
	String s = "The array element is = "+arr[index];
	return s;
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		return "Array index is out of range";
	}
	catch(InputMismatchException e)
	{
		return "Input was not in the correct format";
	}

}
}
