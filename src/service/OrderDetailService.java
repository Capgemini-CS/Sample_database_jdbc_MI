package service;

import exception.InvalidQuery;
import model.OrderDetail;
import repository.OrderDetailRepository;
import java.util.List;

public class OrderDetailService {

    OrderDetailRepository orderDetailRepository = new OrderDetailRepository();

    public List<OrderDetail> showAllOrdersWithPriceHigherThan100() throws InvalidQuery {
        return orderDetailRepository.readFromDatabase();
    }

    public void insertOneOrderDetails() throws InvalidQuery {
        orderDetailRepository.insertOneOrder();
    }

}
