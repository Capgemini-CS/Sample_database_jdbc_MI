package main;

import conection.MySQLConnectionManager;
import repository.OrderDetailRepository;
import repository.ProductRepository;

import java.sql.*;

public class MainJDBC {

    public static void main(String[] args) throws SQLException {

        MySQLConnectionManager connection = new MySQLConnectionManager();

        ProductRepository productRepository = new ProductRepository();
        productRepository.readFromDatabase(connection);

        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");

        OrderDetailRepository orderDetailRepository = new OrderDetailRepository();
        orderDetailRepository.readFromDatabase(connection);



    }
}






















































//    Constants urlAndAccount = new Constants();
//    Connection connection = DriverManager.getConnection(urlAndAccount.getUrl(),urlAndAccount.getUserName(),urlAndAccount.getPassword());
//
//    Employee employee = new Employee();
//        employee.executeSql(connection);
//
//                Product product = new Product();
//                product.executeSql(connection);
//
//                String queryWhoShowHowManyProductsAreInTable = "SELECT COUNT(productCode) as NumberfOfProducts FROM PRODUCTS;";
//                product.querySelectWithSql(connection,queryWhoShowHowManyProductsAreInTable);
//
//                //TODO RESOLVE THIS PROBLEM
//                String queryWhoShowTheValueOfEachOrder = "SELECT (o.priceEach * o.quantityOrdered) as Value_Of_Order, o.orderNumber as Order_Number, orders.orderDate as ORDER_DATE\n" +
//                "FROM orders orders\n" +
//                "RIGHT JOIN orderdetails o ON o.orderNumber = orders.orderNumber\n" +
//                "ORDER BY orders.orderDate ASC;";
//                product.querySelectWithSql(connection,queryWhoShowTheValueOfEachOrder);