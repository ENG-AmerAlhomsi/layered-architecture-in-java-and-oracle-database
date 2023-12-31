// DataAccessLayer.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataAccessLayer {
    private static final String DB_URL = "";
    private static final String USER = "";
    private static final String PASSWORD = "";

    public void saveProduct(Product product) {
        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD)) {
            String query = "INSERT INTO products (name, price, quantity, category) VALUES (?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, product.getProductName());
                preparedStatement.setDouble(2, product.getPrice());
                preparedStatement.setInt(3, product.getQuantity());
                preparedStatement.setString(4, product.getCategory());

                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
