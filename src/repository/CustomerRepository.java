package repository;

import connection.MySQLConnectionManager;
import exception.InvalidQuery;
import model.Customer;
import org.tinylog.Logger;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class CustomerRepository{

    MySQLConnectionManager connectionManager = new MySQLConnectionManager();

    public void deleteOneCustomer(String customerNumber) throws InvalidQuery {
        try {
            String query = "delete from customers where customerNumber = ?";
            PreparedStatement statement = connectionManager.getConnection().prepareStatement(query);
            statement.setString(1,customerNumber);
            int result = statement.executeUpdate();
            if(result > 0) {
                System.out.println("Your delete is done with success!");
            }
        } catch (SQLException e) {
            Logger.warn("Check you query or your parameters.");
            throw new InvalidQuery("You didn't enter a valid customer ID or the customer does not exist.");
        }
    }

    public void updateCustomer(String city) throws InvalidQuery {
        try {
            String query = "update customers set phone = '0712345678' where city = ?";
            PreparedStatement statement = connectionManager.getConnection().prepareStatement(query);
            statement.setString(1,city);
            int result = statement.executeUpdate();
            if(result > 0) {
                System.out.println("Your update is done with success!");
            }
        } catch (SQLException e) {
            Logger.warn("Check you query or your parameters.");
            throw new InvalidQuery("You didn't enter a valid city or the city does not exist.");
        }
    }
}
