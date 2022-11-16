import java.util.Scanner;
public class Converter{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number in pounds: ");
		double pounds = input.nextDouble();

		double kilograms = pounds * 0.454;

		System.out.printf("%.1f pounds is %.3f kilograms", pounds, kilograms); 
	}


}