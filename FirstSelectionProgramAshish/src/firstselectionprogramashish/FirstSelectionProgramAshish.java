/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstselectionprogramashish;

/**
 *
 * @author Ashish
 */
import java.util.Scanner;

public class FirstSelectionProgramAshish {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Set the scanner to sense keyed inputs
        Scanner keyedInput = new Scanner(System.in);

        // Initialize variables needed
        double moneySpent;
        double discountPercent = 0;
        double savings;
        double total;
        final double dis40 = 0.40;
        final double dis30 = 0.30;
        final double dis20 = 0.20;
        final double dis10 = 0.10;

        //Gets how much the user spent and sets the moneySpent variable
        System.out.println("Please enter the amount spent: ");
        moneySpent = keyedInput.nextDouble();

        //Finds out how much discount to give the user based on how much they spent
        if (moneySpent > 120) {
            discountPercent = dis40;
        } else if (moneySpent >= 80.01) {
            discountPercent = dis30;
        } else if (moneySpent >= 40.01) {
            discountPercent = dis20;
        } else if (moneySpent >= 0.01) {
            discountPercent = dis10;
        }

        //Finds the savings in dollars based on moneySpent and discount percent
        //Rounds and stores in variables
        savings = moneySpent * discountPercent;
        savings = (double) Math.round(savings * 100) / 100;

        //Calculates total by minusing the amount saved
        //Rounds and stores in variables
        total = moneySpent - savings;
        total = (double) Math.round(total * 100) / 100;

        //Prints out all the info to the user
        System.out.println("You spent: $" + moneySpent);
        System.out.println("You are saving " + (discountPercent * 100) + "%");
        System.out.println("You are saving $" + savings);
        System.out.println("Your total is $" + total);
    }

}
