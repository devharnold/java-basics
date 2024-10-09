/*
 * Write a java program that calculates the area and circumference of a circle 
 * given its radius is provided bt the user.Use type casting to ensure the result is a given integer
 *
 * Getting input from the user:
 * There are three methods of accepting user input in java:
 * 1. Using the scanner class
 * 2. Using buffer reader class 
 * 3. Using JOptionPane class.
 *
 * 1.Scanner class.
 * 	The Scanner class is used to get a user input. It is a class found in package called java.util package 
 * 	To use the scanner class, you have to import the java.util package, create an object of the class and use
 * 	any of the available methods found in Scanner class documentation
 *
 * 	example of the methods used by the Scanner class:
 * 	1. nextBoolean() -> Reads a boolean value from the user
 * 	2. nextInt() -> Reads an integer value from the user
 * 	3. nextLong() -> Reads a long value from the user
 * 	4. nextDouble() -> Reads a double value from the user
 * 	5. nextLine() -> Reada a string value from the user
 * 	6. nextFloat() -> Reads a float value from the user
 * 	7. nextByte() -> Reads a byte value from the user
 * 	8. nextShort() -> Reads a short value from the user
 *
 */
import java.util.Scanner;


public class Exercise {
	public static void main(String[] args) {
		//declare the variable radius
		double raidus;

		//Get the radius from the user using Scanner class
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius of the circle: ");
		radius = scanner.nextDouble();
		//close the scanner object
	       	scanner.close();
              
		//calculate the area and perimeter
		double area =Math.PI*radius*raidus;
		int Newarea = (int) area;
		double circumference = (2 * Math.PI * radius);
		int NewPerimeter = (int) circumference;

		// print the output after type casting
		System.out.println("Area of the circle: " + Newarea);
		System.out.println("Circumference of the circle: " + NewPerimeter);
	}
}
