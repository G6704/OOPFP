package CIMS;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);

        // Set Programming to running by default
        boolean running = true;
        //Begin user input loop
        while (running) {
            System.out.println("1. Add Item");
            System.out.println("2. Update Item Quantity");
            System.out.println("3. Remove Item");
            System.out.println("4. Display All Items");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            //The Function of each case option.
            switch (choice) {
                //case 1: The case used to add new items
                case 1:
                    System.out.print("Enter item ID: ");
                    String itemId = scanner.nextLine();
                    System.out.print("Enter item name: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter item category: ");
                    String category = scanner.nextLine();
                    System.out.print("Enter item price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter item quantity: ");
                    int quantity = scanner.nextInt();
                    //The pathway to the Clothing item class
                    ClothingItem item = new ClothingItem(itemId, itemName, category, price, quantity);
                    inventory.addItem(item);
                    System.out.println("Item added successfully!");
                    break;
                //Case 2: The Case to update the Item quantity.
                case 2:
                    System.out.print("Enter item ID to update quantity: ");
                    itemId = scanner.nextLine();
                    System.out.print("Enter new quantity: ");
                    int newQuantity = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    inventory.updateItemQuantity(itemId, newQuantity);
                    System.out.println("Item quantity updated successfully!");
                    break;
                //Case 3: The case to remove on of the input item.
                case 3:
                    System.out.print("Enter item ID to remove: ");
                    itemId = scanner.nextLine();
                    inventory.removeItem(itemId);
                    System.out.println("Item removed successfully!");
                    break;
                //Case 4: Case to display all the input item
                case 4:
                    System.out.println("Inventory Items:");
                    inventory.displayAllItems();
                    break;
                //Case 5: Exit
                case 5:
                    running = false;
                    break;
                //If any other number is input it reply with "Invalid choice! Please try again." and breaks.
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }

        }
        scanner.close();
    }
}
