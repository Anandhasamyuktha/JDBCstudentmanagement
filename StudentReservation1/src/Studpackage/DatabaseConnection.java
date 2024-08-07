
package Studpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    static String url = "jdbc:mysql://localhost:3306/studentdb";
    static String user = "root";
    static String pwd = "root";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, pwd);
    }
}

