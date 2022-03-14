package exception;

import java.sql.SQLException;

public class InvalidQuery extends Exception {
    public InvalidQuery(String message){ super(message); }
}
