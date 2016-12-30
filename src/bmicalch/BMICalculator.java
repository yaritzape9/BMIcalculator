/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmicalch;

import java.util.Scanner;

/**
  * File: [BMICalculator]
 By: [Yaritza Perez]

 Compile: [javac BMICalculator.java
 java BMICalculatorext1]
 Usage: [Download Java file with a Java supported Program, e.g. Netbeans, 
 Text Wrangler, etc. ]

 * @author Yaritza
 */
public class BMICalculator {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
           String name;
            int ft;
            int in = 0;
            int height;
            double BMI;
            double lweight;
            double hweight;

            Scanner keyboard = new Scanner(System.in);

    //asks user to input information to calculate BMI
            System.out.println("Welcome to BMI Calculator!");
            System.out.print("Enter name here: ");
            name = keyboard.nextLine();
            System.out.println("Enter Height in feet and inches. ");
            System.out.print("Feet: ");
            ft = keyboard.nextInt();
            System.out.print("Inches: ");
            in = keyboard.nextInt();
            System.out.print("Enter your low weight: " + "\n");
            lweight = keyboard.nextDouble();
            System.out.print("Enter your high weight: " + "\n");
            hweight = keyboard.nextDouble();

            height = ft * 12 + in;

            System.out.println("\n" + "Weight" + "         " + "BMI");

    //displays range from low weight to high weight by an increment of 5
            for (double i = lweight; i <= hweight; i += 5) {

                BMI = i / (height * height) * 703;

    //prints out weight + BMI to 4 decimal places
                System.out.print(i + "         ");
                System.out.printf("%.4f", BMI);
                System.out.print("         ");

    //Prints BMI catergorie depending on user input 
                if (BMI <= 18.5) {
                    System.out.println("You are under weight");
                } else if (BMI >= 18.6 && BMI <= 24.9) {
                    System.out.println("Normal Weight");
                } else if (BMI >= 25) {
                    System.out.println("You are over weight");
                } else {
                    System.out.println("BMI can not be categorized");
                }
            }
    }
    

}
