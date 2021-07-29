/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstsubroutineashish;

/**
 *
 * @author Ashish
 */
import java.util.Scanner;

public class FirstSubroutineAshish {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Sets up to sense keyed inputs frrom user
        Scanner keyedInput = new Scanner(System.in);

        // Initialize variables
        int choice = 0;

        // Keeps looping back, except when the user enters the choice 5 to exit the program
        while (choice != 5) {
            // Declare some variables
            double radius = 0;
            double height = 0;
            double volume = 0;
            // Print instructions to user
            System.out.println("----------First Subroutine Program----------");
            System.out.println("");
            System.out.println("Please enter your one of the following numbers:");
            System.out.println("1… Find the volume of a cylinder");
            System.out.println("2… Find the volume of a sphere");
            System.out.println("3… Find the slope of the line using two points");
            System.out.println("4… Find the average of numbers");
            System.out.println("5… Exit");
            System.out.println("Please enter your choice:");

            // Get input from user and set it to "choice"
            choice = keyedInput.nextInt();

            System.out.println("");
            System.out.println("----------------------------------------");

            // Depending on input from user, select that case
            switch (choice) {
                case 1:
                    // Get the radius and height from user
                    System.out.println("You have chosen to find the volume of a cylinder:");
                    System.out.println("Please enter the radius and height:");
                    radius = keyedInput.nextDouble();
                    height = keyedInput.nextDouble();

                    // Send the 2 variables to the method for calculations, and what it returns will equal "volume"
                    volume = volumeOfCylinder(radius, height);

                    // Print out answer to user
                    System.out.println("The volume of the cylinder is: " + volume + ".");
                    break;
                case 2:
                    // Get the radius from user
                    System.out.println("You have chosen to find the volume of a sphere:");
                    System.out.println("Please enter the radius:");
                    radius = keyedInput.nextDouble();

                    // Send the variable to the method for calculations, and what it returns will equal "volume"
                    volume = volumeOfSphere(radius);

                    // Print out answer to user
                    System.out.println("The volume of the sphere is: " + volume + ".");
                    break;
                case 3:
                    // Get the 2 coordinates from user
                    System.out.println("You have chosen to find the slope of the line using two points:");
                    System.out.println("Please enter the two points in this order: x1 y1 x2 y2");
                    double xOne = keyedInput.nextDouble();
                    double yOne = keyedInput.nextDouble();
                    double xTwo = keyedInput.nextDouble();
                    double yTwo = keyedInput.nextDouble();

                    // Send the variables to the method for calculations, and what it returns will equal "slopeLine"
                    double slopeLine = slopeOfLine(xOne, yOne, xTwo, yTwo);

                    // Print out answer to user
                    System.out.println("The slope of the line is: " + slopeLine + ".");
                    break;
                case 4:
                    // Get the amount of numbers to be averaged from the user
                    System.out.println("Please enter how many numbers to be averaged:");
                    int amountOfNumbers = keyedInput.nextInt();

                    // Send the the amount of numbers to the the method, and what it returns will equal "volume"
                    double average = averageOfNumbers(amountOfNumbers);

                    // Print out answer to user
                    System.out.println("The average is: " + average + ".");
                    break;
                case 5:
                    // It will print out a quitting message, and then cause the while loop to stop
                    System.out.println("You have chosen to exit the program. Thank you.");
                    break;
                default:
                    // If not one of the options above, tells user that they did not enter a valid number
                    System.out.println("You have entered an invalid number.");
                    break;
            }
        }
    }

    /* 
        volumeOfCylinder
    
        This method recieves the radius and height of a cylinder and outputs 
        the volume of the cylinder in a user friendly message.
    
        Parameters: double, double
    
        Returns: double
    
     */
    public static double volumeOfCylinder(double r, double h) {
        double v = Math.PI * Math.pow(r, 2) * h;
        v = (double) Math.round(v * 100) / 100;
        return v;
    }

    /* 
        volumeOfSphere
    
        This method recieves the radius of a sphere and outputs 
        the volume of the sphere in a user friendly message.
    
        Parameters: double
    
        Returns: double
    
     */
    public static double volumeOfSphere(double r) {
        double v = 4.0 / 3.0 * Math.PI * Math.pow(r, 3);
        v = (double) Math.round(v * 100) / 100;
        return v;
    }

    /* 
        slopeOfLine
    
        This method recieves the x and y positions of 2 coordinates and outputs
        the slope of the line in a user friendly message.
    
        Parameters: double, double, double, double
    
        Returns: double
    
     */
    public static double slopeOfLine(double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1);
        slope = (double) Math.round(slope * 100) / 100;
        return slope;
    }

    /* 
        averageOfNumbers
    
        This method recieves the the amount of numbers to average, asks the 
        user to enter their numbers to average through a for loop, and outputs 
        the average in a user friendly message.
    
        Parameters: int
    
        Returns: double
    
     */
    public static double averageOfNumbers(int n) {
        Scanner keyedInput = new Scanner(System.in);

        double total = 0;
        double[] values = new double[n];

        System.out.println("Please enter your values:");
        for (int i = 0; i < n; i = i + 1) {
            values[i] = keyedInput.nextDouble();
            total = total + values[i];
        }
        double a = (double) Math.round((total / n) * 100) / 100;
        return a;
    }
}
