package org.project.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	public static Connection getConnection() {
		Connection conn= null;
		String driver="oracle.jdbc.driver.OracleDriver";
		String Url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String passward="1234";
		
		try {
			Class.forName(driver);
			System.out.println("Driver OK!!");
			conn=DriverManager.getConnection(Url, user, passward);
			System.out.println("DB Connect OK!!");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver NUll!!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB Connect Fail!!");
			e.printStackTrace();
		} finally {
			
		}
			
		return conn;
	}
	
}
