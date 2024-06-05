
import java.sql.Date;
import java.sql.Time;
import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;

import com.Model.*;
import com.Utility.*;
import com.Dao.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BusDAO busDAO = new BusDAO();
        PassengerDAO passengerDAO = new PassengerDAO();
        BookingDAO bookingDAO = new BookingDAO();
        Scanner scanner = new Scanner(System.in);
        int choice;
        while(true)
        {
        	System.out.println("\nMenu: \n 1.View Bus \n 2. Add Passenger \n3.Book Tickets \n 4. Add Buss \n 5.Exit");
        	System.out.println("Choose the option");
        	choice = scanner.nextInt();
        	if(choice == 5)
        	{
        		break;
        	}
        	switch(choice)
        	{
        	case 1:  // Display all buses
	                List<Bus> buses = busDAO.getAllBuses();
	                System.out.println("Available Buses:");
	                for (Bus bus : buses) {
	                    System.out.println(bus.getBus_id() + " - " + bus.getBus_id() + " (" + bus.getSource() + " to " + bus.getDestination() + ")");
	                }
	                System.out.println("\n");
        			break;
        			
        	case 2:
        		  // Add new passenger
	                Passenger passenger = new Passenger();
	                System.out.println("Enter your name:");
	                passenger.setName(scanner.nextLine());
	                System.out.println("Enter your email:");
	                passenger.setEmail(scanner.nextLine());
	                System.out.println("Enter your phone number:");
	                passenger.setPhone(scanner.nextLine());
	                passengerDAO.addPassenger(passenger);
        			System.out.println("Passenger added");
        			System.out.println("\n");
					break;	
					
        	case 3:
        		  // Book a ticket
                Booking booking = new Booking();
                Passenger passenger1 = new Passenger();
                System.out.println("Enter bus ID to book:");
                booking.setBus_id(scanner.nextInt());
                booking.setPassenger_id(passenger1.getPassenger_id());
                booking.setBooking_date(new Date(System.currentTimeMillis()));
                System.out.println("Enter number of seats to book:");
                booking.setSeats_booked(scanner.nextInt());
                bookingDAO.addBooking(booking);

                System.out.println("Booking Successful!");
                System.out.println("\n");
                break;
                
        	case 4:
        			Bus bus= new Bus();
        		 	System.out.println("Enter your Bus name:");
        		 	bus.setBus_name(scanner.nextLine());
        		 	System.out.println("Enter your Bus Source:");
        		 	bus.setSource(scanner.nextLine());
        		 	System.out.println("Enter your Bus Destination:");
        		 	bus.setDestination(scanner.nextLine());
        		 	System.out.println("Enter your Bus Departure Time:");
        	        Time departureTime = Time.valueOf(scanner.nextLine());
        	        bus.setDeparture_time(departureTime);
        		 	System.out.println("Enter your Bus Arrival Time:");
        		 	Time ArrivalTime = Time.valueOf(scanner.nextLine());
        		 	bus.setArrival_time(ArrivalTime);
        		 	System.out.println("Enter your Bus Total Seats:");
        		 	bus.setTotal_seats(scanner.nextInt());
        		 	busDAO.addBus(bus);
        			break;
        	}
        	
        }
       
      

      
	}

}
