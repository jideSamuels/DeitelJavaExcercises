import java.util.Scanner;
public class SmallestLargest {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		int firstNumber = input.nextInt();

		System.out.print("Enter second integer: ");
		int secondNumber = input.nextInt();

		System.out.print("Enter third integer: ");
		int thirdNumber = input.nextInt();


		sum = firstNumber + secondNumber + thirdNumber;
		average = sum / 3;
		product = firstNumber * secondNumber * thirdNumber;

		System.out.printf("Sum is %d\n", sum);
		System.out.printf("Average is %d\n", average);
		System.out.printf("Product is %d\n", product);
		}

}


