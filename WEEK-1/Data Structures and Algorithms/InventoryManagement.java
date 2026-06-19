import java.util.HashMap;

public class InventoryManagement {

    static class Product {
        int productId;
        String productName;
        int quantity;
        double price;

        Product(int productId, String productName, int quantity, double price) {
            this.productId = productId;
            this.productName = productName;
            this.quantity = quantity;
            this.price = price;
        }

        public String toString() {
            return "ID: " + productId +
                    ", Name: " + productName +
                    ", Quantity: " + quantity +
                    ", Price: " + price;
        }
    }

    static HashMap<Integer, Product> inventory = new HashMap<>();

    static void addProduct(Product product) {
        inventory.put(product.productId, product);
    }

    static void updateProduct(int id, int quantity, double price) {
        if (inventory.containsKey(id)) {
            Product p = inventory.get(id);
            p.quantity = quantity;
            p.price = price;
        } else {
            System.out.println("Product not found.");
        }
    }

    static void deleteProduct(int id) {
        inventory.remove(id);
    }

    static void displayProducts() {
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {

        addProduct(new Product(101, "Laptop", 10, 55000));
        addProduct(new Product(102, "Mouse", 50, 500));
        addProduct(new Product(103, "Keyboard", 25, 1200));

        System.out.println("Initial Inventory:");
        displayProducts();

        updateProduct(102, 40, 450);

        deleteProduct(103);

        System.out.println("\nUpdated Inventory:");
        displayProducts();
    }
}