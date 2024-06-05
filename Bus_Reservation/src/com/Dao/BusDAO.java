package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

import com.Model.Bus;
import com.Model.Passenger;
import com.Utility.DbConnection;
public class BusDAO {

	public List<Bus> getAllBuses() {
		
		List<Bus> buses = new ArrayList<>();
		String query = "SELECT * FROM buses";
		try(Connection con = DbConnection.getConnection() ;
			PreparedStatement p=con.prepareStatement(query);
					ResultSet rs = p.executeQuery(query)) {
			while (rs.next()) {
                Bus bus = new Bus();
                bus.setBus_id(rs.getInt("bus_id"));;
                bus.setBus_name(rs.getString("bus_name"));
                bus.setSource(rs.getString("source"));
                bus.setDestination(rs.getString("destination"));
                bus.setDeparture_time(rs.getTime("departure_time"));
                bus.setArrival_time(rs.getTime("arrival_time"));
                bus.setTotal_seats(rs.getInt("total_seats"));
                buses.add(bus);
            }	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
        return buses;
    }
	public void addBus(Bus bus)
	{
		String query = "INSERT INTO bu (name, email, phone) VALUES (?, ?, ?,?,?,?)";
		try(Connection con = DbConnection.getConnection() ; PreparedStatement p=con.prepareStatement(query)) {
			p.setString(1, bus.getBus_name());
			p.setString(2, bus.getSource());
			p.setString(3, bus.getDestination());
			p.setTime(4, bus.getDeparture_time());
			p.setTime(5, bus.getArrival_time());
			p.setInt(5, bus.getTotal_seats());
			p.executeUpdate();
			
		}
		catch(Exception e)
		{
			System.out.println("in passenger dao");
			e.printStackTrace();
		}
	}
	
}
