 
import java.sql.*;

public class ReceptionistConnection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "");
            System.out.println("Connected to the receptionist table!");

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM receptionist"); // Query for receptionist table

            while (rs.next()) {
                System.out.println(
                    "Receptionist ID: " + rs.getInt(1) + 
                    ", Name: " + rs.getString(2) + 
                    ", Email: " + rs.getString(3) + 
                    ", Phone: " + rs.getString(4)
                );
            }
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
