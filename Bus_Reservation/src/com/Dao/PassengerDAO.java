package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.Model.Passenger;
import com.Utility.DbConnection;

public class PassengerDAO {
	public void addPassenger(Passenger passenger)
	{
		String query = "INSERT INTO passengers (name, email, phone) VALUES (?, ?, ?)";
		try(Connection con = DbConnection.getConnection() ; PreparedStatement p=con.prepareStatement(query)) {
			p.setString(1,passenger.getName());
			p.setString(3,passenger.getEmail());
			p.setString(2,passenger.getPhone());
			p.executeUpdate();
			
		}
		catch(Exception e)
		{
			System.out.println("in passenger dao");
			e.printStackTrace();
		}
	}
}
