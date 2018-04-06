package com.m8.main;

import java.sql.*;
import com.m8.DB.*;
import com.m8.DB.helper.*;

public class Main {

	public static void main(String[] args) {
		DBConnect con = null;
		Querys q = null;
		String mydb = "mysql";
		
		
		switch (mydb) {
		case "mysql":
			con = new DBMySQLConnection("root", "Lars_123", "localhost", "3306", "beispiel");
			q = new MysqlQuerys();
			break;
		}
		
		if(con != null){
			System.out.println("Die Verbindung geht");
		}
		
		try {
			PreparedStatement stmt = q.insetPerson(con.getConnection());
			stmt.setString(1, "Hans");
			stmt.setInt(2, 34);
			stmt.executeUpdate();
			System.out.println("Abfrage wird gestartet");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
