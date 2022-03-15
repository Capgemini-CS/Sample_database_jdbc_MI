package service.mapper;

import model.OrderDetail;
import service.dto.OrderDetailDTO;

public class OrderDetailsMapper {
    public static OrderDetailDTO fromOrderDetailToOrderDetailDTO(OrderDetail orderDetail){
        OrderDetailDTO orderDetailDTO = new OrderDetailDTO();
        orderDetailDTO.setOrderNumber(orderDetail.getOrderNumber());
        orderDetailDTO.setProductCode(orderDetail.getProductCode());
        orderDetailDTO.setQuantityOrdered(orderDetail.getQuantityOrdered());
        orderDetailDTO.setPriceEach(orderDetail.getPriceEach());
        orderDetailDTO.setOrderLineNumber(orderDetail.getOrderLineNumber());

        return orderDetailDTO;
    }
}
