package chapterThree.EvenOrOdd;
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int numberGiven = input.nextInt();

        if (numberGiven % 2 == 0) {
            System.out.printf("%s is an even number", numberGiven);
        }
        else {
            if (numberGiven % 2 != 0) {
                //System.out.printf("%s is an odd number", numberGiven);
                System.out.println(numberGiven + " is an odd number");
            }
            }
        }
}
