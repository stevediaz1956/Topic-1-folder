import java.util.Scanner;
public class costofdriving {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter the driving distance: ");
		double distance = input.nextDouble();
		
		System.out.println("Enter miles per gallon: ");
		double milesPerGallon = input.nextDouble();
		
		System.out.println("Enter price per gallon: ");     
		double pricePerGallon = input.nextDouble();
		
		double cost = distance / milesPerGallon * pricePerGallon;
		System.out.println ("The cost of driving is $" + cost);

	}

}
