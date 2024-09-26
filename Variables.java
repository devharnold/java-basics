/*
 * A variable is a container for storing data or a named memory location where data is stored.
 * All variables must be declared/created before use
 *
 * Variable declaration in java syntax:
 * dataType variableName;
 *
 * e.g
 * int number;
 * char grade;
 * float weight;
 * variable initialization
 * To initialize the variable means assigning a value to the variable
 * We use assignment operator (=) to assign values to the variable
 *
 * e.g
 * int number = 12;
 * char grade = 'A';
 * float weight = 42.35;
 * 
 * Data types
 * two categories of data types in java
 * primitive types 
 * reference types
 *
 * Primitive types
 * They are pre-defined data types
 * They are the basic building blocks for storing and manipulating data.
 * They represent sing values for a specific kind and have fixed size in memory
 * They include :
 * 	1. Byte: This DT is an 8-bit signed integer that can store values from -128 to 127
 * 	2. Short: This DT is a 16-bit signed integer that stores values from -32768 to 32767.
 * 	3. Int: This is a 32-bit signed integer that can store values from -2147483648 to 2147483647. It is the default integer type in Java.
 * 	4. Long: This is a 64-bit signed integer that can store values from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
 * 	5. Float: This numeric type that can store floating point values.It saves memory for large arrays where floating point values are used. The 
 * 			default value is 0.0f. This type cannot be used for precise values eg currency. It uses the keyword float
 * 	6. Double: This is a numeric type that can store floating point values.It is mainly used as the default value for decimal values.However, this
 * 			type cannot be used for precise values such as currency. Its default value is 0.0d.It uses the keyword double.
 * Examples:
 * 	Write a program that creates three variables of your choice then displays all of them in a single line.
 * 	NB: use concatenation.
 */

public class Variables {
	public static void main(String[] args) {

		int age = 45;
		String names = "Henry Arnold";
		double weight = 73.5;

		System.out.println("Hi " + names + " you are " + age + " years old and you weigh " + weight + " kgs");
	}
}
