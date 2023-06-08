package CIMS;

public class ClothingItem {
    private String itemId;
    private String itemName;
    private String category;
    private double price;
    private int quantity;

    public ClothingItem(String itemId, String itemName, String category, double price, int quantity) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }
    public String getItemId() {
        return itemId;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
