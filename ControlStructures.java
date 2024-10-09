/*
 * Control Structures
 * They are used to determine/ control the order in which statements
 * are executed based on certain conditions or loops.
 * Types:
 * 1.If statements:
 * there are three if statements that is:
 * if
 * if/else
 * nested if if/else
 * these structures are used to execute a block of code conditionally based on some boolean expression
 * 2. switch statements:
 * used to execute different blocks of code based on different values of an expression.
 * It provides a more concise way of dealing with multiple conditions 
 *
 * if:
 * used when there is one condition to test.
 * the block of code is only executed if the condition is true.
 *
 * syntax:
 * if {
 * block of code to execute;
 * }
 *
 * example:
 * write a java program that prints the number 
 * if the number entered is negative
 *
 */
public class ControlStructures {
	public static void main(String[] args) {
		int num = -5;

		if(num < 0) {
			System.out.println(num);
		}
}
