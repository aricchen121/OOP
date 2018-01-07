/*
 * First homework for object oriented class.
 * @ Aric Chen
 */

import java.math.*;
import java.util.Scanner;
public class two {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 	// Create a new Scanner
		
		System.out.println("Enter ctrl z to exit");
		System.out.print("Enter radius: ");
		// User follows instructions
		// User enter radius to find area 
		while (input.hasNextDouble()){
		double radius = input.nextDouble();
		double area = Math.PI * Math.pow(radius, 2);
		
		System.out.println("Area is: " + area);
		System.out.print("Enter radius: ");
		}
	}

}
