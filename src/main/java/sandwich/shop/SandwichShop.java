package sandwich.shop;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {

        // decaring variables
        Scanner scanner = new Scanner(System.in);
        float regualrprice = 5.45f;
        float largeprice = 8.95f;
        float totalcost;
        float loadedreg = 1.00f;
        float loadedlag = 1.75f;
        float addtionalcost = 0;


        // ask the user for which size
        System.out.println("Regular: price is $5.45 ");
        System.out.println("Large: price is $8.95 ");

        System.out.print("What is the size of the sandwich would you want? ");
        String size = scanner.nextLine();

        if (size.equals("Regular")) {
            totalcost = regualrprice;
        } else {
            totalcost = largeprice;
        }


        // asks the user if they want loaded
        System.out.print("Would you like the sandwich loaded (yes/no)? ");
        String decision = scanner.nextLine();

        
        //
        if (decision.equals("yes")) {
            if (size.equals("Regular")) {
                addtionalcost = loadedreg;
            } else {
                addtionalcost = loadedlag;
            }
        }


        // calculation for total + addtional
        totalcost = totalcost + addtionalcost;


        // asks the user for age
        System.out.print("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine();


        // calculation
        if (age <= 17) {
            float discount = totalcost * 0.90f;
            System.out.println("The price of your sandwich is: $" + discount);
        } else if (age >= 65) {
            float discount = totalcost * 0.80f;
            System.out.println("The price of your sandwich is: $" + discount);
        } else {
            System.out.println("No discount. " + "Your price is: $" + totalcost);
        }

    }
}
