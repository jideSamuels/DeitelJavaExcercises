package ChapterSeven;

import java.util.Scanner;

public class CCValidator {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Hello, kindly enter card detail to verify");
        char[] cardNumber = number.next().toCharArray();
        int[] arrNumber = new int[cardNumber.length];
        System.out.println();
        System.out.print("Credit Card Number: ");

        for (int i = 0; i < cardNumber.length; i++){
            System.out.print(cardNumber[i]);
            arrNumber[i] = Integer.parseInt(String.valueOf(cardNumber[i]));
        }
        System.out.println();
        System.out.println("Credit Card Digit Length: "+ cardNumber.length);

        if (cardNumber[0] == '4') System.out.println("Credit Card Type: Visa Card ");
        else if (cardNumber[0] == '5') System.out.println("Credit Card Type: MasterCard ");
        else if (cardNumber[0] == '3' && cardNumber[1] == '7') System.out.println("Credit Card Type: American Express Card ");
        else if (cardNumber[0] == '6') System.out.println("Credit Card Type: Discover Card ");
        else System.out.println("Credit Card Type: Invalid Card");
//        for (int ara: arrNumber) {
//            System.out.print(ara);
//        }
//        System.out.println();

        int sumBoth = 0;
        int total = 0;
        int sumTotal= 0;
        for (int doubleSecondDigits = 0; doubleSecondDigits < arrNumber.length; doubleSecondDigits+=2) {
//            System.out.print(arrNumber[doubleSecondDigits]);
            total = arrNumber[doubleSecondDigits] * 2;
            if (total > 9){
                int first = total / 10;
                int second = total % 10;
                sumBoth = first+second - total;
            }
            sumTotal += sumBoth + total;
        }
//        System.out.println();
//        System.out.println("AddDoubledDigits: "+sumTotal);
        int oddDigits = 0;
        for (int addDigitsInOddPlaces = 1; addDigitsInOddPlaces < arrNumber.length; addDigitsInOddPlaces+=2) {
//            System.out.println(arrNumber[addDigitsInOddPlaces]);
            oddDigits += arrNumber[addDigitsInOddPlaces];
        }
        int altogether = oddDigits + sumTotal;
//        System.out.println("AddDigitsInOdd: "+oddDigits);
//        System.out.println("altogether: "+ altogether);
        if (altogether % 10 == 0){
            System.out.println("Credit Card Validity Status: Valid ");
        }
        else {
            System.out.println("Credit Card Validity Status: Invalid ");
        }
    }
}
