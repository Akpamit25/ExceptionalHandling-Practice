package userDefinedException;

import java.io.*;
public class CustomException {

	public static void main(String[] args) {
		
		try {
			validateAge(15);
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e.getMessage());
		}
	}

	public static void validateAge(int age) throws InvalidAgeException{
		if(age<18)
		{
			throw new InvalidAgeException("Not eligible to vote !!");
		}
	else {
			System.out.println("Eligible To Vote");
		}
		
	}
}

class InvalidAgeException extends Exception
{
	public InvalidAgeException(String message)
	{
		super(message);
	}
}
