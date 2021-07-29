/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Naren
 */
public class Test {

    /**
     * @param args the command line arguments
     */
public static String determineAns (int n1, int n2)
{
if ((n1 + n2) == 15)
     {return "MAYBE";}
else if ((n1 + n2) > 15)
     {return "YES";}
else
     {return "NO";}
}
public static void main(String[] args) {

int val1 = 6;
int val2 = 8;

System.out.println(determineAns (val1, val2));
} 
}
