import java.util.Scanner;
public class ReadInteger{
	public static void main (String [] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number between 0 and 1000: ");
	int number = input.nextInt();
	int sum = 0;
	int number1 = number % 10;

	int number2 = number / 10;
	
	int number3 = number2 % 10;
	
	int number4 = number2 / 10;
	
	int number5 = number4 % 10;
	
	int number6 = number4 / 10;
	
	sum = number1 + number3 + number5;
	
	System.out.printf("sum is %d", sum);
	
}
}