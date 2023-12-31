// BusinessLogicLayer.java
public class BusinessLogicLayer {
    private DataAccessLayer dataAccess;

    public BusinessLogicLayer(DataAccessLayer dataAccess) {
        this.dataAccess = dataAccess;
    }

    public void addProduct(String productName, double price, int quantity, String category) {
        // Check if productName and category start with letters
        if (!productName.matches("[a-zA-Z].*") || !category.matches("[a-zA-Z].*")) {
            System.out.println("Error: Product name and category should start with letters.");
            return;
        }

        // Check if price and quantity are numbers
        if (!isNumeric(price) || !isNumeric(quantity)) {
            System.out.println("Error: Price and quantity must be numeric values.");
            return;
        }

        // Call data access layer to save the product
        dataAccess.saveProduct(new Product(productName, price, quantity, category));
    }

    private boolean isNumeric(Object value) {
        if (value instanceof Number) {
            return true;
        }
        try {
            Double.parseDouble(value.toString());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
