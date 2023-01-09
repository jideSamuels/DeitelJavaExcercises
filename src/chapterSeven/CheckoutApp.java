package ChapterSeven;

import java.util.Objects;
import java.util.Scanner;

public class CheckoutApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] myList = {"What is the customer's name?", "What did the user buy?", "How many pieces?", "How much per unit?"};
        String[] details = {"SEMICOLON STORES", "MAIN BRANCH", "LOCATION: 312,HERBERT MACAULAY WAY, SABO YABA, LAGOS", "TELL: O3293828343", "DATE 18-DEC-22 8:48:11 PM"};
        String[] cashierInfo = {"What is your name (cashier)? ", "How much discount will he get? "};
       String[] heading = {"  ITEM  ", "      QTY  ", "    PRICE  ", "      TOTAL(NGN)"};
        String customerName= null;
       String goodPurchaseOne = null;
            System.out.println(myList[0] + " ");
            customerName = input.next();
            System.out.println(myList[1] + " ");
            goodPurchaseOne = input.next();

        System.out.println(myList[2] + " ");
        double quantityOne = input.nextInt();
        System.out.println(myList[3] + " ");
        double priceOne = input.nextInt();

        double totalOne = quantityOne * priceOne;

        System.out.println("");
        Scanner moreItems = new Scanner(System.in);
        System.out.println("Add more items? ");
        String yesOrNo = moreItems.next();
        System.out.println();

        String goodPurchaseTwo = null;
        double quantityTwo = 0;
        double priceTwo = 0;
        String cashier = null;
        double discount = 0;

        if ((Objects.equals(yesOrNo, "yes")) || ((Objects.equals(yesOrNo,"Yes")) || (Objects.equals(yesOrNo,"YES")))){
            Scanner secondInp = new Scanner(System.in);
            System.out.println(myList[1] + " ");
            goodPurchaseTwo = secondInp.next();
            System.out.println(myList[2] + " ");
            quantityTwo = secondInp.nextInt();
            System.out.println(myList[3] + " ");
            priceTwo = secondInp.nextInt();
            System.out.println(" ");

            Scanner cashierDiscount = new Scanner(System.in);
            System.out.println(cashierInfo[0] + " ");
            cashier = cashierDiscount.next();
            System.out.println(cashierInfo[1] + " ");
            discount = cashierDiscount.nextFloat();

        }
       else if ((yesOrNo.equals("no")) || ((yesOrNo.equals("No")) || (yesOrNo.equals("NO")))){
            Scanner cashierDiscount = new Scanner(System.in);
            System.out.println(cashierInfo[0] + " ");
            cashier = cashierDiscount.next();
            System.out.println(cashierInfo[1] + " ");
            discount = cashierDiscount.nextFloat();
        }
        else {System.exit(2);}

            double totalTwo = quantityTwo * priceTwo;
            double sumTotal = totalOne + totalTwo;
            System.out.println(" ");
            double totalDiscount = sumTotal * (discount / 100);
            double billTotal = (sumTotal + (sumTotal * 0.175)) - totalDiscount;


            for (String detail : details) {
                System.out.println(detail);
            }
            System.out.println("Cashier: " + cashier);
            System.out.println("Customer's name: " + customerName);

            System.out.println("======================================================================");
            System.out.print("                 ");
            for (String head : heading) {
                System.out.print(head);
            }
            System.out.println();
            System.out.println("----------------------------------------------------------------------");
            System.out.printf("%23s%10s%10.2f%15.2f%n", goodPurchaseOne, quantityOne, priceOne, totalOne);
            System.out.printf("%23s%10s%10.2f%15.2f%n", goodPurchaseTwo, quantityTwo, priceTwo, totalTwo);
            System.out.println("----------------------------------------------------------------------");
            System.out.printf("                                 Sum Total:    %.2f%n" , sumTotal);
            System.out.printf("                                 Discount:    %.2f%n" , totalDiscount);
            System.out.printf("                                Vat @ 17.50:%%    %.2f%n" , (sumTotal * 0.175));
            System.out.println("======================================================================");
            System.out.printf("                                Bill Total:    %.2f%n" ,billTotal);
            System.out.println("======================================================================");
            System.out.printf("         This is not a receipt. Kindly pay %.2f%n" , billTotal);
            System.out.println("======================================================================");

        System.out.println("How much did the customer give them? ");
        int amountPaid = input.nextInt();

    }
}

