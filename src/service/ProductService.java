package service;

import exception.InvalidQuery;
import model.Product;
import repository.ProductRepository;
import java.util.List;

public class ProductService {

    ProductRepository productRepository = new ProductRepository();

    public List<Product> showAllProductsByProductLine() throws InvalidQuery {
        return productRepository.readFromDatabase();
    }

    public List<Product> showTheAverageValueByProductLine() throws InvalidQuery {
        return productRepository.showTheAverageValue();
    }
}
