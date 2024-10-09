/*
 * Type casting is the process of converting a value from one data type to another
 * There are two types of Type Casting
 * 1. Implicit casting(automatic): this type of casting is performed by the Java compiler
 * 	It is where you assign a value of similar data type to a larger data type e.g from integer to a double
 * 2. Explicit castig(Manual): This type of casting is required when you want to convert a value from a 
 * 	larger data type to a smaller data type.
 * 	It is done when the compiler cannot determine the conversation automatically.
 * 	It is done by placing the target data type in a parent before the value being cast.
 *
 * 	e.g . double x = 1.2435;
 * 	int y = (int) x;
 *
 * example: write a java program to show how implicit and explicit conversions are implemented in java
 */

public class TypeCasting {
	public static void main(String[] args) {
		// implicit conversions
		int num1 = 240;
		double num2 = num1;

		// explicit conversions
		double num3 = 114.45;
		int num4 = (int) num3;

		System.out.println(num2);
		System.out.println(num4);
	}
}
/*
 * Variable scope
 * scope of a variable defines the region in the program where it can be defined, created or accessible
 *
 * In java there are three types of variable scopes:
 * 	1. local variables
 * 	These are variables declared within a method, contrustor or block.
 * 	They are accessible within the block where they are defined and cannot be accessed outside the block
 *
 * 	2.Instance (object) scope:
 * 	These are variables declared at the class level, outside the method or block.
 * 	They belong to instance of the class and are accessible throughout the class.
 *
 * 	3.Static (Class) scope:
 * 	They are declared using STATIC keyword at the class level.
 * 	They belong to the class itself and not to any instance of the class and share all objects 
 * 	or instances of the class
 */
