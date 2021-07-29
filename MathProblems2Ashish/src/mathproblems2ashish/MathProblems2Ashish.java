/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathproblems2ashish;
/*
 * @author Ashish
 */

import java.util.Scanner;

public class MathProblems2Ashish {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        
        double radius;
        double area;
        
        System.out.println("Please enter the radius of the circle: ");
        radius = keyedInput.nextDouble();
        
        area = 3.14*(radius*radius);
        
        System.out.println("The area of the circle with a radius of " + radius + " is " + area + ".");
    }
    
}
