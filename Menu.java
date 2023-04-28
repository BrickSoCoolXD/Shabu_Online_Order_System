import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menuItems;

    public Menu() {
        menuItems = new ArrayList<MenuItem>();
        // Adding menu items to the menu
        menuItems.add(new MenuItem("Tomyam Soup", 50.0));
        menuItems.add(new MenuItem("Clear Soup", 40.0));
        menuItems.add(new MenuItem("Mala Soup", 45.0));
        menuItems.add(new MenuItem("JaewHon Soup", 60.0));
        menuItems.add(new MenuItem("Black Soup", 55.0));
        menuItems.add(new MenuItem("Park small", 29.0));
        menuItems.add(new MenuItem("Park big", 139.0));
        menuItems.add(new MenuItem("Bacon small", 29.0));
        menuItems.add(new MenuItem("Bacon big", 65.0));
        menuItems.add(new MenuItem("Tendered Pork", 29.0));
        menuItems.add(new MenuItem("GyuHarami small", 69.0));
        menuItems.add(new MenuItem("GyuHarami big", 129.0));
        menuItems.add(new MenuItem("Beef small", 69.0));
        menuItems.add(new MenuItem("Beef big", 129.0));
        menuItems.add(new MenuItem("Fresh Shrimp", 59.0));
        menuItems.add(new MenuItem("Squid", 39.0));
        menuItems.add(new MenuItem("Pangsius hypophthalmus", 39.0));
        menuItems.add(new MenuItem("PorkBall", 39.0));
        menuItems.add(new MenuItem("Chinese CAbbage", 35.0));
        menuItems.add(new MenuItem("Water Moming Glory", 35.0));
        menuItems.add(new MenuItem("Pakchoi", 39.0));
        menuItems.add(new MenuItem("Shimeji mushoroom", 39.0));
        menuItems.add(new MenuItem("Enalitake mushroom", 39.0));
        menuItems.add(new MenuItem("jelyfish", 59.0));
        menuItems.add(new MenuItem("Suklyyaki sauce", 20.0));
        menuItems.add(new MenuItem("Seafood sauce", 20.0));
        menuItems.add(new MenuItem("Scicy sauce", 20.0));
    }

    public void showMenu() {
        System.out.println("===========================");
        System.out.println("       Shabu Menu");
        System.out.println("===========================");
        int i = 1;
        for (MenuItem menuItem : menuItems) {
            System.out.println(i + ". " + menuItem.toString());
            i++;
        }
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
}
