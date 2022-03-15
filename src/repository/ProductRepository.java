package repository;

import connection.ConnectionManager;
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

    ConnectionManager connectionManager = new MySQLConnectionManager();

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

    @Override
    public void deleteRow(String inputFromUser) throws InvalidQuery {
        try {
            String query = "delete from products where productCode = ?";
            PreparedStatement statement = connectionManager.getConnection().prepareStatement(query);
            statement.setString(1,inputFromUser);
            int result = statement.executeUpdate();
            if(result > 0) {
                System.out.println("Your delete is done with success!");
            }
        } catch (SQLException e) {
            Logger.warn("Check you query or your parameters.");
            throw new InvalidQuery("You didn't enter a valid customer ID or the customer does not exist.");
        }
    }

    @Override
    public void updateRow(String inputFromUser) throws InvalidQuery {
        try {
            String query = "update products set quantityInStock = 10000 where productCode = ?";
            PreparedStatement statement = connectionManager.getConnection().prepareStatement(query);
            statement.setString(1,inputFromUser);
            int result = statement.executeUpdate();
            if(result > 0) {
                System.out.println("Your update is done with success!");
            }
        } catch (SQLException e) {
            Logger.warn("Check you query or your parameters.");
            throw new InvalidQuery("You didn't enter a valid city or the city does not exist.");
        }
    }

    @Override
    public void insertRow() throws InvalidQuery {
        try {
            String query = "insert into products values (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement = connectionManager.getConnection().prepareStatement(query);
            statement.setString(1,"S01_1111");
            statement.setString(2,"Bmw Seria M4 2022");
            statement.setString(3,"Classic Cars");
            statement.setString(4,"1:18");
            statement.setString(5,"Bavaria Motor");
            statement.setString(6,"E bmw, deci trage periculos rau si ia curbele de-a latu");
            statement.setInt(7,2000);
            statement.setDouble(8,21000);
            statement.setDouble(9,42000000);
            statement.setDouble(10,17.19);
            int result = statement.executeUpdate();
            if(result > 0) {
                System.out.println("Your insert is done with success!");
            }
        } catch (SQLException e) {
            Logger.warn("Check you query or your parameters.");
            throw new InvalidQuery("You didn't enter the correct parameters or the object entered already exists.");
        }
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
