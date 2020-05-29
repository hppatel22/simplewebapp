package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	
	
	

	private static String userName ="xyevfhfkugxbod";
	private static String password ="a392768303160b63b0de474bc3738428df34411966de748925943d31f836a3c6";
	private static String connectionURL ="jdbc:postgresql://ec2-52-202-22-140.compute-1.amazonaws.com:5432/de9ou9b7s1juol?sslmode=require";
	private static String driverClass = "org.postgresql.Driver";
	public static Connection getDBConnection(){
		
		Connection conn = null;
		
		try {
			Class.forName(driverClass);
			
			conn = DriverManager.getConnection(connectionURL, userName, password);
			
			if(conn!=null)
			{
				
				System.out.println("connected to db..");
			}
			else{
				
				System.out.println("connected to db..");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return conn; 
		
		
	}
	
	
	public static void main(String[] args) {
		
		DBConnection.getDBConnection();
	}
	
}
