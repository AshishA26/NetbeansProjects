/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubessquarespowersashish;

/**
 *
 * @author Ashish
 */
import java.util.Scanner;

public class CubesSquaresPowersAshish {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Sets up to sense keyed inputs frrom user
        Scanner keyedInput = new Scanner(System.in);

        // Initialize variables
        int choice = 0;
        int number = 0;
        int exponent = 0;
        int answer = 1;

        // Keeps looping back, except when the user enters the choice 4 to exit the program
        while (choice != 4) {
            // Print instructions to user
            System.out.println("---Cubes, Squares, and Powers Program---");
            System.out.println("");

            System.out.println("Please enter your one of the following numbers:");
            System.out.println("1… Find the value of a number squared (NOTE: 2^2 = 2 x 2)");
            System.out.println("2… Find the value of a number cubed (NOTE: 2^3 = 2 x 2 x 2)");
            System.out.println("3… Find the value of a number, to any power");
            System.out.println("4… Exit");
            System.out.println("Please enter your choice:");

            // Get input from user and set it to "choice"
            choice = keyedInput.nextInt();

            System.out.println("");
            System.out.println("----------------------------------------");

            // Depending on input from user, select that case
            switch (choice) {
                case 1:
                    // Gets number from user to be squared
                    System.out.println("You have chosen to find the value of a number squared:");
                    System.out.println("Please enter the number to be squared:");
                    number = keyedInput.nextInt();

                    // Sets answer to 1 (to reset it), and exponent to 2 (for the squared)
                    answer = 1;
                    exponent = 2;

                    // Does the math - gets looped for as long as the exponent is
                    // In each loop, it multiplies the final answer by the number entered
                    for (int i = 1; i <= exponent; i = i + 1) {
                        answer = answer * number;
                    }

                    // Prints out final answer
                    System.out.println("Your answer is: " + answer);
                    break;
                case 2:
                    // Gets number from user to be cubed
                    System.out.println("You have chosen to find the value of a number cubed:");
                    System.out.println("Please enter the number to be cubed:");
                    number = keyedInput.nextInt();

                    // Sets answer to 1 (to reset it), and exponent to 3 (for the cubed)
                    answer = 1;
                    exponent = 3;

                    // Does the math - gets looped for as long as the exponent is
                    // In each loop, it multiplies the final answer by the number entered                    
                    for (int i = 1; i <= exponent; i = i + 1) {
                        answer = answer * number;
                    }

                    // Prints out final answer
                    System.out.println("Your answer is: " + answer);
                    break;
                case 3:
                    // Gets number from user
                    System.out.println("You have chosen to find the value of a number, to any power:");
                    System.out.println("Please enter the number:");
                    number = keyedInput.nextInt();

                    // Gets the exponent from the user
                    System.out.println("Please enter the power:");
                    exponent = keyedInput.nextInt();

                    // Sets answer to 1 (to reset it)
                    answer = 1;

                    // Does the math - gets looped for as long as the exponent is
                    // In each loop, it multiplies the final answer by the number entered 
                    for (int i = 1; i <= exponent; i = i + 1) {
                        answer = answer * number;
                    }

                    // Prints out final answer
                    System.out.println("Your answer is: " + answer);
                    break;
                case 4:
                    System.out.println("You have chosen to exit the program. Thank you.");
                    break;
                default:
                    // If not one of the options above, tells user that they did not enter a valid number
                    System.out.println("You have entered an invalid number.");
                    break;
            }
        }
    }
}
