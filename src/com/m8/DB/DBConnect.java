package com.m8.DB;

import java.sql.*;


public interface DBConnect {
	
	public Connection getConnection();
	public Connection getConnection(String user, String password, String host, String port, String db);
	
}
