public class OrderItem {
    private MenuItem menuItem;
    private int quantity;

    public OrderItem(MenuItem menuItem, int quantity) {
        this.menuItem = menuItem;
        this.quantity = quantity;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return menuItem.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return String.format("%s x %d = %.2f Baht", menuItem.getName(), quantity, getPrice());
    }
}
