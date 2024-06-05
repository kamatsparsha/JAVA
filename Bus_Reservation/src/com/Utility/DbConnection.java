package com.Utility;
import java.sql.*;

public class DbConnection {

	
		private static final String url="jdbc:mysql://localhost:3306/bus_booking_system";
		private static final String username="root";
		private static final String password="root";
		
	
		public static Connection getConnection() throws SQLException, ClassNotFoundException{
	        
				Class.forName("com.mysql.cj.jdbc.Driver");
	
				 return DriverManager.getConnection(url, username, password);     
	      	    }

}
