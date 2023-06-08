package CIMS;

import java.util.ArrayList;
import java.util.List;
public class Inventory {
    private List<ClothingItem> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(ClothingItem item) {
        items.add(item);
    }

    public void updateItemQuantity(String itemId, int newQuantity) {
        for (ClothingItem item : items) {
            if (item.getItemId().equals(itemId)) {
                item.setQuantity(newQuantity);
                break;
            }
        }
    }

    public void removeItem(String itemId) {
        ClothingItem itemToRemove = null;
        for (ClothingItem item : items) {
            if (item.getItemId().equals(itemId)) {
                itemToRemove = item;
                break;
            }
        }
        if (itemToRemove != null) {
            items.remove(itemToRemove);
        }
    }

    public void displayAllItems() {
        for (ClothingItem item : items) {
            System.out.println(item.toString());
        }
    }
}

