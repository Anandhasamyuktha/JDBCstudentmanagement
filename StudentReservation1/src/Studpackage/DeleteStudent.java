
package Studpackage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteStudent {

    public static void deleteStudent(Scanner d) throws SQLException {
        System.out.println("Enter Student ID to Delete");
        int id = d.nextInt();
        d.nextLine();
        String query = "DELETE FROM student WHERE id = ?";
        
        Connection con = DatabaseConnection.getConnection();
		PreparedStatement ps = con.prepareStatement(query);
        Statement st1=con.createStatement();
    
        	try	{
            
            String squery="select * from student";
            ResultSet rs = st1.executeQuery(squery);
            boolean val=true;
            while(rs.next()) {
            	int dbid=rs.getInt(1);
            	if(dbid==id) {
            		
            		ps.setInt(1, id);
            		 ps.executeUpdate();
            		 val=false;
                     System.out.println("Student deleted Successfully!!");
            	}
            }
           if(val) {
        	   System.out.println("ID doesnot exist!!");
           }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}

