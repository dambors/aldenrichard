/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.joshua;
import java.util.Scanner;

/**
 *
 * @author CL1-PC33
 */
public class Joshua {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("[1] = Rock");
        System.out.println("[2] = Paper");
        System.out.println("[3] = Scissors");
        System.out.print("Enter Playaer 1:");
        int x = input.nextInt();
        System.out.print("Enter Player 2:");
        int y = input.nextInt();
        if (x==1 && y == 1)
        {
            System.out.print("Draw!!!");
        }
        else if (x == 1 && y == 2)
                {
                System.out.print("Player 2 Wins!");
                }
        else if (x == 1 && y == 3)
        {
            System.out.print("Player 2 Wins!");
        }
        else if (x == 2 && y == 1)
        {
            System.out.print("Player 1 Wins!");
        }
        else if (x == 2 && y == 2)
        {
        System.out.print("Draw!!");
        }
        else if (x == 2 && y == 3);
        {
            System.out.print("Player 2 Wins!! ");
        }
                 
        {       
            
    }
}}
