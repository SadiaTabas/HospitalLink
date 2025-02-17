import java.sql.*;

public class StaffConnection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Register JDBC driver
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", ""); // Establish connection
            System.out.println("Connected to the staff table!");

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM staff"); // Query for staff table

            while (rs.next()) {
                System.out.println(
                    "Staff ID: " + rs.getInt(1) +
                    ", Name: " + rs.getString(2) +
                    ", Department: " + rs.getString(3) +
                    ", Phone: " + rs.getString(4)
                );
            }
            conn.close(); // Close connection
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

