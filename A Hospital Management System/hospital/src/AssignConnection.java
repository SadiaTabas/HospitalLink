import java.sql.*;

 

// Assign Table Connection
public class AssignConnection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "");
            System.out.println("Connected to the assign table!");

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM assign");

            while (rs.next()) {
                System.out.println("Assign ID=" + rs.getInt(1) + " Staff ID=" + rs.getInt(2) + " Room ID=" + rs.getInt(3));
            }
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
