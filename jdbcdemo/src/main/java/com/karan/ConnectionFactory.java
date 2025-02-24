package com.karan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	Connection cn = null;
	
	public Connection getConn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");   // register and load the jdbc driver
			cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb", "root", "1448");  // establish the connection
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cn;
	}
}