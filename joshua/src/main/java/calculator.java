/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.calculator;
import java.util.Scanner;
/**
 *
 * @author CL1-PC33
 */
public class calculator {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("[1] = Addition");
        System.out.println("[2] = Substraction");
        System.out.println("[3] = Multiplication");
        System.out.println("[4] = Division");
        System.out.println("Enter First Number: ");
        int x = input.nextInt();
        System.out.println("Enter Second Number: ");
        int y = input.nextInt();
        int sum = x + y;
        int diff = x - y;
        int prod = x * y;
        int div = x / y;
        
       if (0 == 1)
       {
           System.out.print("The sum is" + sum);
       }
       else if (0 == 2)
       {
           System.out.print("The difference is" + diff);
       }
       else if (0 == 3)
       {
       System.out.print("The product is" + prod);
       }
       else if (0 == 4)
       {
       System.out.print("The quotient" + div);
       }
       else
       {
       System.out.print("INVALIID INPUT");
       }
    }
}
