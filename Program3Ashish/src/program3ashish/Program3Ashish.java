/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program3ashish;

/**
 *
 * @author Ashish
 */
import java.util.Scanner;

public class Program3Ashish {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);

        double salary;
        double finalTax;

        System.out.println("Please enter your taxable income: ");
        salary = keyedInput.nextDouble();
        
        if (salary <= 49020) {
            finalTax = salary*0.15;
        }

        System.out.println("The total cost comes to $" + finalTax + ".");
    }

}