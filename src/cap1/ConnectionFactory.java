package cap1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection getConnection(){
        try {
            Connection conn = DriverManager.getConnection ("jdbc:h2:~/test", "sa","");
            return conn;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
