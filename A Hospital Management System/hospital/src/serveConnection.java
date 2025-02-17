import java.sql.*;

// Serve Table Connection
public class serveConnection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "");
            System.out.println("Connected to the serve table!");

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM serve");

            while (rs.next()) {
                System.out.println("Serve ID=" + rs.getInt(1) + " Patient ID=" + rs.getInt(2) + " Service Date=" + rs.getString(3));
            }
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
