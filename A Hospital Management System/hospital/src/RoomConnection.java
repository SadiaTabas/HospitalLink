import java.sql.*;

public class RoomConnection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Register JDBC driver
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", ""); // Establish connection
            System.out.println("Connected to the room table!");

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM room"); // Query for room table

            while (rs.next()) {
                System.out.println(
                    "Room ID: " + rs.getInt(1) +
                    ", Type: " + rs.getString(2) +
                    ", Capacity: " + rs.getInt(3)
                );
            }
            conn.close(); // Close connection
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
