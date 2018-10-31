/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.allthetrivia;

import java.util.Scanner;

/**
 *
 * @author apprentice
 * PSEUDOCODE
 * 1,024 Gigabytes is equal to one what? Terabyte
In our solar system which is the only planet that rotates clockwise? Venus
The largest volcano ever discovered in our solar system is located on which planet? Mars
What is the most abundant element in the earth's atmosphere? Nitrogen
 * 
 */
public class AllTheTrivia {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        String ans1;
        String ans2;
        String ans3;
        String ans4;
        
        System.out.println("Answer the following trivia questions:");
        
        System.out.print("1,024 Gigabytes is equal to one what? ");
        ans1 = inputReader.nextLine();
        
        System.out.print("In our solar system which is the only planet that roates clockwise? ");
        ans2 = inputReader.nextLine();
        
        System.out.print("The largest volcano ever discovered inour solar system is located on which Planet? ");
        ans3 = inputReader.nextLine();
        
        System.out.print("What is the most abundant element inthe earth's atmosphere? ");
        ans4 = inputReader.nextLine();
        
            System.out.println("\nWow, 1,024 Gygabytes is a "+ans3+"!");
            System.out.println("I didn't know that the largest ever vocano was discovered on "+ans1+"!");
            System.out.println("That's amazing that "+ans2+" is the most abundant element in the atmosphere...");
            System.out.println(ans4+" is the only planet that rotates clockwise, neat!");
            
        
        
        
    }
    
}
