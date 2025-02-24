package com.karan;

import java.sql.*;

class TestConnection {
	private Connection cn = null; // it tells whom to connect
	private Statement st = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	private String selectsql = "select * from product";
	private String insertsql = "insert into product values(?,?,?,?)";
	private String deletesql = "delete from product where pid = ?";
	private String updatesql = "update product set pname = ?, pqty = ?, price = ? where pid = ?";

	public void updateData() {
		try {
			// Class.forName("com.mysql.cj.jdbc.Driver"); // register and load the jdbc
			// driver
			// cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/aecdbst", "root",
			// "1448"); // establish the connection
			ConnectionFactory con = new ConnectionFactory();
			cn = con.getConn();
			ps = cn.prepareStatement(updatesql);
			ps.setString(1, "Refrigerator");
			ps.setInt(2, 2);
			ps.setDouble(3, 10000.00);
			ps.setString(4, "P3");
			ps.executeUpdate(); // save data
		}
		// catch (ClassNotFoundException e) {
		// e.printStackTrace();
		// }
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteData() {
		try {
			// Class.forName("com.mysql.cj.jdbc.Driver"); // register and load the jdbc
			// driver
			// cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/aecdbst", "root",
			// "1448"); // establish the connection
			ConnectionFactory con = new ConnectionFactory();
			cn = con.getConn();
			ps = cn.prepareStatement(deletesql);
			ps.setString(1, "P1");
			ps.executeUpdate(); // save data
		}
		// catch (ClassNotFoundException e) {
		// e.printStackTrace();
		// }
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void addData() {
		try {
			// Class.forName("com.mysql.cj.jdbc.Driver"); // register and load the jdbc
			// driver
			// cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/aecdbst", "root",
			// "1448"); // establish the connection
			ConnectionFactory con = new ConnectionFactory();
			cn = con.getConn();
			ps = cn.prepareStatement(insertsql);
			ps.setString(1, "P1");
			ps.setString(2, "REFRIGERATOR");
			ps.setInt(3, 1);
			ps.setDouble(4, 2700.00);
			ps.executeUpdate(); // save data
		}
		// catch (ClassNotFoundException e) {
		// e.printStackTrace();
		// }
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void getData() {
		try {
			// Class.forName("com.mysql.cj.jdbc.Driver"); // register and load the jdbc
			// driver
			// cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/aecdbst", "root",
			// "1448"); // establish the connection
			ConnectionFactory con = new ConnectionFactory();
			cn = con.getConn();
			st = cn.createStatement(); // Create the statement
			rs = st.executeQuery(selectsql);// execute the query and store the value into result set
			while (rs.next()) {
				// System.out.println(rs.getString(1));
				// System.out.println(rs.getString(2));
				// System.out.println(rs.getInt(3));
				// System.out.println(rs.getDouble(4));
				System.out.println(
						rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3) + "\t" + rs.getDouble(4));
			}
		}
		// catch (ClassNotFoundException e) {
		//// e.printStackTrace();
		// }
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

public class JavaMysqlConnection {
	public static void main(String[] args) {
		TestConnection tc = new TestConnection();
		// tc.addData();
		// tc.getData();

		// tc.deleteData();

		tc.updateData();
		tc.getData();
	}
}
