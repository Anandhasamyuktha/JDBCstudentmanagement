
package Studpackage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AddStudent {

    public static void addStudent(Scanner d) throws SQLException {
        System.out.println("Enter name");
        String name = d.nextLine();
        System.out.println("Enter year");
        int year = d.nextInt();
        d.nextLine();
        System.out.println("Enter department");
        String dept = d.nextLine();
        System.out.println("Enter CGPA");
        float cgpa = d.nextFloat();
        d.nextLine();
        String query = "INSERT INTO student(name, year, dept, cgpa) VALUES(?, ?, ?, ?)";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, name);
            ps.setInt(2, year);
            ps.setString(3, dept);
            ps.setFloat(4, cgpa);

            ps.executeUpdate();
            System.out.println("Student added Successfully!!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Invalid data! Enter data correctly.");
        }
    }
}

