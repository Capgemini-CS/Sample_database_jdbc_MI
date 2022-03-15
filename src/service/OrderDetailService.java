package service;
import exception.InvalidQuery;
import model.OrderDetail;
import org.tinylog.Logger;
import repository.RepositoryInterface;

import java.sql.SQLException;
import java.util.List;

public class OrderDetailService {

    RepositoryInterface<OrderDetail> orderDetailRepositoryInterface;

    public OrderDetailService(RepositoryInterface<OrderDetail> orderDetailRepositoryInterface) {
        this.orderDetailRepositoryInterface = orderDetailRepositoryInterface;
    }

    public List<OrderDetail> showAllOrdersWithPriceHigherThan100() throws InvalidQuery {
        try {
            return orderDetailRepositoryInterface.readFromDatabase();
        } catch (SQLException e) {
            Logger.error("Check you query or your parameters.");
            throw new InvalidQuery("Sorry. Your method didn't work.");
        }
    }



}
