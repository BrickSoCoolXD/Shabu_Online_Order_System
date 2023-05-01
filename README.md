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

# MenuItem.java

This class represents a single menu item that a customer can order. It has the following 

# attributes:

id: An integer representing the unique identifier of the menu item.
name: A string representing the name of the menu item.
price: A double representing the price of the menu item.
The class also has the following 

# methods:

getId(): Returns the ID of the menu item.
getName(): Returns the name of the menu item.
getPrice(): Returns the price of the menu item.

# Menu.java

This class represents the menu of available items that a customer can order from. It has the following 

# attributes:

menuItems: A list of MenuItem objects representing the available items on the menu.
The class also has the following 

# methods:

showMenu(): Prints out the available items on the menu with their IDs, names, and prices.
getMenuItems(): Returns the list of MenuItem objects representing the available items on the menu.

# Order.java

This class represents an order made by a customer. It has the following 

# attributes:

orderItems: A list of OrderItem objects representing the items ordered by the customer.
The class also has the following 

# methods:

addToOrder(MenuItem item, int quantity): Adds a new OrderItem object to the list of ordered items with the specified MenuItem and quantity.
calculateTotal(): Calculates the total cost of the order by summing up the costs of all ordered items.
printReceipt(): Prints out a receipt of the order with details of each ordered item and the total cost.

# OrderItem.java

This class represents a single item in an order made by a customer. It has the following

# attributes:

menuItem: A MenuItem object representing the item ordered by the customer.
quantity: An integer representing the quantity of the item ordered by the customer.
The class also has the following 

# methods:

getMenuItem(): Returns the MenuItem object representing the item ordered.
getQuantity(): Returns the quantity of the item ordered.

# Main.java

This class is the entry point of the program and contains the main method that drives the ordering process. It uses the Menu, Order, and MenuItem classes to display the menu, take orders from the customer, and print out a receipt. The program also includes exception handling with a try-catch block to handle any potential errors during the ordering process.

# Example OutPut : 
*************** Welcome To Shabu Order Online ***************
=============================================================
Menu:
1. Chicken: $8.99
2. Beef: $10.99
3. Pork: $7.99
4. Shrimp: $12.99
5. Tofu: $6.99
6. Vegetables: $5.99
7. Rice: $2.99
8. Noodles: $3.99
9. Soda: $1.99
10. Beer: $4.99
11. Wine: $7.99
12. Cake: $9.99
13. Ice Cream: $3.99
14. Fruit Salad: $5.99
15. Fried Rice: $8.99
16. Dumplings: $6.99
17. Spring Rolls: $4.99
18. Chow Mein: $9.99
19. Hot and Sour Soup: $5.99
20. Egg Drop Soup: $4.99
21. Wonton Soup: $6.99
22. Pad Thai: $10.99
23. Tom Yum Soup: $7.99
24. Green Curry: $12.99
25. Red Curry: $11.99
26. Panang Curry: $12.99
27. Massaman Curry: $12.99
28. Exit

=============================================================
What Do You Want to Order Today?
1

You have Selected Chicken
Enter the desired Quantity:
2
Do you wish to order anything else (Y/N) : Y

What Do You Want to Order Today?
2

You have Selected Beef
Enter the desired Quantity:
3
Do you wish to order anything else (Y/N) : Y

What Do You Want to Order Today?
10

You have Selected Beer
Enter the desired Quantity:
1
Do you wish to order anything else (Y/N) : N

******************** Thank you for ordering ********************
-------------------------------------------------------------
Menu Item   | Quantity | Price Per Item | Total Price
-------------------------------------------------------------
Chicken     | 2        | $8.99         | $17.98
Beef        | 3        | $10.99        | $32.97
Beer        | 1        | $4.99         | $4.99
-------------------------------------------------------------
Total Price: $55.94
