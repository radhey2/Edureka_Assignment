import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insertdata {

    static final String DB_URL = "jdbc:mysql://localhost/StudentDb";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) {
        // Open a connection
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();) {
            // Execute a query
            System.out.println("Inserting records into the table...");
            String sql = "INSERT INTO student VALUES (100, 'Zara', 90, 12)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO student VALUES (101, 'Mahnaz', 95, 12)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO Student VALUES (102, 'Zaid', 85, 10)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO Student VALUES(103, 'Sumit', 50, 11)";
            stmt.executeUpdate(sql);
            System.out.println("Inserted records into the table...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
