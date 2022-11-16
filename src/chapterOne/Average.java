public class Average {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int number1 = input.nextInt();
		
		System.out.print("Enter first integer: ");
		int number2 = input.nextInt();

		System.out.print("Enter first integer: ");
		int number3 = input.nextInt();

		sum = number1 + number2 + number3;
		average = (sum) / 3;
		product = number1 * number2 * number3;

		smallest = number1;
		if (number2 <= smallest)
			smallest = number2;

		if (number3 <= smallest)
			smallest = number3;

		largest = number1;
		if (number2 >= largest)
			largest = number2;

		if (number3 >= largest)
			largest = number3;
		
		System.out.printf("Sum is %d\n", sum);
		System.out.printf("Average is %d\n", average);
		System.out.printf("Product is %d\n", product);
		System.out.printf("Smallest is %d\n", smallest);
		System.out.printf("Largest is %d\n", largest);
	}

}