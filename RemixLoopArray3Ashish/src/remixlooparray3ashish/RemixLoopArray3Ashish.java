/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remixlooparray3ashish;

/**
 *
 * @author Ashish
 */
import java.util.Scanner;

public class RemixLoopArray3Ashish {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Set up input from keyboard
        Scanner keyedInput = new Scanner(System.in);

        // Declare marks array with values, and initialize variables
        double[] marks = {34.7, 54.1, 34.8, 99.6, 43.6, 43.2, 65.8, 44.8, 88.6};
        double total = 0;
        double average;

        // Use a for loop to print out the marks (values in the array)
        System.out.println("These are the marks:");
        for (int i = 0; i <= (marks.length-1); i = i + 1) {
            System.out.println(marks[i]);
        }

        // Use a for loop to cycle through the array and get a total of the values in the area
        for (int i = 0; i <= (marks.length-1); i = i + 1) {
            total = total + marks[i];
        }

        // Calculate the average of the marks
        average = total / marks.length;

        // Round the average to 1 decimal place
        average = average * 10;
        average = Math.round(average);
        average = average / 10;

        // Print out average mark to user
        System.out.println("The average mark is:");
        System.out.println(average);
    }

}
