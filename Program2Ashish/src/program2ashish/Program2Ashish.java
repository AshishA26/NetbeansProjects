/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program2ashish;

/**
 *
 * @author Ashish
 */
import java.util.Scanner;

public class Program2Ashish {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);

        final double USB_PRICE = 19.99;
        final double KEYBOARD_PRICE = 49.99;
        final double COMPUTER_MOUSE_PRICE = 25.99;
        int USBAmount;
        int keyboardAmount;
        int computerMouseAmount;
        final double TAX_RATE = 1.13;
        double totalPrice;
        double totalPriceRounded;

        System.out.println("Please enter the amount of USB storage devices you would like to buy: ");
        USBAmount = keyedInput.nextInt();

        System.out.println("Please enter the amount of keyboards you would like to buy: ");
        keyboardAmount = keyedInput.nextInt();

        System.out.println("Please enter the amount of computer mouses you would like to buy: ");
        computerMouseAmount = keyedInput.nextInt();

        totalPrice = ((USB_PRICE * USBAmount) + (KEYBOARD_PRICE * keyboardAmount) + (COMPUTER_MOUSE_PRICE * computerMouseAmount)) * TAX_RATE;
        totalPriceRounded = (double) Math.round(totalPrice * 100) / 100;

        System.out.println("The total cost comes to $" + totalPriceRounded + ".");
    }

}
