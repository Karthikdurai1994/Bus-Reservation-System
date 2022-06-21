package main;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking {
  String passengerName;
  int busNo;
  Date journeyDate;
  
  // Constructor
  Booking(){
	  Scanner inp = new Scanner(System.in);
	  System.out.println("Enter your name");
	  passengerName = inp.nextLine();
	  System.out.println("Enter Bus No");
	  busNo = inp.nextInt();
	  System.out.println("Enter Journey Date dd/mm/yyyy");
	  inp.nextLine(); // to read "enter key" we press after entering bus no to avoid errors
	  String journeyDateTemp = inp.nextLine(); // we cannot store date directly, so we are storing it in a string and converting string to date
	 
	  // Using SimpleDateFormat class to convert string to date
	  SimpleDateFormat dateFormatObj = new SimpleDateFormat("dd/MM/yyyy");
	  try {
		journeyDate = dateFormatObj.parse(journeyDateTemp);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  
  }
  
  // isAvailable method will get bus capacity from bus class and bookings count of that bus on journey date from Bookings class.
  public boolean isAvailable(ArrayList<Bus> buses, ArrayList<Booking> bookings) {
	    int i,busCapacity = 0,count=0;
	    for(i=0;i<buses.size();i++) {
	    	if(buses.get(i).getBusNo() == this.busNo) { // this.busNo denotes current object's bus number
	    		busCapacity = buses.get(i).getBusCapacity();
	    	}
	    }
	    for(i=0;i<bookings.size();i++) {
	    	
	    	if(bookings.get(i).busNo == this.busNo && bookings.get(i).journeyDate.equals(this.journeyDate) ) { // this.busNo denoted current object's bus number and this.jouenyDate denotes current object's journey date
	    		++count;	
	    	}
	    }
	    
	    return count<busCapacity?true:false;
  }
 
}
