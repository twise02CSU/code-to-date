/*
Tiarna Wise
COSC 220
4/29/2019

PoliceOfficer Class

The PoliceOfficer Class: This class should simulate a police officer inspecting parked cars. 
The class’s responsibilities are as follows: 
– To know the police officer’s name and badge number 
– To examine a ParkedCar object and a ParkingMeter object, and determine whether the car’s time has expired 
– To issue a parking ticket (generate a ParkingTicket object) if the car’s time has expired
*/

/**
Holds every officer info
*/
public class PoliceOfficer
{
/**
 officerName holds officer name
*/
   private String officerName;
/**
 badgeNumber holds officer badge number 
*/
   private int badgeNumber;
/**
 car calls parkedcar
*/
   private ParkedCar car;
/**
 meter calls parkingmeter 
*/
   private ParkingMeter meter;
/**
 ticket calls parkingticket
*/
   private ParkingTicket ticket;
/**
PoliceOfficer(String oNa, int bNu, ParkedCar carP, ParkingMeter meterT)
@param oNa officer's name
@param bNu officer's badge number 
@param carP parked car
@param meterT parking meter
*/
   public PoliceOfficer(String oNa, int bNu, ParkedCar carP, ParkingMeter meterT)
   {
      this.officerName = oNa;
      this.badgeNumber = bNu;
      car = new ParkedCar(carP);
      meter = new ParkingMeter(meterT);
   }
/**
PoliceOfficer(PoliceOfficer officerInfo) calls the officer's info
@param officerInfo the officer's info
*/
   public PoliceOfficer(PoliceOfficer officerInfo)
   {
      officerName = officerInfo.officerName;
      badgeNumber = officerInfo.badgeNumber;
      car = officerInfo.car;
      meter = officerInfo.meter;
   }
/**
setofficerName sets the officer's name
@param oNa officerName
*/
   public void setofficerName(String oNa)
   {
      this.officerName = oNa;
   }
/**
setbadgeNumber sets the officer's badge number
@param bNu badgeNumber
*/   
   public void setbadgeNumber(int bNu)
   {
      this.badgeNumber = bNu;
   }
/**
getofficerName takes officers name
@return officerName
*/   
   public String getofficerName()
   {
      return officerName;
   }
/**
getbadgeNumber officer's badge number
@return badgeNumber 
*/   
   public int getbadgeNumber()
   {
      return badgeNumber;
   }
/**
getParkedMeter get the parked car
@return new car
*/   
   public ParkedCar getParkedCar()
   {
      return new ParkedCar(car);
   }
/**
getMeter gets the parking meter
@return new meter
*/   
   public ParkingMeter getMeter()
   {
      return new ParkingMeter(meter);
   }
/**
Constructor PakringTicket getPatrol(PoliceOfficer officer)
@param officer This is the officer
@return ticket The parking ticket
*/      
   public ParkingTicket getPatrol(PoliceOfficer officer)
   {
      if(meter.getminutesPurchased() - car.getminutesParked() < 0)
      {
         ticket = new ParkingTicket(officer);
         return ticket;
      }
      else
      {
      ticket = new ParkingTicket();
      return ticket;
      }
   }
/**
   Holds the format of all info included
   toString method
   @return The string of all responses
*/
      public String toString()
      {
         String str = "\nOfficer's Name: " + officerName + "\nOfficer's Badge Number: " + badgeNumber + "\nCar Info: " + car + "\nMeter info: " +  meter;
         return str;
      }
}