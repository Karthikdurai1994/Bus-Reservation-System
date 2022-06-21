package main;
import java.util.Scanner;
import java.util.ArrayList;

public class BusMain {
   public static void main(String[] args) {
	   Scanner inp1 = new Scanner(System.in);
	   int i;
	   
	   // Creating Bus ArrayList to store the bus details [bus objects]
	   ArrayList<Bus> buses = new ArrayList<>();
	   // Creating Booking ArrayList to store booking details [booking objects]
	   ArrayList<Booking> bookings = new ArrayList<Booking>();
	   buses.add(new Bus(1,true, 1));
	   buses.add(new Bus(23,true, 50));
	   buses.add(new Bus(4,false, 70));
	   // Looping Bus Arraylist and printing Bus Details
	   for(i=0;i<buses.size();i++) {
		   buses.get(i).displayBusInfo(); // getting the individual bus object from ArrayList and calling displayBusInfo method
	   }
	   // userOption variable is used to store whether user selected to book bus or not
	   int userOption = 1;
	   while(userOption==1) {
		   
		   System.out.println("Enter 1 for booking or 2 to exit application");
		   
		   userOption = inp1.nextInt();
		   
		   if(userOption == 1) {
		         Booking bookingObj = new Booking();
		         if(bookingObj.isAvailable(buses, bookings)) {
		        	 System.out.println("Your Booking is confirmed. Thank You!");
		        	 bookings.add(bookingObj);
		        	
		         }
		         else {
		        	 System.out.println("Sorry Bus if full. Try another bus or other dates");
		         }
		   }
		  
		  
	   }
	  
   }
   
}
