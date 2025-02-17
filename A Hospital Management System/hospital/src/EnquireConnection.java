import java.sql.*;
public class EnquireConnection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "");
            System.out.println("Connected to the enquire table!");

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM enquire");

            while (rs.next()) {
                System.out.println("Enquiry ID=" + rs.getInt(1) + " Patient ID=" + rs.getInt(2) + " Query=" + rs.getString(3));
            }
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}