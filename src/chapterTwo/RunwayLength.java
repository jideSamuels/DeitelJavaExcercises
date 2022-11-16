import java.util.Scanner;
public class RunwayLength{
	public static void main (String [] args){
	Scanner input = new Scanner(System.in);
	
	System.out.pr...intln("Enter speed: ");
	double speed = input.nextDouble();

	System.out.println("Enter acceleration: ");
	double acceleration = input.nextDouble();

	double vSquare = speed * speed;
	double accelerationTimesTwo = 2 * acceleration;
	double length = vSquare / accelerationTimesTwo;
	 
	System.out.printf("The minimum runway length for this airplane is %.3f", length);
	}

}