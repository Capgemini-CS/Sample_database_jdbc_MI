package repository;

import connection.ConnectionManager;
import connection.MySQLConnectionManager;
import exception.InvalidQuery;
import model.Customer;
import org.tinylog.Logger;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements RepositoryInterface<Customer>{

    ConnectionManager connectionManager = new MySQLConnectionManager();

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

    @Override
    public List<Customer> readFromDatabase() throws SQLException, InvalidQuery {
        List<Customer> customers;
        try {
            customers = new ArrayList<>();

            String query = "select * from orderdetails where priceEach > 100 order by priceEach asc";

            PreparedStatement statement = connectionManager.getConnection().prepareStatement(query);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
//                Customer customer = new Customer();
//                customer.setOrderNumber(resultSet.getInt("orderNumber"));
//                customer.setProductCode(resultSet.getString("productCode"));
//                customer.setQuantityOrdered(resultSet.getInt("quantityOrdered"));
//                customer.setPriceEach(resultSet.getDouble("priceEach"));
//                customer.setOrderLineNumber(resultSet.getInt("orderLineNumber"));
//                customers.add(customer);
            }
            for (Customer ods : customers) {
                System.out.println(ods.toString());
            }
        } catch (SQLException e) {
            Logger.warn("Check you query or your parameters.");
            throw new InvalidQuery("Your query is incorrect or could not be performed.");
        }
        return customers;
    }
}
