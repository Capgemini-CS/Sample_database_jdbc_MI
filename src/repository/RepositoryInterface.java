package repository;

import conection.MySQLConnectionManager;
import service.ProductService;

import java.sql.SQLException;
import java.util.List;

public interface RepositoryInterface<T> {
    List<T> readFromDatabase(MySQLConnectionManager connection) throws SQLException;
}

