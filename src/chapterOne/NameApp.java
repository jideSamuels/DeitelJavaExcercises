import java.util.Scanner;
public class NameApp{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);

		System.out.println("What is your name: ");
		String name = input.nextLine();
		
		 System.out.println("Welcome " + name);
}