package repository;

import connection.MySQLConnectionManager;

import java.sql.SQLException;
import java.util.List;

public interface RepositoryInterface<T> {
    List<T> readFromDatabase(MySQLConnectionManager connection) throws SQLException;
}

