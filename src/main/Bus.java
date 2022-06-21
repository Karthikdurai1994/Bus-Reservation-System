package main;

public class Bus {
   private int busNo;
   private boolean airCondtioned;
   private int capacity;
   
   // Constructor
   Bus(int busNo, boolean airConditioned, int capacity){
	   this.busNo = busNo;
	   this.airCondtioned = airConditioned;
	   this.capacity = capacity;
   }
   
   // Creating getter and setter for Bus Instance variables because since we make it as private, it cannot be accessed directly
   // Getter methods
   public int getBusNo(){
	   return busNo;
   }
   
   public boolean getAirCond() {
	   return airCondtioned;
   }
   
   public int getBusCapacity() {
	   return capacity;
   }
   
   // Setter methods
   public void setBusCapacity(int capacity) {
	   this.capacity = capacity;
   }
   
   public void setBusAC(boolean busAC) {
	   airCondtioned = busAC;
   }
   
   // Displaying Bus Information
   public void displayBusInfo() {
	   System.out.println("Bus Number: "+busNo+" | "+"AC Bus: "+airCondtioned+" | "+"Bus Capacity: "+capacity);
   }
   
}
