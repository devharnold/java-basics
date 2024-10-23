/*
 * It is similar to while, but
 * It executes the loop body atleast once if the condition is false
 * If the loop variable is updated first before the condition.
 * the keyword while is followed by a semicolon unlike the while loop where i is followed by {
 *
 * syntax:
 * initialization;
 * do {
 * code to execute;
 *
 * update the variable
 * }
 * while (condition);
 *
 *
 * example:
 * write a java program that prints "Have a lovaly evening!"
 * five times using do /while loop
 */

public class DoWhile {
	public static void main(String[] args) {

		int x = 0;
		do {
			System.out.println("Have a lovely evening!");
			x++;
		}
		while (x < 5);
	}
}
