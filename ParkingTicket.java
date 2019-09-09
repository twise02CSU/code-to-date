/*
Tiarna Wise
COSC 220
4/29/2019

ParkingTicket Class

The ParkingTicket Class: This class should simulate a parking ticket. 
The class’s responsibilities are as follows: 
– To report the make, model, color, and license number of the illegally parked car 
– To report the amount of the fine, which is $25 for the first hour or part of an hour that the car is illegally parked, plus $10 for every additional hour or part of an hour that the car is illegally parked 
– To report the name and badge number of the police officer issuing the ticket
*/

public class ParkingTicket
{
/**
 car calls for the info on the car
*/
   private ParkedCar car;
/**
 officer calls for the info on the officer
*/
   private PoliceOfficer officer;
/**
 meter calls for the info on the parking meter
*/
   private ParkingMeter meter;
/**
 fineFees takes points of the fees along with the fines
*/
   private int fineFees;
/**
Constructor ParkingTicket(PoliceOfficer officer) calls for the parking ticket and officer info
@param officer gets info on officer
*/  
  public ParkingTicket(PoliceOfficer officer)
  {
     this.officer = new PoliceOfficer(officer);
     this.meter = officer.getMeter();
     this.car = officer.getParkedCar();
  }
/**
Constructor ParkingTicket() calls the parking ticket
*/
  public ParkingTicket()
  {
  }
/**
Constructor fineFees() holds the fees of the fine
@return fineFees 
*/
 public int fineFees()
 {
    int ticketTime;
    
    if(car != null || meter != null)
    {
    ticketTime = car.getminutesParked() - meter.getminutesPurchased() - 1;
    fineFees = 25;
    while (ticketTime > 0){
      ticketTime = ticketTime - 1;
      fineFees = fineFees + 10;
    }
    }
    return fineFees;
  }
/**
   Holds the format of all info included
   toString method
   @return The string of all responses
*/
  public String toString(){
    if (fineFees() == 0 )
    {
      String str = "No ticket issued.";
       return str;
    }
    else
    {
    String str = "\n" + officer +"\nTime over: "  + (car.getminutesParked() - meter.getminutesPurchased()) + "\nThe fee is $" + fineFees();
    return str;
  }
  }
}