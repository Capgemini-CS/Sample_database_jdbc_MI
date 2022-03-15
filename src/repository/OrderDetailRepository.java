package repository;

import connection.ConnectionManager;
import connection.MySQLConnectionManager;
import exception.InvalidQuery;
import model.OrderDetail;
import org.tinylog.Logger;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderDetailRepository implements RepositoryInterface<OrderDetail> {

    ConnectionManager connectionManager = new MySQLConnectionManager();

    @Override
    public List<OrderDetail> readFromDatabase() throws InvalidQuery {
        List<OrderDetail> orders;
        try {
            orders = new ArrayList<>();

            String query = "select * from orderdetails where priceEach > 100 order by priceEach asc";

            PreparedStatement statement = connectionManager.getConnection().prepareStatement(query);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                OrderDetail order = new OrderDetail();
                order.setOrderNumber(resultSet.getInt("orderNumber"));
                order.setProductCode(resultSet.getString("productCode"));
                order.setQuantityOrdered(resultSet.getInt("quantityOrdered"));
                order.setPriceEach(resultSet.getDouble("priceEach"));
                order.setOrderLineNumber(resultSet.getInt("orderLineNumber"));
                orders.add(order);
            }
            for (OrderDetail ods : orders) {
                System.out.println(ods.toString());
            }
        } catch (SQLException e) {
            Logger.warn("Check you query or your parameters.");
            throw new InvalidQuery("Your query is incorrect or could not be performed.");
        }
        return orders;
    }

    @Override
    public void deleteRow(String inputFromUser) throws InvalidQuery {
        try {
            String query = "delete from orderdetails where orderNumber = ? AND productCode = ?";
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
            String query = "update orderdetails set priceEach = 350 where priceEach > ?";
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
            String query = "insert into orderdetails values (?,?,?,?,?)";
            PreparedStatement statement = connectionManager.getConnection().prepareStatement(query);
            statement.setInt(1, 10196);
            statement.setString(2,"S700_3962");
            statement.setInt(3,80);
            statement.setDouble(4,60.20);
            statement.setInt(5,1);
            int result = statement.executeUpdate();
            if(result > 0) {
                System.out.println("Your insert is done with success!");
            }
        } catch (SQLException e) {
            Logger.warn("Check you query or your parameters.");
            throw new InvalidQuery("You didn't enter the correct parameters or the object entered already exists.");
        }
    }
}