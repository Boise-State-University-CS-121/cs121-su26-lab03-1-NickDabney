/**
 * This program takes a radius input from the user and calculates the 
 * resulting spheres volume and surface area.
 * @author Nick Dabney
 */
import java.util.Scanner;

public class SphereCalculator
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);

        //Declares variables and prompts user for a radius
        double userRadius;
        double volume;
        double surfaceArea;

        System.out.print("Enter the sphere's radius: ");
        userRadius = scnr.nextDouble();

        //Performs calculations for volume and surfaceArea
        volume = (4.0/3) * Math.PI * Math.pow(userRadius, 3);
        surfaceArea = 4 * Math.PI * Math.pow(userRadius, 2);

        //Outputs volume and surface area with 4 decimals
        System.out.printf("Volume: %.4f\n", volume);
        System.out.printf("Surface area: %.4f\n", surfaceArea);

        scnr.close();
    }
}
