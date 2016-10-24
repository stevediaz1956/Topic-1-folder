import java.util.Scanner;

public class convertlbstokilograms {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter ammount of Pounds: ");
		double pounds = input.nextDouble();
				
		// Convert Pounds to Kilograms
		double Kilograms = pounds * .45359;
		System.out.println(pounds + " pounds " + Kilograms 
				+ " in Kilograms ");

	}

}
