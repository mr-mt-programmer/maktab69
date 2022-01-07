package org.test;

import java.sql.*;

public class jdbcTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","123");

        
    }
}
