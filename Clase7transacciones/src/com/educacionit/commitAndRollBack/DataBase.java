package com.educacionit.commitAndRollBack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {

	private final static String db = "basetransaccion";
	private final static String login = "root";
	private final static String password = "";
	private final static String url = "jdbc:mysql://localhost/" + db;

	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, login, password);
			if (conn != null) {
				System.out.println("logramos conectarnos a la base " + db);
			}
			return conn;

		} catch (SQLException e) {
			System.out.println("Mensaje : " + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("Mensaje : " + e.getMessage());
		}
		return null;

	}
}
