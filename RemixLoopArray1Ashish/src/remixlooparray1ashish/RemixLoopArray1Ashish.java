/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remixlooparray1ashish;

/**
 *
 * @author Ashish
 */
import java.util.Scanner;

public class RemixLoopArray1Ashish {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Set up input from keyboard
        Scanner keyedInput = new Scanner(System.in);

        // Declare the numbers array and initialize the total variable
        int[] numbers = new int[20];
        int total = 0;

        // Print instructions to user and use the for loop to add the numbers entered by the user to an array
        System.out.println("Enter twenty integers and they will be added together:");
        for (int i = 0; i <= 19; i = i + 1) {
            numbers[i] = keyedInput.nextInt();
        }

        // Use a for loop to cycle through the array and get a total of the values in the area
        for (int i = 0; i <= 19; i = i + 1) {
            total = total + numbers[i];
        }

        // Print out total
        System.out.println("The sum of those numbers is:");
        System.out.println(total);
    }

}
