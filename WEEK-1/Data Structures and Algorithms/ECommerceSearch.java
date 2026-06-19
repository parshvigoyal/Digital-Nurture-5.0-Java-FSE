import java.util.Arrays;

public class ECommerceSearch {

    static class Product {
        int productId;
        String productName;
        String category;

        Product(int productId, String productName, String category) {
            this.productId = productId;
            this.productName = productName;
            this.category = category;
        }

        public String toString() {
            return "ID: " + productId +
                    ", Name: " + productName +
                    ", Category: " + category;
        }
    }

    // Linear Search
    static Product linearSearch(Product[] products, String key) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(key)) {
                return product;
            }
        }
        return null;
    }

    // Binary Search
    static Product binarySearch(Product[] products, String key) {
        Arrays.sort(products, (a, b) ->
                a.productName.compareToIgnoreCase(b.productName));

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int compare = key.compareToIgnoreCase(products[mid].productName);

            if (compare == 0)
                return products[mid];
            else if (compare < 0)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Shoes", "Fashion"),
                new Product(103, "Book", "Education"),
                new Product(104, "Mobile", "Electronics"),
                new Product(105, "Watch", "Accessories")
        };

        String searchKey = "Mobile";

        Product linearResult = linearSearch(products, searchKey);
        Product binaryResult = binarySearch(products, searchKey);

        System.out.println("Linear Search Result:");
        System.out.println(linearResult);

        System.out.println();

        System.out.println("Binary Search Result:");
        System.out.println(binaryResult);
    }
}