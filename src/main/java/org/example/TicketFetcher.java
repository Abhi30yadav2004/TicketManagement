package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TicketFetcher {
    public static void fetchAllTickets() {
        String url = "jdbc:mysql://localhost:3306/railway_ticket";
        String username = "root";
        String password = "ABHI@7471131336";

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "SELECT * FROM tickets";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("----- Ticket Records -----");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String coach = rs.getString("coach");
                long mobile = rs.getLong("mobile");
                int basic = rs.getInt("basic_amount");
                int total = rs.getInt("total_amount");

                System.out.println("ID: " + id + ", Name: " + name + ", Coach: " + coach +
                        ", Mobile: " + mobile + ", Basic: " + basic + ", Total: " + total);
            }

            conn.close();
        } catch (Exception e) {
            System.out.println("Error fetching data: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
