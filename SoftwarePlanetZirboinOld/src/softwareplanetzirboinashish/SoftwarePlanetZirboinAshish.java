/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareplanetzirboinashish;

import java.util.Scanner;

/**
 *
 * @author Ashish
 */
public class SoftwarePlanetZirboinAshish {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Prints stage number and sets up keyboard input
        System.out.println("---Stage 4---");
        Scanner keyedInput = new Scanner(System.in);

        // Declare variables
        String tempString = "";
        int amount = 0;
        boolean valid = false;
        int vrobit;
        int drobzit;
        int clickwick;
        int gazoontight;
        int frazoint;
        int blointoint;

        // Loop until the user enters valid input, 
        // If what the user enters matches the criteria, then continue with the conversion
        // If input was invalid, ask them to try again
        while (!valid) {
            System.out.println("Enter the amount of vrobits you have: ");
            tempString = keyedInput.nextLine();
            System.out.println("");
            try {
                amount = Integer.parseInt(tempString);
                if (amount < 0) {
                    throw new NumberFormatException();
                }

                drobzit = amount / 10000;
                
                
                
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Sorry, invalid number. Try again.");
            }
        }
    }
}
