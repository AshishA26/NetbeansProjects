/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remixlooparray2ashish;

/**
 *
 * @author Ashish
 */
import java.util.Scanner;

public class RemixLoopArray2Ashish {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Set up input from keyboard
        Scanner keyedInput = new Scanner(System.in);

        // Declares friends array as a array with strings
        String[] friends = new String[5];

        // Prints out instructions to user and =use the for loop to add the friends names entered by the user to an array
        System.out.println("Enter the names of five friends:");
        for (int i = 0; i <= 4; i = i + 1) {
            friends[i] = keyedInput.nextLine();
        }

        // Prints out the second, third, and fourth names in the array
        System.out.println("The second, third, and fourth names listed were:");
        System.out.println("Second: " + friends[1]);
        System.out.println("Third: " + friends[2]);
        System.out.println("Fourth: " + friends[3]);
    }

}
