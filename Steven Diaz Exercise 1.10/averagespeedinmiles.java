
public class averagespeedinmiles {

	public static void main(String[] args) {
		
		//Amount of KPH traveled
		double kilometers = 14.0;
		
		//Conversion KPH to MPH
        double miles = kilometers / 1.6;
        
        //time traveled
        double rate = (45.5 * 60.0 + 30.0) / (60.0 * 60.0);
        
        
        double milesPerHour = miles / rate;



        System.out.println(milesPerHour);


	}

}
