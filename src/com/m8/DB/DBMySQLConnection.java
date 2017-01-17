package com.m8.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBMySQLConnection implements DBConnect {
	private Connection con = null;
	@Override
	public Connection getConnection() {
		
		return null;
	}

	@Override
	public Connection getConnection(String user, String password, String host, String port, String db) {
		try {
			con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+db+"?user="+user+"&password="+password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

}
