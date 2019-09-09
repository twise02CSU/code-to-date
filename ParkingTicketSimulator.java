/*
Tiarna Wise
COSC 220
4/29/2019

Parking Ticket Simulator

Write a program that demonstrates how these classes collaborate.
*/
import java.util.Scanner;
public class ParkingTicketSimulator
{
   public static void main(String[] args)
   {
      String carMake, carModel, carColor, licenseNumber, officerName;
       int badgeNumber;
    int minutesParked, minutesPurchased;
    
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("Enter the car make: ");
    carMake = keyboard.nextLine();
    
    System.out.print("Enter the car model: ");
    carModel = keyboard.nextLine();
    
    System.out.print("Enter the car color: ");
    carColor = keyboard.nextLine();
    
    System.out.print("Enter the car license: ");
    licenseNumber = keyboard.nextLine();
    
    System.out.print("Enter the number of minutes the car has been parked: ");
    minutesParked = keyboard.nextInt();
    
    System.out.print("Enter the number of minutes that have been purchased: ");
    minutesPurchased = keyboard.nextInt();
    
    keyboard.nextLine();
    
    System.out.println();
    
    System.out.print("Enter the Officer's name: ");
    officerName = keyboard.nextLine();
    
    System.out.print("Enter the Officer's badge number: ");
    badgeNumber = keyboard.nextInt();
    
    ParkedCar car = new ParkedCar(carMake,carModel,carColor,licenseNumber,minutesParked);
    ParkingMeter meter = new ParkingMeter (minutesPurchased);
    PoliceOfficer officer = new PoliceOfficer(officerName,badgeNumber,car,meter);
    
    System.out.println(officer.getPatrol(officer));
  }
}
