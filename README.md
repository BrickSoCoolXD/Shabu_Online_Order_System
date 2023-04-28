# Shabu Order Online
 Shabu Order Online is a Java command-line application that allows users to order food items from a menu and generates a receipt of the order.



# Features
 Users can view the menu of available food items and their prices
 Users can select a food item and specify the quantity they want to order
 Users can add multiple items to their order
 Users can view their order summary and the total price
 Users can generate a receipt of their order

# Installation
  Install Java SE Development Kit 8 on your computer.
  Download the Shabu Order Online source code from GitHub or clone the repository to your computer using the following command:

# bash
  Copy code
  git clone https://github.com/yourusername/shabu-order-online.git
  Open a terminal or command prompt and navigate to the project directory.
  Compile the source code using the following command:

# css
Copy code
javac Main.java
Run the application using the following command:
css
Copy code
java Main

# Usage
When the application starts, the user is presented with the menu of available food items and their prices.
The user can select a food item by entering the number corresponding to the item.
The user is prompted to enter the desired quantity of the selected item.
The user can add more items to their order or proceed to view their order summary and total price.
The user can generate a receipt of their order by selecting "Print Receipt" from the menu.

# License
This project is licensed under the MIT License - see the LICENSE.md file for details.

# Acknowledgements
Java SE Development Kit 8
GitHub
Stack Overflow

# MenuItem Class
Represents a single item on the menu, which has a name and a price.

# Properties
name (String) - The name of the menu item.
price (double) - The price of the menu item.
Constructors
MenuItem(String name, double price) - Creates a new menu item with the given name and price.
Methods
getName() : String - Returns the name of the menu item.
getPrice() : double - Returns the price of the menu item as a double.
# Menu Class
Represents the menu, which is a collection of MenuItem objects.

Properties
menuItems (List<MenuItem>) - A list of all the menu items.
Constructors
Menu() - Creates a new, empty menu.
Methods
addMenuItem(MenuItem item) : void - Adds a menu item to the menu.
removeMenuItem(int index) : void - Removes a menu item from the menu at the given index.
getMenuItems() : List<MenuItem> - Returns a list of all the menu items.
showMenu() : void - Prints out the menu to the console.
 
# OrderItem Class
Represents an item in an order, which is a menu item and a quantity.

Properties
menuItem (MenuItem) - The menu item being ordered.
quantity (int) - The quantity of the menu item being ordered.
Constructors
OrderItem(MenuItem menuItem, int quantity) - Creates a new order item with the given menu item and quantity.
Methods
getMenuItem() : MenuItem - Returns the menu item being ordered.
getQuantity() : int - Returns the quantity of the menu item being ordered.
getItemTotalPrice() : double - Returns the total price of the order item (menu item price times quantity).
 
# Order Class
Represents an order, which is a collection of OrderItem objects.

Properties
orderItems (List<OrderItem>) - A list of all the order items.
Constructors
Order() - Creates a new, empty order.
Methods
addToOrder(MenuItem menuItem, int quantity) : void - Adds a menu item to the order with the given quantity.
removeOrderItem(int index) : void - Removes an order item from the order at the given index.
getOrderItems() : List<OrderItem> - Returns a list of all the order items.
getTotalPrice() : double - Returns the total price of the order (sum of all order item total prices).
printReceipt() : void - Prints out a receipt of the order to the console.
 
# Main Class
The main class of the program, which handles user input and interacts with the Menu and Order classes.

Methods
main(String[] args) : void - The main method of the program, which handles user input and creates a new order.
