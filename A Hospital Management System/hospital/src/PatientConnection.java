import java.sql.*;

public class PatientConnection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Register JDBC driver
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", ""); // Establish connection
            System.out.println("Connected to the patient table!");

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM patient"); // Query for patient table

            while (rs.next()) {
                System.out.println(
                    "Patient ID: " + rs.getInt(1) +
                    ", Name: " + rs.getString(2) +
                    ", Age: " + rs.getInt(3) +
                    ", Phone: " + rs.getString(4)
                );
            }
            conn.close(); // Close connection
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
