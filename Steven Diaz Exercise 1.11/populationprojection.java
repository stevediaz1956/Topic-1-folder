
public class populationprojection {

	public static void main(String[] args) {
		
		//Population at the beginning of the year
		double Population = 312032486;
		
		//Birth, death, and immigrant are in seconds
		double birthRate = 7.0;
		double deathRate = 13.0;
		double newImmigrant = 45.0;
		
		//Calculation for seconds in 1 year
		double secondsInYear = 365 * 24 * 60 * 60;
		
		//Amount of each category after one year
		double Births = secondsInYear / birthRate;
		double Deaths = secondsInYear / deathRate;
		double Immigrants = secondsInYear / newImmigrant;

		for (int p = 1; p <= 1; ++p)
		Population += Immigrants + Births - Deaths;
		System.out.println("Population after one year" + " = "
				+ (int)Population);
		
	}

}
