package adaptHandsOn3;
import java.util.*;

public class Main {
  
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		Candidate cd = new Candidate();
		try {
		cd = getCandidateDetails();
		System.out.println("Registarion Successful");
		}
		catch(InvalidSalaryException e)
		{
			System.out.println(e.getMessage());
		}
	}
	 public static Candidate getCandidateDetails() throws InvalidSalaryException {
		 Candidate cd1 = new Candidate();
		 System.out.println("Enter The Candidate Details :");
		 System.out.println("Name");
		 cd1.setName(sc.next());
		 System.out.println("Gender");
		 cd1.setGender(sc.next());
		 System.out.println("Expected Salary");
		 cd1.setExpectedSalary(sc.nextFloat());
if(cd1.getExpectedSalary() >= 10000)
{
	return cd1;
}
else
{
	throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000.");
}
	 }

}
