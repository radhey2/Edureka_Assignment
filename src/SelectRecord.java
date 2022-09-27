import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectRecord {
    static final String DB_URL = "jdbc:mysql://localhost/StudentDb";
    static final String USER = "root";
    static final String PASS = "root";
    static final String QUERY = "SELECT id, name, marks, class FROM student";

    public static void main(String[] args) {
        // Open a connection
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(QUERY);) {
            while (rs.next()) {
                // Display values
                System.out.print("ID: " + rs.getInt("id"));
                System.out.print(", name: " + rs.getInt("name"));
                System.out.print(", marks: " + rs.getString("marks"));
                System.out.println(", class: " + rs.getString("class"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
