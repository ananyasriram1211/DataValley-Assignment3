import java.io.*;

class Item implements Serializable {
    private static final long serialVersionUID = 1L;
    private int itemID;
    private String itemName;
    private String category;
    private double itemPrice;

    public Item(int id, String name, String category, double price) {
        this.itemID = id;
        this.itemName = name;
        this.category = category;
        this.itemPrice = price;
    }

    public int getItemID() {
        return itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public String getCategory() {
        return category;
    }

    public double getItemPrice() {
        return itemPrice;
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        Item item = new Item(1, "Laptop", "Electronics", 999.99);

        try {
            FileOutputStream fileOut = new FileOutputStream("item.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(item);
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Item deserializedItem = null;

        try {
            FileInputStream fileIn = new FileInputStream("item.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            deserializedItem = (Item) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return;
        }

        System.out.println("Deserialized Item:");
        System.out.println("ID: " + deserializedItem.getItemID());
        System.out.println("Name: " + deserializedItem.getItemName());
        System.out.println("Category: " + deserializedItem.getCategory());
        System.out.println("Price: $" + deserializedItem.getItemPrice());
    }
}
