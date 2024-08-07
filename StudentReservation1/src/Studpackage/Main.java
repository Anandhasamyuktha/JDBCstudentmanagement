package Studpackage;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {
        Scanner d = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("1. Add Student");
                System.out.println("2. Update Student");
                System.out.println("3. Delete Student");
                System.out.println("4. View all Students");
                System.out.println("5. Exit");
                System.out.println("Enter your choice");

                int ch = d.nextInt();
                d.nextLine();
                switch (ch) {
                    case 1:
                        AddStudent.addStudent(d);
                        break;
                    case 2:
                        UpdateStudent.updateStudent(d);
                        break;
                    case 3:
                        DeleteStudent.deleteStudent(d);
                        break;
                    case 4:
                        ViewStudents.viewStudents();
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        d.close();
                        return;
                    default:
                        System.out.println("Invalid Choice");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input, please enter a number within the range");
            }
        }
    }
}
