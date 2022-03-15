package service.mapper;

import model.Customer;
import model.Product;
import service.dto.CustomerDTO;
import service.dto.ProductDTO;

public class CustomerMapper {
    public static CustomerDTO fromCustomerToProductDTO(Customer customer){
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setCustomerNumber(customer.getCustomerNumber());
        customerDTO.setCustomerName(customer.getCustomerName());
        customerDTO.setContactLastName(customer.getContactLastName());
        customerDTO.setContactFirstName(customer.getContactFirstName());
        customerDTO.setPhone(customer.getPhone());
        customerDTO.setCity(customer.getCity());
        return customerDTO;
    }
}
