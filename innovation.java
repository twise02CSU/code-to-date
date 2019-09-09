/**Tiarna Wise
   COSC 220-001
   Dr. Hatley
5 February 2019 - 12 February 2019
   Innovation Code


 Program: This program interacts with the user on a friendly basis, while instructing them to pick a number from the list of continents 
 to display the innovation based on their selection.
 
 Instructions: The user should respond with their name then pick a number from the list of continents, 
 with that they will be read the name of the innovation, its description, and the url for more information.
 
 Variables: name and integer(number) continent.
 
• If the user picks number 1 they will be picking Africa(1) which will tell them about the innovation and a description of it, along with the url.
• If the user picks number 2 they will be picking Asia which will tell them about the innovation and a description of it, along with the url.
• If the user picks number 3 they will be picking Europe(1) which will tell them about the innovation and a description of it, along with the url.
• If the user picks number 4 they will be picking Africa(2) which will tell them about the innovation and a description of it, along with the url.
• If the user picks number 5 they will be picking Africa(3) which will tell them about the innovation and a decription of it, along with the url.
• If the user picks number 6 they will be picking Europe(2) which will tell them about the innovation and a description of it, along with the url.
*/

import java.util.Scanner;

public class innovation
{
   public static void main(String [] args)
   {
   
   String name;
   int continent;
   
           Scanner keyboard = new Scanner(System.in);
           
        // asks user for name and to choose a number/continent 
           
   System.out.print("Hello user, Welcome to my 1st program of 2019, to better assist you today, may I please have your name? ");
                  name = keyboard.nextLine();
   System.out.println(name + ", will you please pick a continent from the following menu (#): ");
   System.out.println("List Of Continents:");
            System.out.println("1. Africa(1)");
           System.out.println("2. Asia");
          System.out.println("3. Europe(1)");
         System.out.println("4. Africa(2)");
        System.out.println("5. Africa(3)");
       System.out.println("6. Europe(2)");
       
                  continent = keyboard.nextInt();  
                  
   if (continent == 1) // user chose #1
   {
   
           System.out.println(name + ", since you chose number 1, there is a new innovation in Africa, called Mamaope. ");
           System.out.println("Mamaope is the name of a biomedical smart jacket that would target pneumonia symptoms in ways of temperature, breathing rate, and the sound of the lungs." + '\n' + "The jacket is connected via mobile app and Bluetooth, so very easy and useful, regarding to the saving of records and files for the intended healthcare professional. " + '\n' + "Visit http://mamaope.com/#our_idea for more information.");
   
   }
   else if (continent == 2) // user chose #2
   {
   
           System.out.println(name + ", since you chose number 2, there is a new innovation in Asia, called Nike Pro Hijab. ");
           System.out.println("The Nike Pro Hijab is an innovation that is unlike a traditional hijab, the Pro is made with light, breathable fabric that wicks moisture;" + '\n' + "athletes who have used it report that it helps manage sweat. " + '\n' + "Visit http://time.com/5023212/best-inventions-of-2017/ for more information." );
   
   }        
   else if (continent == 3) //user chose #3
   {
   
           System.out.println(name + ", since you chose number 3, there is a new innovation in Europe, called Thyssenkrupp MULTI. ");
           System.out.println("This innovation, MULTI is a system of elevators that can travel not only up and down but also sideways." + '\n' + "MULTI is a rope-free system that redesigns how people get around and how buildings will be structured. " + '\n' + "Visit https://multi.thyssenkrupp-elevator.com/en/faq.php for more information." );
  
   }      
   else if (continent == 4) //user chose #4
   {
    
           System.out.println(name + ", since you chose number 4, there is a new innovation in Africa, called Mellowcabs. ");
           System.out.println("Mellowcabs is an innovation that carries an estimated 60% of the country's commuters, it is basically a multi billion rand pie." + '\n' + "They are the pedal-electric hybrid pedicabs, that have been modified to be roadworthy. " + '\n' + "Visit http://ventureburn.com/2013/08/mellowcabs-using-tech-to-disrupt-first-and-last-mile-transport-the-african-way/ for more information." );
  
   }      
   else if (continent == 5) //user chose #5
   {
        
           System.out.println(name + ", since you chose number 5, there is a new innovation in Africa, called Hippo Water Roller - A Drum. ");
           System.out.println("The Hippo Water - A Drum is a drum that can be rolled on the ground, making it easier for those without access to taps to haul larger amounts of water faster. " + '\n' + "Visit https://www.hipporoller.org/2012/08/the-gaurdian-uk-hippo-roller-the-first-of-15-african-innovations-to-transform-the-continent/ for more information.");  

   }
   else if (continent == 6) //user chose #6
   {
          
           System.out.println(name + ", since you chose number 6, there is a new inovation in Europe(Sweden), a balance mat. ");
           System.out.println("The mat has a game app for recovering patients, that experienced a stroke and it helps them exercise in the comfort of their own home. " + '\n' + "Visit https://www.euronews.com/2018/11/01/technology-to-help-stroke-survivors-recover for more information.");
  
   }
   else // user chose invalid response.
   {
   
           System.out.println("This is not a valid number. Try Again.");
           
   }
}
}