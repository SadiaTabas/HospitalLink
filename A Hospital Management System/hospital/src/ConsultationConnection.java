import java.sql.*;
public class ConsultationConnection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "");
            System.out.println("Connected to the consultation table!");

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM consultation");

            while (rs.next()) {
                System.out.println("Consultation ID=" + rs.getInt(1) + " Doctor ID=" + rs.getInt(2) + " Patient ID=" + rs.getInt(3) + " Date=" + rs.getString(4));
            }
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
