import java.util.Scanner;
public class Years{
	public static void main (String [] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Enter the number of minutes: ");
	int numberOfMinutes = input.nextInt();

	int numberOfHours = numberOfMinutes/60;
	int numberOfDays = numberOfHours/24;
	int numberOfYears = numberOfDays/365;
	int remainder = numberOfDays % 365;

	System.out.printf("%s minutes is approximately %s years and %s days", numberOfMinutes, numberOfYears, remainder);
	}



}