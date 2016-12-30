/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmicalculatorext1;
import java.util.Scanner;
/**
 *
 * @author Yaritza
 */
public class NewClass {
    
    public static void main(String [] args) {
		Scanner input = new Scanner(System.in);

		int hint;// get height of person

		System.out.println("Please enter height in feet and inches:");// prompt user to enter a height in feet and inches
                    int l = input.nextInt();//get height in feet of person
                    int i = input.nextInt();//get height in inches of person

		int wint;// get weight of person
		
		System.out.println("Please enter low weight and high weight in pounds :");// prompt user to enter a low weight and high weight in pounds
                    int lw = input.nextInt();// get low weight in pounds of person
                    int hw = input.nextInt();// get high weight in pounds of person
                    
		System.out.println("weight\t\tBMI");// row info for info in columns tabbed over twice
                
                double x;// overall input of the users low and high weight
                for (x = lw; x <= hw; x+=5) {// start at low weight to the high weight entered by user going up in pounds of 5
                double bmi = ((703 * x)/(((l * 12)+ i)*((l * 12)+ i)));
                  
                System.out.print(x +  "         "  );// prints weight, bmi, and they are overweight depending on bmi tabbed over twice
                    System.out.printf( "%.4f" , bmi); 
                    System.out.print( "        ");
              
                if (bmi > 25) {// process overweight
                     System.out.println("Overweight ");
                }
                else {// process not overweight
                    System.out.println( "Not Overweight! ");// prints weight, bmi , and, they are not overweight depending on bmi tabbed over twice
                }//
	}// end for statement 
    }  
}


