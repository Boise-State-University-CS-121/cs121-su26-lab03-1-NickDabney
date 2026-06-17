/**
 * This program prompts and reads the users first and last name
 * using a scanner, then prints out a username using the first letter
 * of the first name and the first five of the last name followed by a 
 * random number between 10-99. The username is one word and all lowercase.
 * @author Nick Dabney
 */

import java.util.Scanner;

import java.util.Random;

public class AccountGenerator
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        Random rng = new Random();
        
        String firstName;
        String lastName;

        //Obtains user's first and last name
        System.out.print("Enter your first name: ");
        firstName = scnr.nextLine();
        System.out.print("Enter your last name: ");
        lastName = scnr.nextLine();

        //Changes case and generates number 10-99
        firstName = firstName.toLowerCase();
        lastName = lastName.toLowerCase();
        int suffix = rng.nextInt(90) + 10;

        System.out.printf("Username: %.1s%.5s" + suffix, firstName, lastName);

        scnr.close();
    }
}