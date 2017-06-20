package com.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MyPojo {

	private String info;

	public String getInfo() {
		System.out.println("Getter called!");
		return info;
	}

	public void setInfo(String info) {
		System.out.println("Setter called!");
		this.info = info;
		// invoking jdbc connection as well, to show easy connectivity here
		persist(info);
	}

	private void persist(String info) {
		String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		String DB_URL = "jdbc:mysql://127.0.0.1:3306/namit_schema";
		String USER = "root";
		String PASS = "Intel@01";
		Connection conn = null;
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			String sql = "insert into testInfo values ('" + info + "');";
			Statement stmt;
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			System.out.println("Result of insert query - " + result);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
