import java.sql.*;

public class DoctorConnection {
    public static void main(String[] args) {
        try {
            // Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "");
            System.out.println("Connected to the doctor table!");

            // Execute query
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM doctor");

            // Print the results
            while (rs.next()) {
                System.out.println(
                        "Doctor ID: " + rs.getInt(1) +
                        ", Name: " + rs.getString(2) +
                        ", Specialty: " + rs.getString(3) +
                        ", Phone: " + rs.getString(4)
                );
            }

            // Close connection
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

