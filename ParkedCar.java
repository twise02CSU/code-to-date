/*
Tiarna Wise
COSC 220
4/29/2019

ParkedCar Class
The ParkedCar Class: This class should simulate a parked car. 
The class’s responsibilities are as follows: 
– To know the car’s make, model, color, license number, and the number of minutes that the car has been parked.
*/

public class ParkedCar
{
/**
 carMake The car's make
*/
   private String carMake;
 /**
  carModel The model of the car
*/
   private String carModel;
   /**
 carColor The color of the car
 */
   private String carColor;
/**
licenseNumber The car's license number
*/
   private String licenseNumber;
/**
minutesParked The car's amount of minutes parked
*/
   private int minutesParked;
   
/**
ParkedCar() The method for the parked car
*/
public ParkedCar()
{
carMake = "";
carModel = "";
carColor = "";
licenseNumber = "";
minutesParked = 0;
}
/**
ParkedCar(ParkedCar carP) holds the variables and assigns then to meanings
@param carP is the parked car method
*/
public ParkedCar(ParkedCar carP)
{
   carMake = carP.carMake;
   carModel = carP.carModel;
   carColor = carP.carColor;
   licenseNumber = carP.licenseNumber;
   minutesParked = carP.minutesParked;
}
/**
ParkedCar(String cMa, String cMo, String cC, String lN, int mPa)
@param cMa the method assigned to carMake
@param cMo the method assigned to carModel
@param cC the method assigned to carColor
@param lN the method assigned to licenseNumber
@param mPa the method assigned to minutesParked
*/
public ParkedCar(String cMa, String cMo, String cC, String lN, int mPa)
{
   carMake = cMa;
   carModel = cMo;
   carColor = cC;
   licenseNumber = lN;
   minutesParked = mPa;
}
/**
setcarMake sets the car make method
@param cMa carMake
*/
public void setcarMake(String cMa)
{
   carMake = cMa;
}
/**
setcarModel sets the car model method
@param cMo carModel
*/
public void setcarModel(String cMo)
{
   carModel = cMo;
}
/**
setcarColor sets the car color method
@param cC carColor
*/
public void setcarColor(String cC)
{
   carColor = cC;
}
/**
setlicenseNumber sets the license number method
@param lN licenseNumber
*/
public void setlicenseNumber(String lN)
{
   licenseNumber = lN;
}
/**
setminutesParked sets the minutes car parked method
@param mPa minutesParked
*/
public void setminutesParked(int mPa)
{
   minutesParked = mPa;
}
/**
getcarMake gets the make of the ar
@return the make of the car
*/
public String getcarMake()
{
   return carMake;
}
/**
getcarModel gets the model of the car
@return the model of the car
*/
public String getcarModel()
{
   return carModel;
}
/**
getcarColor gets the color of the car
@return the color of the car
*/
public String getcarColor()
{
   return carColor;
}
/**
getlicenseNumber gets the license number
@return the license number
*/
public String getlicenseNumber()
{
   return licenseNumber;
}
/**
getminutesParked get the minutes the car was parked
@return the minutes parked
*/
public int getminutesParked()
{
   return minutesParked;
}
/**
Holds the format of all info included
   toString method
   @return The string of all responses
*/
public String toString()
{
   String str = "\nCar Make: " + carMake + "\nCar Model: " + carModel + "\nCar Color: " + carColor + "\nLicense Number: " + licenseNumber + "\nMinutes parked: " + minutesParked;
    return str;
}
}