import java.util.Scanner;
public class FeetConverter{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a value for feet: ");
		double feet = input.nextDouble();		
		double metres = feet * 0.305;

		System.out.printf("%.1f feet is %.4f metres", feet, metres); 

	}
}