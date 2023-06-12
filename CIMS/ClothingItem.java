package CIMS;

//Stating all the class Variables.
public class ClothingItem implements Item{
    private String itemId;
    private String itemName;
    private String category;
    private double price;
    private int quantity;

    //The clothing item constructor.
    public ClothingItem(String itemId, String itemName, String category, double price, int quantity) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    //This method returns the itemID
    public String getItemId() {
        return itemId;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //Auto generate a toString method. Generate to display the item information.
    @Override
    public String toString() {
        return "ClothingItem{" +
                "itemId='" + itemId + '\'' +
                ", itemName='" + itemName + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
