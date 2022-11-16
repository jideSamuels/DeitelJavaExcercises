/**Write an application that asks the user to enter one integer, obtains
it from the user and displays whether the number and its square are greater than, equal to, not equal
to, or less than the number 100*/


import java.util.Scanner;
public class Compare {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter first integer: ");
		int firstNumber = input.nextInt();

		int firstNumberSquare = firstNumber * firstNumber;
		
		int hundred = 100;
		
		if (firstNumber == hundred){
			System.out.printf("%d == %d%n", firstNumber, hundred);
			}
		if (firstNumberSquare == hundred){
			System.out.printf("%d == %d%n", firstNumberSquare, hundred);
			}


		if (firstNumber != hundred){
			System.out.printf("%d != %d%n", firstNumber, hundred);
			}
		if (firstNumberSquare != hundred){
			System.out.printf("%d != %d%n", firstNumberSquare, hundred);
			}


		if (firstNumber < hundred){
			System.out.printf("%d < %d%n", firstNumber, hundred);
			}
		if (firstNumberSquare < hundred){
			System.out.printf("%d < %d%n", firstNumberSquare, hundred);
			}


		if (firstNumber > hundred){
			System.out.printf("%d > %d%n", firstNumber, hundred);
			}
		if (firstNumberSquare > hundred){
			System.out.printf("%d > %d%n", firstNumberSquare, hundred);
			}

	}
}