package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_connection {
        public static Connection getConnection() throws ClassNotFoundException, SQLException {

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/JukeBox";

            /** when the method getConnection is called, the DriverManager will attempt
             *  to locate a suitable driver from amongst those loaded Drivers */

            return DriverManager.getConnection(url, "root", "Arjun@123");
        }
}
