/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creatingforloopsashish;

/**
 *
 * @author Ashish
 */
import java.util.Scanner;

public class CreatingForLoopsAshish {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Sets up to sense keyed inputs frrom user
        Scanner keyedInput = new Scanner(System.in);

        //Initialize variable
        int choice = 0;

        //Print instructions to user
        System.out.println("---Cool Counting Program---");
        System.out.println("");

        System.out.println("Please enter your choice:");
        System.out.println("1...Count from 0 to 10 by 1");
        System.out.println("2...Count from 100 to 0 by 10");
        System.out.println("3...Count from 50 to 500 by 50");
        System.out.println("4...Count from 6000 to 1000 by 1000");
        System.out.println("Please enter your choice:");

        //Get input from user and set it to "choice"
        choice = keyedInput.nextInt();

        System.out.println("");
        System.out.println("----------------------------------------");

        // Depending on input from user, select that if or else if statement
        // In each if statement there is a for loop saying to from where to where and by how much - option was selected by user
        // The for loop prints out the number counting up or down
        if (choice == 1) {
            System.out.println("You have chosen to count from 0 to 10 by 1:");
            for (int i = 0; i <= 10; i = i + 1) {
                System.out.println(i);
            }
        } else if (choice == 2) {
            System.out.println("You have chosen to count from 100 to 0 by 10:");
            for (int i = 100; i >= 0; i = i - 10) {
                System.out.println(i);
            }
        } else if (choice == 3) {
            System.out.println("You have chosen to count from 50 to 500 by 50:");
            for (int i = 50; i <= 500; i = i + 50) {
                System.out.println(i);
            }
        } else if (choice == 4) {
            System.out.println("You have chosen to count from 6000 to 1000 by 1000:");
            for (int i = 6000; i >= 1000; i = i - 1000) {
                System.out.println(i);
            }
        } else {
            // If not one of the options above, tells user that they did not enter a valid number
            System.out.println("You have entered an invalid number.");
        }
    }

}
