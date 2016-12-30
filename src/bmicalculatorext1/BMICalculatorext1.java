/*

 File: [BMICalculatorext1]
 By: [Yaritza Perez]
 Date: [Septemeber 22nd, 2015]

 Compile: [javac BMICalculatorext1.java
 java BMICalculatorext1]
 Usage: [Download Java file with a Java supported Program, e.g. Netbeans, 
 Text Wrangler, etc. ]
 System: [Mac and Windows; Needs updated Java]

 Description: [The program prompts the user to give their name, height
 in ft. and in. as well their low weight and high weight. After the 
 information above is given, the code then calculates the user's BMI 
 from their low weight to their high weight by 5. Which is then 
 catergized as Under weight, Normal Weight, or Over weight. ]
 */
package bmicalculatorext1;

import java.util.Scanner;

/**
 *
 * @author Yaritza
 */
public class BMICalculatorext1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String name;
        int ft;
        int in;
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
