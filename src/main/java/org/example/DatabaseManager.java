package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DatabaseManager {
    public static void saveTrainData(String name, String coach, long mobileNo, int basicAmount, int totalAmount) {
        String url = "jdbc:mysql://localhost:3306/railway_ticket";
        String username = "root";
        String password = "ABHI@7471131336";

        try {
            Connection conn = DriverManager.getConnection(url, username, password);

            String sql = "INSERT INTO  tickets (name, coach, mobile, basic_amount, total_amount) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.setString(2, coach);
            stmt.setLong(3, mobileNo);
            stmt.setInt(4, basicAmount);
            stmt.setInt(5, totalAmount);

            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("✅ Data saved to database successfully.");
            }

            conn.close();
        } catch (SQLException e) {
            System.out.println("❌ Database error:");
            e.printStackTrace();
        }
    }
}
