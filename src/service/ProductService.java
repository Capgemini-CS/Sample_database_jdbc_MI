package service;

import exception.InvalidQuery;
import model.Product;
import org.tinylog.Logger;
import repository.RepositoryInterface;
import service.dto.ProductDTO;
import service.mapper.ProductMapper;

import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

public class ProductService {

    RepositoryInterface<Product> productRepositoryInterface;

    public ProductService(RepositoryInterface<Product> productRepositoryInterface) {
        this.productRepositoryInterface = productRepositoryInterface;
    }

    public List<ProductDTO> showAllProductsByProductLine() throws InvalidQuery {
        try {
            return productRepositoryInterface.readFromDatabase().stream().map(ProductMapper::fromProductToProductDTO).collect(Collectors.toList());
        } catch (SQLException e) {
            Logger.error("Check you query or your parameters.");
            throw new InvalidQuery("Sorry. Your method didn't work.");
        }
    }

    public void insertOneProduct() throws InvalidQuery {
        try {
            productRepositoryInterface.insertRow();
        } catch (InvalidQuery e) {
            Logger.error("Check you query or your parameters.");
            throw new InvalidQuery("Sorry. Your method didn't work.");
        }
    }

    public void updateProducts(String inputFromUser) throws InvalidQuery {
        try {
            productRepositoryInterface.updateRow(inputFromUser);
        } catch (InvalidQuery e) {
            Logger.error("Check you query or your parameters.");
            throw new InvalidQuery("Sorry. Your method didn't work.");
        }
    }

    public void deleteProducts(String inputFromUser) throws InvalidQuery {
        try {
            productRepositoryInterface.deleteRow(inputFromUser);
        } catch (InvalidQuery e) {
            Logger.error("Check you query or your parameters.");
            throw new InvalidQuery("Sorry. Your method didn't work.");
        }
    }


//    public List<Product> showTheAverageValueByProductLine() throws InvalidQuery {
//        return productRepositoryInterface.showTheAverageValue();
//    }
}
