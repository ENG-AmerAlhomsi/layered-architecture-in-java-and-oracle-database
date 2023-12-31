// PresentationLayer.java
import java.util.Scanner;

public class PresentationLayer {
    private BusinessLogicLayer businessLogic;

    public PresentationLayer(BusinessLogicLayer businessLogic) {
        this.businessLogic = businessLogic;
    }

    public void addProductFromUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Product Details");

        System.out.print("Product Name: ");
        String productName = scanner.nextLine();

        System.out.print("Price: ");
        double price = scanner.nextDouble();

        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();

        // تنظيف السطر الذي يحتوي على Enter بعد nextInt
        scanner.nextLine();

        System.out.print("Category: ");
        String category = scanner.nextLine();

        // قم بإضافة المنتج باستخدام BusinessLogicLayer
        businessLogic.addProduct(productName, price, quantity, category);    }
}
