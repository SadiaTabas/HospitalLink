import java.sql.*;
public class PaymentConnection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "");
            System.out.println("Connected to the payment table!");

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM payment");

            while (rs.next()) {
                System.out.println("Payment ID=" + rs.getInt(1) + " Amount=" + rs.getDouble(2) + " Date=" + rs.getString(3));
            }
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
