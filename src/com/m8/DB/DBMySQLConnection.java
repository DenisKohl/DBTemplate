package com.m8.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBMySQLConnection implements DBConnect {
	private Connection con = null;
	
	 public DBMySQLConnection(String user, String password, String host, String port, String db) {
		try {
			con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+db+"?user="+user+"&password="+password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	@Override
	public Connection getConnection() {
		
		return con;
	}

}
