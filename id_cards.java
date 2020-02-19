/*
Name: Ricky Long           Date Assigned: 11/11/19

Course: CSCI 2000 43078    Date Due:      11/18/19

Instructor: Ms. Greer

File Name: id_cards.java

Program Description: Creates school ID cards and asks 
   the user for their first and las name, CWID, and status.
   Then it will display a message to the user about their 
   card. Finally, it dislays the card with a box where their
   picture will go.
*/

import java.util.Scanner;

public class id_cards
{
   public static void main(String[] args)
   {
   
   //Print statements to help with formatting the title and instructions.
   System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
   System.out.println("               ID CARD CREATOR             ");
   System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
   
   System.out.println("    +---------------------------------+");
   System.out.println("    |            INSTRUCTIONS         |");
   System.out.println("    +---------------------------------+");
   System.out.println("    | Enter your information below to |");
   System.out.println("    | create your ID card.            |");
   System.out.println("    +---------------------------------+\n");
   
   //Declare scanner object
   Scanner input = new Scanner(System.in);
     
   
   //ask user for their name
   System.out.print("Enter your first and last name: ");
   
   
   //use scanner object to get name, store it in variable
   String name = input.nextLine();
   
   
   //ask user for CWID
   System.out.print("Enter your CWID (########) : ");
   
   
   //use scanner object to get CWID, store it in variable
   int cwid = input.nextInt();
   input.nextLine(); 
   
   
   //ask user for their name
   System.out.print("Status: ");
   
   
   //use scanner object to get name, store it in variable
   String status = input.nextLine();
      
      
   //ID creation announcement using print statements
   System.out.println("\n    +---------------------------------+");
   System.out.println("    |            ID CREATION          |");
   System.out.println("    +---------------------------------+");
   System.out.println("    | Your card is now being printed  |");
   System.out.println("    | in the format below. Your photo |");
   System.out.println("    | will be added to the card from  |");
   System.out.println("    | our records.                    |");
   System.out.println("    +---------------------------------+\n");
   
   
   //Creating photo here and output area
   System.out.println("===========================================\n");
   System.out.println(" +---------+");
   System.out.println(" | INSERT  |    Name:  "+name);
   System.out.println(" |         |");
   System.out.println(" | PHOTO   |    CWID:   "+cwid);
   System.out.println(" |         |");
   System.out.println(" | HERE    |    Status: "+status);
   System.out.println(" +---------+\n");
   System.out.println("===========================================");
   
   
   }
}

