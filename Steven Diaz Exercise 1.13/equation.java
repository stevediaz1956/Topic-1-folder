
public class equation {

	public static void main(String[] args) {
		
		//Top equation
		final double x1 = 3.4;
		final double y1 = 50.2;
		final double z1 = 44.5;
		
		//Bottom equation
		final double x2 = 2.1;
		final double y2 = 0.55;
		final double z2 = 5.9;

		//final equation
        final double x = (z1 * y2 - y1 * z2) / (x1 * y2 - y1 * x2);
        final double y = (x1 * z2 - z1 * x2) / (x1 * y2 - y1 * x2);
        System.out.println("x = " + x + " y = " + y);

	}

}
