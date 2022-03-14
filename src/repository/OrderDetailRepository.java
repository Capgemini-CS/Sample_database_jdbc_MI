package repository;

import connection.MySQLConnectionManager;
import service.OrderDetailService;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderDetailRepository implements RepositoryInterface<OrderDetailService>{
    @Override
    public List<OrderDetailService> readFromDatabase(MySQLConnectionManager connection) throws SQLException {
        List<OrderDetailService> orders = new ArrayList<>();

        String query = "select * from orderdetails where priceEach > 100 order by priceEach asc";

        PreparedStatement statement = connection.getConnection().prepareStatement(query);

        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            OrderDetailService order = new OrderDetailService();
            order.setOrderNumber(resultSet.getInt("orderNumber"));
            order.setProductCode(resultSet.getString("productCode"));
            order.setQuantityOrdered(resultSet.getInt("quantityOrdered"));
            order.setPriceEach(resultSet.getDouble("priceEach"));
            order.setOrderLineNumber(resultSet.getInt("orderLineNumber"));
            orders.add(order);
        }
        for(OrderDetailService ods : orders){
            System.out.println(ods.toString());
        }
        return orders;
    }
}
