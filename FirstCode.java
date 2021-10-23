package firstcode;

/**
 * This is our first coding thingee.
 * 
 * @author bobvi
 *
 */
public class FirstCode {

	public static void main(String[] args) {
		System.out.println("This is " + "way" + " cool!");
		
		int myAge = 35;
		double cashOnHand = 100.00;
		
		// This turns the double into a decimal with 2 places
		String cash = String.format("%.2f", cashOnHand);
		
		System.out.println("My age is " + myAge);
		System.out.println("My cash = $" + cash);
	}
}
