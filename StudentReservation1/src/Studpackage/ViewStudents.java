package Studpackage;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ViewStudents {

    public static void viewStudents() throws SQLException {
        try (Connection con = DatabaseConnection.getConnection();
             Statement st = con.createStatement()) {
            String query = "SELECT * FROM student";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                System.out.println("Id: " + rs.getInt(1));
                System.out.println("Name: " + rs.getString(2));
                System.out.println("Year: " + rs.getInt(3));
                System.out.println("Dept: " + rs.getString(4));
                System.out.println("CGPA: " + rs.getFloat(5));
            }
        } catch (SQLException e) {
            System.out.println("Unable to view Students Details");
        }
    }
}
