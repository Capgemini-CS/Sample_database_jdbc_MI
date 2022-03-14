package service;

import exception.InvalidQuery;
import repository.CustomerRepository;

public class CustomerService {
    CustomerRepository customerRepository = new CustomerRepository();

    public void deleteOneCustomerByCustomerId(String customerNumber) throws InvalidQuery {
        customerRepository.deleteOneCustomer(customerNumber);
    }

    public void updatePhoneCustomerByCity(String city) throws InvalidQuery {
        customerRepository.updateCustomer(city);
    }
}
