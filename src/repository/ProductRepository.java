package repository;

import conection.MySQLConnectionManager;
import service.ProductService;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements RepositoryInterface<ProductService>{

    @Override
    public List<ProductService> readFromDatabase(MySQLConnectionManager connection) throws SQLException {
        List<ProductService> products = new ArrayList<>();

        String query = "select * from products where productLine like ?";

        PreparedStatement statement = connection.getConnection().prepareStatement(query);

        statement.setString(1, "Motorcycles");

        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            ProductService product = new ProductService();
            product.setProductCode(resultSet.getString("productCode"));
            product.setProductName(resultSet.getString("productName"));
            product.setProductLine(resultSet.getString("productLine"));
            product.setProductScale(resultSet.getString("productScale"));
            product.setProductVendor(resultSet.getString("productVendor"));
            product.setProductDescription(resultSet.getString("productDescription"));
            product.setQuantityInStock(resultSet.getInt("quantityInStock"));
            product.setBuyPrice(resultSet.getDouble("buyPrice"));
            products.add(product);
        }
        for(ProductService ps : products){
            System.out.println(ps.toString());
        }
        return products;
    }
}
