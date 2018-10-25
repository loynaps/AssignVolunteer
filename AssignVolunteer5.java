
/*
CH6  Loops
6.12 Writing a Loop to Validate Data Entries

Program:AssignVolunteer5.java
Description:AssignVolunteer5 application for Sacks Fifth Avenue, a nonprofit thrift shop. 
The application accepts a donation code and assigns the appropriate volunteer to price the item for sale. 
Now, you add a loop to ensure that a valid code always is entered.
*/

import java.util.Scanner;

public class AssignVolunteer5 {
    public static void main(String[] args) {
        int donationType;
        String volunteer, message;
        final int CLOTHING_CODE = 1;
        final int FURNITURE_CODE = 2;
        final int ELECTRONICS_CODE = 3;
        final int OTHER_CODE = 4;
        final String CLOTHING_PRICER = "Regina";
        final String OTHER_PRICER = "Marco";
        final String FURNITURE_PRICER = "Walter";
        final String ELECTRONICS_PRICER = "Lydia";

        // Define the input device
        Scanner input = new Scanner(System.in);
        // a simpler statement that prompts the user to enter a for the donation type.
        System.out.println("What type of donation is this?");
        System.out.print("Enter an integer... ");
        donationType = input.nextInt();

        while (donationType < CLOTHING_CODE || donationType > OTHER_CODE) {
            System.out.println("You entered " + donationType + " which is not a valid donation type");
            System.out.print("Please enter a value between " + CLOTHING_CODE + " and " + OTHER_CODE + "... ");
            System.out.print("Enter an integer... ");
            donationType = input.nextInt();
        }
        // switch statement
        switch (donationType) {
        case (CLOTHING_CODE):
            volunteer = CLOTHING_PRICER;
            message = "a clothing donation";
            break;
        case (FURNITURE_CODE):
            volunteer = FURNITURE_PRICER;
            message = "a furniture donation";
            break;
        case (ELECTRONICS_CODE):
            volunteer = ELECTRONICS_PRICER;
            message = "an electronics donation";
            break;
        case (OTHER_CODE):
            volunteer = OTHER_PRICER;
            message = "another donation type";
            break;
        default:
            volunteer = "invalid";
            message = "an invalid donation type";
        }

        // Display the chosen code and corresponding volunteer’s name
        System.out.println("You entered " + donationType);
        System.out.println("This is " + message);
        System.out.println("The volunteer who will price this item is " + volunteer);
    }
}
