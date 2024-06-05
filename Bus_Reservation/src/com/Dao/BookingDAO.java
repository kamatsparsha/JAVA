package com.Dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.Model.Booking;
import com.Utility.*;

public class BookingDAO {
	public void addBooking(Booking booking) {
        String query = "INSERT INTO bookings (bus_id, passenger_id, booking_date, seats_booked) VALUES (?, ?, ?, ?)";
        try (Connection con = DbConnection.getConnection();
             PreparedStatement pstmt = con.prepareStatement(query)) {
            pstmt.setInt(1, booking.getBus_id());
            pstmt.setInt(2, booking.getPassenger_id());
            pstmt.setDate(3, booking.getBooking_date());
            pstmt.setInt(4, booking.getSeats_booked());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
