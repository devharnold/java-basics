/*
 *
 * Write a java program that accepts the age, determines if someone is eligible
 * to be a Kenyan Voter given that official voting age is 18 and above.
 *
 */
import java.util.*;

public class Example2 {
	public static void main(String[] args) {
		int age;

		Scanner Input = new Scanner(System.in);
		System.out.print("Enter your age: ");
		age = Input.nextInt();

		if (age >= 18) {
			System.out.println("Allowed. Can be a voter");
		} else if (age < 18) {
			System.out.println("Not allowed.Still young");
		} else {
			System.out.println("Invalid! Please enter a valid age");
		}
	}
}
