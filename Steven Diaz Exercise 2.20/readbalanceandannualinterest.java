import java.util.Scanner;

public class readbalanceandannualinterest {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
	//Annual interest percent
	System.out.print("Enter balance and annual interest rate ");
	double annualInterestRate = input.nextDouble();
	double balance = input.nextDouble();
	
	double interestRate = balance * annualInterestRate / 1200;
	
	System.out.print(" The Interest is " + interestRate + " %" );
	
	
	
	
	
	
	
	}

}
