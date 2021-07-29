/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathproblemsashish;
/*
 * @author Ashish
 */

import java.util.Scanner;

public class MathProblemsAshish {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        
        double length;
        double width;
        double area;
        
        System.out.println("Please enter the length of the rectangle: ");
        length = keyedInput.nextDouble();
        System.out.println("Please enter the width of the rectangle: ");
        width = keyedInput.nextDouble();
        
        area = length*width;
        
        System.out.println("The area of the rectangle with a length of " + length + " and a width of " + width + " is " + area + ".");
    }
    
}
