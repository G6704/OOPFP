package CIMS;

import java.util.ArrayList;
import java.util.List;
public class Inventory {
    //Private list object.
    private List<ClothingItem> items;
    //Public constructor.
    public Inventory() {
        items = new ArrayList<>();
    }
    //Public method to add item to the existing array list.
    public void addItem(ClothingItem item) {
        items.add(item);
    }
    //Public method to update the item quantity from case 2
    public void updateItemQuantity(String itemId, int newQuantity) {
        for (ClothingItem item : items) {
            //Set item to remove to item if ID matches input id
            if (item.getItemId().equals(itemId)) {
                item.setQuantity(newQuantity);
                break;
            }
        }
    }
    //Public method to remove the item from the array list. executed by case 3.
    public void removeItem(String itemId) {
        ClothingItem itemToRemove = null;
        for (ClothingItem item : items) {
            //Set item to remove to item if ID matches input id
            if (item.getItemId().equals(itemId)) {
                itemToRemove = item;
                break;
            }
        }
        //Remove the items if it exists.
        if (itemToRemove != null) {
            items.remove(itemToRemove);
        }
    }
    //Prints out all the input itmes
    public void displayAllItems() {
        for (ClothingItem item : items) {
            System.out.println(item.toString());
        }
    }
}

