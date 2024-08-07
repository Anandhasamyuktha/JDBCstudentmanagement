
package Studpackage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateStudent {

    public static void updateStudent(Scanner d) throws SQLException {
        System.out.println("Enter Student ID to update");
        int id = d.nextInt();
        d.nextLine();
        System.out.println("Enter new Student name");
        String name = d.nextLine();
        System.out.println("Enter new Student year");
        int year = d.nextInt();
        d.nextLine();
        System.out.println("Enter new Student dept");
        String dept = d.nextLine();
        System.out.println("Enter new Student cgpa");
        float cgpa = d.nextFloat();
        d.nextLine();
        String query = "UPDATE student SET name = ?, year = ?, dept = ?, cgpa = ? WHERE id = ?";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, name);
            ps.setInt(2, year);
            ps.setString(3, dept);
            ps.setFloat(4, cgpa);
            ps.setInt(5, id);

            ps.executeUpdate();
            System.out.println("Student updated Successfully!!");
        } catch (SQLException e) {
            System.out.println("Enter details correctly to update!");
        }
    }
}

