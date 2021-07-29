/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datavalidationashish;

/**
 *
 * @author Ashish
 */
import java.util.Scanner;

public class DataValidationAshish {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Start stage 1
        stage1();
    }

    /* 
        printStageEnd
    
        This method recieves the value the user entered and the stage, and 
        tells the user if the stage has been completed or outputs a 
        congratulatory message if the user completed the program.
    
        Parameters: String, int
    
        Returns: void
    
     */
    public static void printStageEnd(String value, int stage) {
        // Prints the value recieved
        System.out.println(value + " is valid input.");
        // If not less than stage 6, then say the stage number and move on to next stage
        // Else print a congralutory message and complete the program
        if (stage < 6) {
            System.out.println("Stage " + stage + " done. Let's continue with the rest of the program.");
            System.out.println("...");
            System.out.println("");
        } else {
            System.out.println("Stage " + stage + " done.");
            System.out.println("Congratulations! You completed the program and all 6 stages!");
        }
    }

    /* 
        stage1
    
        This method asks the user to enter valid input according to what is 
        printed on the screen. If the user enters valid data, the user moves
        onto the next stage, if not the user is asked the same question again.
    
        Parameters: N/A
    
        Returns: void
    
     */
    public static void stage1() {
        // Prints stage number and sets up keyboard input
        System.out.println("---Stage 1---");
        Scanner keyedInput = new Scanner(System.in);

        // Declare variables
        String tempString = "";
        boolean valid = false;

        // Loop until the user enters valid input, 
        // If what the user enters matches the criteria, then stop looping
        // Else say that the input was invalid and ask them to try again
        while (valid == false) {
            System.out.println("Enter an string that is greater than 6 characters long: ");
            tempString = keyedInput.nextLine();
            System.out.println("");
            if (tempString.length() > 6) {
                valid = true;
            } else {
                System.out.println("Sorry, your input was invalid. Try again.");
            }
        }
        // Print the message and move on to the next stage
        printStageEnd(tempString, 1);
        stage2();
    }

    /* 
        stage2
    
        This method asks the user to enter valid input according to what is 
        printed on the screen. If the user enters valid data, the user moves
        onto the next stage, if not the user is asked the same question again.
    
        Parameters: N/A
    
        Returns: void
    
     */
    public static void stage2() {
        // Prints stage number and sets up keyboard input
        System.out.println("---Stage 2---");
        Scanner keyedInput = new Scanner(System.in);

        // Declare variables
        String tempString = "";
        boolean valid = false;

        // Loop until the user enters valid input, 
        // If what the user enters matches the criteria, then stop looping
        // Else say that the input was invalid and ask them to try again
        while (valid == false) {
            System.out.println("Enter an string that contains at least one lowercase “a”: ");
            tempString = keyedInput.nextLine();
            System.out.println("");
            if (tempString.contains("a")) {
                valid = true;
            } else {
                System.out.println("Sorry, your input was invalid. Try again.");
            }
        }
        // Print the message and move on to the next stage
        printStageEnd(tempString, 2);
        stage3();
    }

    /* 
        stage3
    
        This method asks the user to enter valid input according to what is 
        printed on the screen. If the user enters valid data, the user moves
        onto the next stage, if not the user is asked the same question again.
    
        Parameters: N/A
    
        Returns: void
    
     */
    public static void stage3() {
        // Prints stage number and sets up keyboard input
        System.out.println("---Stage 3---");
        Scanner keyedInput = new Scanner(System.in);

        // Declare variables
        String tempString = "";
        boolean valid = false;

        // Loop until the user enters valid input, 
        // If what the user enters matches the criteria, then stop looping
        // Else say that the input was invalid and ask them to try again
        while (valid == false) {
            System.out.println("Enter an string that is between 5 and 15 characters long,and does not contain the letter “z”: ");
            tempString = keyedInput.nextLine();
            System.out.println("");
            if (tempString.length() >= 5 && tempString.length() <= 15 && !tempString.contains("z")) {
                valid = true;
            } else {
                System.out.println("Sorry, your input was invalid. Try again.");
            }
        }
        // Print the message and move on to the next stage
        printStageEnd(tempString, 3);
        stage4();
    }

    /* 
        stage4
    
        This method asks the user to enter valid input according to what is 
        printed on the screen. If the user enters valid data, the user moves
        onto the next stage, if not the user is asked the same question again.
    
        Parameters: N/A
    
        Returns: void
    
     */
    public static void stage4() {
        // Prints stage number and sets up keyboard input
        System.out.println("---Stage 4---");
        Scanner keyedInput = new Scanner(System.in);

        // Declare variables
        String tempString = "";
        int value = 0;
        boolean valid = false;

        // Loop until the user enters valid input, 
        // If what the user enters matches the criteria, then stop looping
        // Else say that the input was invalid and ask them to try again
        while (valid == false) {
            System.out.println("Enter an integer between 5 and 500: ");
            tempString = keyedInput.nextLine();
            System.out.println("");
            try {
                value = Integer.parseInt(tempString);
                if (value >= 5 && value <= 500) {
                    valid = true;
                } else {
                    System.out.println("Sorry, your input was invalid. Try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Sorry, your input was invalid. Try again.");
            }
        }
        // Print the message and move on to the next stage
        printStageEnd(tempString, 4);
        stage5();
    }

    /* 
        stage5
    
        This method asks the user to enter valid input according to what is 
        printed on the screen. If the user enters valid data, the user moves
        onto the next stage, if not the user is asked the same question again.
    
        Parameters: N/A
    
        Returns: void
    
     */
    public static void stage5() {
        // Prints stage number and sets up keyboard input
        System.out.println("---Stage 5---");
        Scanner keyedInput = new Scanner(System.in);

        // Declare variables
        String tempString = "";
        int value = 0;
        boolean valid = false;

        // Loop until the user enters valid input, 
        // If what the user enters matches the criteria, then stop looping
        // Else say that the input was invalid and ask them to try again
        while (valid == false) {
            System.out.println("Enter a negative integer: ");
            tempString = keyedInput.nextLine();
            System.out.println("");
            try {
                value = Integer.parseInt(tempString);
                if (value < 0) {
                    valid = true;
                } else {
                    System.out.println("Sorry, your input was invalid. Try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Sorry, your input was invalid. Try again.");
            }
        }
        // Print the message and move on to the next stage
        printStageEnd(tempString, 5);
        stage6();
    }

    /* 
        stage6
    
        This method asks the user to enter valid input according to what is 
        printed on the screen. If the user enters valid data, the user gets a 
        congratulatory message for completeing the program, if not the user is 
        asked the same question again. The program then completes and stops.
    
        Parameters: N/A
    
        Returns: void
    
     */
    public static void stage6() {
        // Prints stage number and sets up keyboard input
        System.out.println("---Stage 6---");
        Scanner keyedInput = new Scanner(System.in);

        // Declare variables
        String tempString = "";
        int value = 0;
        int remainder;
        boolean valid = false;

        // Loop until the user enters valid input, 
        // If what the user enters matches the criteria, then stop looping
        // Else say that the input was invalid and ask them to try again
        while (valid == false) {
            System.out.println("Enter a positive, odd integer: ");
            tempString = keyedInput.nextLine();
            System.out.println("");
            try {
                value = Integer.parseInt(tempString);
                remainder = value % 2;
                if (remainder == 1) {
                    valid = true;
                } else {
                    System.out.println("Sorry, your input was invalid. Try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Sorry, your input was invalid. Try again.");
            }
        }
        // Print the message and complete the program
        printStageEnd(tempString, 6);
    }
}
