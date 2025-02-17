import java.sql.*;
public class CEOConnection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "");
            System.out.println("Connected to the ceo table!");

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM ceo");

            while (rs.next()) {
                System.out.println("CEO ID=" + rs.getInt(1) + " Name=" + rs.getString(2) + " Contact=" + rs.getString(3));
            }
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}