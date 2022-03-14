package model;

public class OrderDetail {
    private int orderNumber;
    private String productCode;
    private int quantityOrdered;
    private double priceEach;
    private int orderLineNumber;

    public OrderDetail() {}

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
        final StringBuffer sb = new StringBuffer("OrderDetail{");
        sb.append("orderNumber=").append(orderNumber);
        sb.append(", productCode='").append(productCode).append('\'');
        sb.append(", quantityOrdered=").append(quantityOrdered);
        sb.append(", priceEach=").append(priceEach);
        sb.append(", orderLineNumber=").append(orderLineNumber);
        sb.append('}');
        return sb.toString();
    }
}
