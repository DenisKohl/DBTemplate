package com.m8.DB.helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MysqlQuerys implements Querys {

	@Override
	public PreparedStatement getAllPerson(Connection conn) throws SQLException {
		
		return conn.prepareStatement("SELECT * from person");
	}

	@Override
	public PreparedStatement getPersonByName(Connection conn) throws SQLException {
		
		return conn.prepareStatement("SELECT * FROM person WHERE name = ?");
	}

	@Override
	public PreparedStatement insetPerson(Connection conn) throws SQLException {
		
		return conn.prepareStatement("INSERT INTO person (name,old)VALUES(? , ? )");
	}

}
