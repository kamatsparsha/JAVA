package com.Model;

import java.sql.Date;

public class Booking {
	private int booking_id;
	private int bus_id;
	private int passenger_id;
	private Date booking_date;
	private int seats_booked;
	
	public int getBooking_id() {
		return booking_id;
	}
	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}
	public int getBus_id() {
		return bus_id;
	}
	public void setBus_id(int bus_id) {
		this.bus_id = bus_id;
	}
	public int getPassenger_id() {
		return passenger_id;
	}
	public void setPassenger_id(int passenger_id) {
		this.passenger_id = passenger_id;
	}
	public Date getBooking_date() {
		return booking_date;
	}
	public void setBooking_date(Date booking_date) {
		this.booking_date = booking_date;
	}
	public int getSeats_booked() {
		return seats_booked;
	}
	public void setSeats_booked(int seats_booked) {
		this.seats_booked = seats_booked;
	}
	
	
}
