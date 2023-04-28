import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Order order = new Order();

        System.out.println("*************** Welcome To Shabu Order Online ***************");
        System.out.println("=============================================================");
        Menu menu = new Menu();
        menu.showMenu();
        System.out.println("=============================================================");
        boolean orderMore = true;
        while (orderMore) {
            System.out.println("What Do You Want to Order Today");
            int choice = sc.nextInt();

            if (choice == 28) {
                orderMore = false;
                continue;
            }

            MenuItem menuItem = menu.getMenuItems().get(choice - 1);
            System.out.println("You have Selected " + menuItem.getName());

            System.out.println("Enter the desired Quantity : ");
            int quantity = sc.nextInt();

            order.addToOrder(menuItem, quantity);

            System.out.println("Do you wish to order anything else (Y/N) : ");
            String choiceString = sc.next();
            orderMore = choiceString.equalsIgnoreCase("Y");
        }

        System.out.println("******************** Thank you for ordering ********************");
        order.printReceipt();
    }
}
