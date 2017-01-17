package com.m8.DB.helper;

import java.sql.*;

public interface Querys {
	public PreparedStatement getAllPerson(Connection conn) throws SQLException;
	public PreparedStatement getPersonByName(Connection conn) throws SQLException;
	public PreparedStatement insetPerson(Connection conn) throws SQLException;
}
