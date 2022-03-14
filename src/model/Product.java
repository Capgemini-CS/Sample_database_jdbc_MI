package model;

public class Product {
    private String productCode;
    private String productName;
    private String productLine;
    private String productScale;
    private String productVendor;
    private String productDescription;
    private int quantityInStock;
    private double buyPrice;

    public Product() {
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public void setProductScale(String productScale) {
        this.productScale = productScale;
    }

    public void setProductVendor(String productVendor) {
        this.productVendor = productVendor;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Product{");
            sb.append("productCode='").append(productCode).append('\'');
            sb.append(", productName='").append(productName).append('\'');
            sb.append(", productLine='").append(productLine).append('\'');
            sb.append(", quantityInStock=").append(quantityInStock);
            sb.append(", buyPrice=").append(buyPrice);
            sb.append('}');
        return sb.toString();
    }
}
