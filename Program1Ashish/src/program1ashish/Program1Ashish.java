/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program1ashish;

/**
 *
 * @author Ashish
 */
import java.util.Scanner;

public class Program1Ashish {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);

        double numberOfCombos;
        double totalWaterUsed;
        final double WATER_PER_COMBO = 1.5;

        System.out.println("Please enter the amount of computer/monitor combos (1 of each in a combo) you own: ");
        numberOfCombos = keyedInput.nextDouble();

        totalWaterUsed = numberOfCombos * WATER_PER_COMBO;

        System.out.println("The amount of water used to manufacture " + numberOfCombos + " computer/monitor combos is " + totalWaterUsed + " tons.");
    }

}
