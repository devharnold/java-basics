/*
 * used when you have a condition to test but have one or more blocks of code to execute
 * One is executed if the condition is true and another executed when the condition is false
 *
 *
 */
import java.util.*;

public class IfElse {
	public static void main(String[] args) {
		int num;

		Scanner Input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num = Input.nextInt();

		if(num % 2 == 0) {
			System.out.println("Even number" +num);
		}
		else {
			System.out.println("odd number" +num);
		}
	}
}
