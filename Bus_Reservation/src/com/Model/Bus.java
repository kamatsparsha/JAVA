package com.Model;

import java.sql.Time;

public class Bus {
	
	 private int bus_id;
	 private String bus_name;
	 private String source;
	 private String destination;
	 private Time departure_time;
	 private Time arrival_time;
	 private int total_seats;
	 
	 public int getBus_id() {
		return bus_id;
	}
	public void setBus_id(int bus_id) {
		this.bus_id = bus_id;
	}
	public String getBus_name() {
		return bus_name;
	}
	public void setBus_name(String bus_name) {
		this.bus_name = bus_name;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Time getDeparture_time() {
		return departure_time;
	}
	public void setDeparture_time(Time departure_time) {
		this.departure_time = departure_time;
	}
	public Time getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(Time arrival_time) {
		this.arrival_time = arrival_time;
	}
	public int getTotal_seats() {
		return total_seats;
	}
	public void setTotal_seats(int total_seats) {
		this.total_seats = total_seats;
	}
	//
}
