import java.util.Scanner;

public class shoppingCart {
    public static void main(String[] args) {
        //SHOPPING CART PROGRAM
        
        Scanner scanner = new Scanner(System.in);

        /*Declare Variable*/
        String item;
        double price;
        int quantity;
        double total;
        char currency = '$';

        /*Input from user*/
        System.out.print("What item would you like to buy? ");
        item = scanner.nextLine();

        System.out.print("What is the price for each? ");
        price = scanner.nextDouble();

        System.out.print("How many do you like? ");
        quantity = scanner.nextInt();

        total = price * quantity;
        System.out.println(" ");
        System.out.println("===================SHOPPING CART===================");
        System.out.println("You have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + currency + total);
        System.out.println("Thank you for your shopping 😊");
        System.out.println("===================================================");
        scanner.close();
    }
}
