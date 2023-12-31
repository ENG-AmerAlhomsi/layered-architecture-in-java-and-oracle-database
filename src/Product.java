// Product.java
public class Product {
    private String productName;
    private double price;
    private int quantity;
    private String category;

    public Product(String productName, double price, int quantity, String category) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }
}
