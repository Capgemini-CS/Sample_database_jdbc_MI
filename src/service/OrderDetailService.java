package service;
import exception.InvalidQuery;
import model.OrderDetail;
import org.tinylog.Logger;
import repository.RepositoryInterface;
import service.dto.OrderDetailDTO;
import service.mapper.OrderDetailsMapper;

import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

public class OrderDetailService {

    RepositoryInterface<OrderDetail> orderDetailRepositoryInterface;

    public OrderDetailService(RepositoryInterface<OrderDetail> orderDetailRepositoryInterface) {
        this.orderDetailRepositoryInterface = orderDetailRepositoryInterface;
    }

    public List<OrderDetailDTO> showAllOrdersWithPriceHigherThan100() throws InvalidQuery {
        try {
            return orderDetailRepositoryInterface.readFromDatabase().stream().map(OrderDetailsMapper::fromOrderDetailToOrderDetailDTO).collect(Collectors.toList());
        } catch (SQLException e) {
            Logger.error("Check you query or your parameters.");
            throw new InvalidQuery("Sorry. Your method didn't work.");
        }
    }

    public void insertOneOrderDetails() throws InvalidQuery {
        try {
            orderDetailRepositoryInterface.insertRow();
        } catch (InvalidQuery e) {
            Logger.error("Check you query or your parameters.");
            throw new InvalidQuery("Sorry. Your method didn't work.");
        }
    }

    public void updateOnOrdersTable(String inputFromUser) throws InvalidQuery {
        try {
            orderDetailRepositoryInterface.updateRow(inputFromUser);
        } catch (InvalidQuery e) {
            Logger.error("Check you query or your parameters.");
            throw new InvalidQuery("Sorry. Your method didn't work.");
        }
    }

    public void deleteOnOrdersTable(String inputFromUser) throws InvalidQuery {
        try {
            orderDetailRepositoryInterface.deleteRow(inputFromUser);
        } catch (InvalidQuery e) {
            Logger.error("Check you query or your parameters.");
            throw new InvalidQuery("Sorry. Your method didn't work.");
        }
    }

}

