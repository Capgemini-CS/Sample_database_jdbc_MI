package service;

public class OrderDetailService {
    private int orderNumber;
    private String productCode;
    private int quantityOrdered;
    private double priceEach;
    private int orderLineNumber;

    public OrderDetailService() {}

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setQuantityOrdered(int quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }

    public void setPriceEach(double priceEach) {
        this.priceEach = priceEach;
    }

    public void setOrderLineNumber(int orderLineNumber) {
        this.orderLineNumber = orderLineNumber;
    }

    @Override
    public String toString() {
        return "OrderDetailService{" + "orderNumber=" + orderNumber +
                ", productCode='" + productCode + '\'' +
                ", quantityOrdered=" + quantityOrdered +
                ", priceEach=" + priceEach +
                ", orderLineNumber=" + orderLineNumber +
                '}';
    }
}
