package sandwich.shop;

import java.util.Scanner;

public class SandwichShop {
    public static void main (String [] args){
        /*
        Prompt the user for the size of the sandwich (1 or 2):
a. 1: Regular: base price $5.45
b. 2: Large: base price $8.95

Prompt the user for their age:
a. Student (17 years old or younger) – receive a 10% discount
b. Seniors (65 years old or older) – receive a 20% discount
c. Everyone else won't receive a discount
Display the cost of the sandwich to the screen
         */
        // decaring variables
        Scanner scanner = new Scanner(System.in);
        float regualrprice = 5.45f;
        float largeprice = 8.95f;
        float totalcost;

        // ask the user for which size
        System.out.println("Regular: price is $5.45 " );
        System.out.println("Large: price is $8.95 ");

        System.out.print("What is the size of the sandwich would you want? ");
        String size = scanner.nextLine();

        if (size.equals("Regular")) {
            totalcost = regualrprice;
        } else {
            totalcost = largeprice;
        }

        System.out.print("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine();


        if (age <= 17) {
            float discount = totalcost * 0.90f;
            System.out.println("The price of your sandwich is: $" + discount);

        }
        else if (age >= 65) {
            float discount = totalcost * 0.80f;
            System.out.println("The price of your sandwich is: $" + discount);

        }
        else {
            System.out.println("No discount. " + "Your price is: $" + totalcost);
        }

    }
}
