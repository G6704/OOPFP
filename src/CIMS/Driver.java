package CIMS;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("1. Add Item");
            System.out.println("2. Update Item Quantity");
            System.out.println("3. Remove Item");
            System.out.println("4. Display All Items");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
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
                    ClothingItem item = new ClothingItem(itemId, itemName, category, price, quantity);
                    inventory.addItem(item);
                    System.out.println("Item added successfully!");
                    break;
                case 2:
                    System.out.print("Enter item ID to update quantity: ");
                    itemId = scanner.nextLine();
                    System.out.print("Enter new quantity: ");
                    int newQuantity = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    inventory.updateItemQuantity(itemId, newQuantity);
                    System.out.println("Item quantity updated successfully!");
                case 3:
                    System.out.print("Enter item ID to remove: ");
                    itemId = scanner.nextLine();
                    inventory.removeItem(itemId);
                    System.out.println("Item removed successfully!");
                    break;
                case 4:
                    System.out.println("Inventory Items:");
                    inventory.displayAllItems();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }
        scanner.close();
    }
}
