package com.m8.DB;

import java.sql.*;


public interface DBConnect {
	static Connection con = null;
	public Connection getConnection();
	public Connection getConnection(String user, String password, String host, String port, String db);
	
}
