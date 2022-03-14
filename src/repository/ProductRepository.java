package repository;

import connection.MySQLConnectionManager;
import exception.InvalidQuery;
import model.Product;
import org.tinylog.Logger;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements RepositoryInterface<Product>{

    MySQLConnectionManager connectionManager = new MySQLConnectionManager();

    @Override
    public List<Product> readFromDatabase() throws InvalidQuery {
        List<Product> products;
        try {
            products = new ArrayList<>();

            String query = "select * from products where productLine like ?";

            PreparedStatement statement = connectionManager.getConnection().prepareStatement(query);

            statement.setString(1, "Motorcycles");

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Product product = new Product();
                product.setProductCode(resultSet.getString("productCode"));
                product.setProductName(resultSet.getString("productName"));
                product.setProductLine(resultSet.getString("productLine"));
                product.setProductScale(resultSet.getString("productScale"));
                product.setProductVendor(resultSet.getString("productVendor"));
                product.setProductDescription(resultSet.getString("productDescription"));
                product.setQuantityInStock(resultSet.getInt("quantityInStock"));
                product.setBuyPrice(resultSet.getDouble("buyPrice"));
                products.add(product);
            }
            for (Product ps : products) {
                System.out.println(ps.toString());
            }
        } catch (SQLException e) {
            Logger.warn("Check you query or your parameters.");
            throw new InvalidQuery("Your query is incorrect or could not be performed.");
        }
        return products;
    }

    public List<Product> showTheAverageValue() throws InvalidQuery {
        List<Product> products;
        try {
            products = new ArrayList<>();

            String query = "select * from products where productLine = 'Classic Cars' " +
                    "AND quantityInStock > 3000 GROUP BY productName; ";

            PreparedStatement statement = connectionManager.getConnection().prepareStatement(query);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Product secondProduct = new Product();
                secondProduct.setProductCode(resultSet.getString("productCode"));
                secondProduct.setProductName(resultSet.getString("productName"));
                secondProduct.setProductLine(resultSet.getString("productLine"));
                secondProduct.setProductScale(resultSet.getString("productScale"));
                secondProduct.setProductVendor(resultSet.getString("productVendor"));
                secondProduct.setProductDescription(resultSet.getString("productDescription"));
                secondProduct.setQuantityInStock(resultSet.getInt("quantityInStock"));
                secondProduct.setBuyPrice(resultSet.getDouble("buyPrice"));
                products.add(secondProduct);
            }
            for (Product ps : products) {
                System.out.println(ps.toString());
            }
        } catch (SQLException e) {
            Logger.warn("Check you query or your parameters.");
            throw new InvalidQuery("Your query is incorrect or could not be performed.");
        }
        return products;
    }

}
