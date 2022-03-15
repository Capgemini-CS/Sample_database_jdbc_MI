package service;

import exception.InvalidQuery;
import model.Customer;
import model.OrderDetail;
import org.tinylog.Logger;
import repository.RepositoryInterface;

import java.sql.SQLException;
import java.util.List;

public class CustomerService {

    RepositoryInterface<Customer> customerRepositoryInterface;

    public CustomerService(RepositoryInterface<Customer> customerRepositoryInterface) {
        this.customerRepositoryInterface = customerRepositoryInterface;
    }

//    public void deleteOneCustomerByCustomerId(String customerNumber) throws InvalidQuery {
//        customerRepositoryInterface.deleteOneCustomer(customerNumber);
//    }

//    public void updatePhoneCustomerByCity(String city) throws InvalidQuery {
//        customerRepositoryInterface.updateCustomer(city);
//    }

    public List<Customer> showAllCustomers() throws InvalidQuery {
        try {
            return customerRepositoryInterface.readFromDatabase();
        } catch (SQLException e) {
            Logger.error("Check you query or your parameters.");
            throw new InvalidQuery("Sorry. Your method didn't work.");
        }
    }
}
