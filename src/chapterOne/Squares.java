import java.util.Scanner;
public class Squares {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter first integer: ");
		int number1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int number2 = input.nextInt();
		int number3 = number1 * number1;
		int number4 = number2 * number2;
		int sum = number3 + number4;
		int diff = number3 - number4;
		System.out.printf("Sum is %d%n", sum);
		System.out.printf("Diff is %d%n", diff);
	}
}