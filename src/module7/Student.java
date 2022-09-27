package module7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {
    static final String DB_URL = "jdbc:mysql://localhost/StudentDb";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) {
        // Open a connection
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();) {
            String sql = "CREATE TABLE Student " +
                    "(id INTEGER not NULL, " +
                    " name VARCHAR(255), " +
                    "marks int," +
                    " class int );";

            stmt.executeUpdate(sql);
            System.out.println("Created table in given database...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
