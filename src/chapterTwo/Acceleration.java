import java.util.Scanner;

public class Acceleration{
	public static void main(String [] args){
		Scanner input = new  Scanner(System.in);
		System.out.println("Enter Starting Velocity: ");
		double startVelocity = input.nextDouble();

		System.out.println("Enter Ending Velocity: ");
		double endVelocity = input.nextDouble();

		System.out.println("Enter Time Span: ");
		double timeSpan = input.nextDouble();

		double top = endVelocity - startVelocity;
		double t = timeSpan;
		double a = top / t;

		System.out.printf ("The average acceleration is %.4f", a);
	}

}