package main;

import exception.InvalidQuery;
import service.CustomerService;
import service.OrderDetailService;
import service.ProductService;

public class MainJDBC {

    public static void main(String[] args) throws InvalidQuery {

        ProductService productService = new ProductService();
        productService.showAllProductsByProductLine();

        System.out.println();
        System.out.println();
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println();
        System.out.println();

        OrderDetailService orderDetailService = new OrderDetailService();
        orderDetailService.showAllOrdersWithPriceHigherThan100();

        System.out.println();
        System.out.println();
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println();
        System.out.println();

        productService.showTheAverageValueByProductLine();

        System.out.println();
        System.out.println();
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println();
        System.out.println();

        //orderDetailService.insertOneOrderDetails();

        System.out.println();
        System.out.println();
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println();
        System.out.println();

        CustomerService customerService = new CustomerService();
        //customerService.deleteOneCustomerByCustomerId("480");

        System.out.println();
        System.out.println();
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println();
        System.out.println();

        customerService.updatePhoneCustomerByCity("Madrid");
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