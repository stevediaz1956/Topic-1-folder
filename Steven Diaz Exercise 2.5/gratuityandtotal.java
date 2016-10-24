import java.util.Scanner;

public class gratuityandtotal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//User input
		System.out.print(" Enter Subtotal and Gratuity ");
		final double subtotal = input.nextDouble();
		final double rate = input.nextDouble();
		
		//Calculation
		final double gratuity = subtotal * rate / 100;
		final double total = subtotal + gratuity;
		
		
		System.out.println(" Gratuity = $" + gratuity);
		System.out.println(" Total = $" + total);
		
		
	}

}
