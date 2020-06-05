package cap1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Programa {
    public static void main(String[] args) {
        Connection c = new ConnectionFactory().getConnection();
//        PreparedStatement ps = c.prepareStatement("select * from tabela");
    }
}
