import java.util.ArrayList;

public class Order {
    private ArrayList<OrderItem> orderItems;

    public Order() {
        orderItems = new ArrayList<OrderItem>();
    }

    public void addToOrder(MenuItem menuItem, int quantity) {
        orderItems.add(new OrderItem(menuItem, quantity));
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (OrderItem orderItem : orderItems) {
            totalPrice += orderItem.getPrice();
        }
        return totalPrice;
    }

    public void printReceipt() {
        System.out.println("*************** Receipt ***************");
        for (OrderItem orderItem : orderItems) {
            System.out.println(orderItem.getMenuItem().getName() + " x " + orderItem.getQuantity() + ": " + orderItem.getPrice());
        }
        System.out.println("Total: " + getTotalPrice());
        System.out.println("***************************************");
    }
}
