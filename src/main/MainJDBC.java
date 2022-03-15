package main;

import exception.InvalidQuery;
import model.Customer;
import model.OrderDetail;
import model.Product;
import repository.CustomerRepository;
import repository.OrderDetailRepository;
import repository.ProductRepository;
import repository.RepositoryInterface;
import service.CustomerService;
import service.OrderDetailService;
import service.ProductService;

public class MainJDBC {

    public static void main(String[] args) throws InvalidQuery {

        RepositoryInterface<Product> productRepositoryInterface = new ProductRepository();
        ProductService productService = new ProductService(productRepositoryInterface);
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

        productService.insertOneProduct();

        System.out.println();
        System.out.println();
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println();
        System.out.println();

        productService.updateProducts("S12_1099");

        System.out.println();
        System.out.println();
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println();
        System.out.println();

        productService.deleteProducts("S08_1001");




        RepositoryInterface<OrderDetail> orderDetailRepositoryInterface = new OrderDetailRepository();
        OrderDetailService orderDetailService = new OrderDetailService(orderDetailRepositoryInterface);
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

        orderDetailService.insertOneOrderDetails();

        System.out.println();
        System.out.println();
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println();
        System.out.println();

        orderDetailService.updateOnOrdersTable("150");

        System.out.println();
        System.out.println();
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println();
        System.out.println();

        orderDetailService.deleteOnOrdersTable("10101");



        RepositoryInterface<Customer> customerRepositoryInterface = new CustomerRepository();
        CustomerService customerService = new CustomerService(customerRepositoryInterface);
        customerService.deleteOneCustomerByCustomerId("480");


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

        System.out.println();
        System.out.println();
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println();
        System.out.println();

        customerService.showAllCustomers();

        System.out.println();
        System.out.println();
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println("*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****_____-----_____*****");
        System.out.println();
        System.out.println();

        customerService.insertOneCustomer();
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