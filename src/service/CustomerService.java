package service;

import exception.InvalidQuery;
import model.Customer;
import org.tinylog.Logger;
import repository.RepositoryInterface;
import service.dto.CustomerDTO;
import service.mapper.CustomerMapper;

import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerService {

    RepositoryInterface<Customer> customerRepositoryInterface;

    public CustomerService(RepositoryInterface<Customer> customerRepositoryInterface) {
        this.customerRepositoryInterface = customerRepositoryInterface;
    }

    public void insertOneCustomer() throws InvalidQuery{
        customerRepositoryInterface.insertRow();
    }

    public void deleteOneCustomerByCustomerId(String customerNumber) throws InvalidQuery {
        customerRepositoryInterface.deleteRow(customerNumber);
    }

    public void updatePhoneCustomerByCity(String city) throws InvalidQuery {
        customerRepositoryInterface.updateRow(city);
    }

    public List<CustomerDTO> showAllCustomers() throws InvalidQuery {
        try {
            return customerRepositoryInterface.readFromDatabase().stream().map(CustomerMapper::fromCustomerToProductDTO).collect(Collectors.toList());
        } catch (SQLException e) {
            Logger.error("Check you query or your parameters.");
            throw new InvalidQuery("Sorry. Your method didn't work.");
        }
    }
}
