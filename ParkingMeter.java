/*
Tiarna Wise
COSC 220
4/28/2019

ParkingMeter Class
The ParkingMeter Class: This class should simulate a parking meter. 
The class’s only responsibility is as follows: 
– To know the number of minutes of parking time that has been purchased.
*/

/**
ParkingMeter Class holds the values for everything concerning the parking meter
*/
public class ParkingMeter
{
/**
minutesPurchased is the purchased amount of minutes
*/
   private int minutesPurchased = 0;
/**
 mPu is minutesPurchased
 @param mPu minutes purchased
*/
public ParkingMeter(int mPu)
{
    this.minutesPurchased = mPu;
}
/**
ParkingMeter (ParkingMeter minutesP) holds the variables for the parking meter
@param minutesP minutes purchased
*/
public ParkingMeter(ParkingMeter minutesP)
{
   minutesPurchased = minutesP.minutesPurchased;
}
/**
setminutesPurchased sets the minutes purchased
@param mPu minutesPurchased
*/
public void setminutesPurchased(int mPu)
{
   this.minutesPurchased = mPu;
}
/**
getminutesPurchased get the minutes purchased
@return the minutes purchased
*/
public int getminutesPurchased()
{
   return minutesPurchased;
}
/**
   Holds the format of all info included
   toString method
   @return The string of all responses
*/
public String toString()
{
   String str = "\nMinutes Purchased: " + minutesPurchased;
   return str;
}
} 