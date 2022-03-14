package repository;

import connection.MySQLConnectionManager;
import exception.InvalidQuery;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface RepositoryInterface<T> {
    List<T> readFromDatabase() throws SQLException, InvalidQuery;
}

