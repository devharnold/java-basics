/*
 * while loop
 * It is used to execute a block code repeatedly as long as the given condition is true
 * Use while loop when you do not know the number of iterations before hand.
 *
 * syntax:
 * loop variable:
 * while(condition) {
 * 	//block of code to execute;
 * 	update the loop variable;
 * }
 *
 * a program that prints all natural numbers using while loop
 */

public class WhileLoop {
	public static void main(String[] args) {
		int x = 0;
		
		while(x < 10) {
			System.out.println(x);
			x++;
		}
	}
}
