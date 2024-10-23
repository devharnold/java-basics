/*
 * Repetition control structures
 * They force a program to execute a code repeatedly with a certain condition is fulfilled
 * In loops, a loop control variables must be initialized before the loop can start
 * Then you must test the loop control variable(it is done inside a parenthesis)
 * Finally, the loop variables must be updated somewhere inside the loop.
 *
 * Repetition control structures are classified into 3:
 * 1. Computer controlled
 * 2. Sentinel Controlled
 * 3. Conditional loop.
 *
 * examples of loops
 * 1. For loop
 * 2. while loop
 * 3. do/while loop
 *
 * For loop
 * it is used to execute a block of code repeately for a specific number of iterations / times
 * Use for loop when you know the number of lines the loop should execute beforehand
 *
 * syntax:
 * For (loop variable; condition; update of the loop) {
 * 	//block of code to execute;
 * }
 *
 * example write a program that prints all values 10- 100 that are divisible by 5 using for loop.
 *
 *
 */

public class Loops {
	public static void main(String[] args) {
		int num;

		for(num = 10; num <= 100; num = num + 5) {
			System.out.println(num);
		}
	}
}

// 1.Initializes-> It is executed first i.e num=10
// 2. condition -> Evaluated before each iteration of the loop i.e num <= 100
// 3. evaluaton
