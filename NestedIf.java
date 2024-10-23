/*
 * 3. Nested if statements/ if-else statements
 * It is used where there are multiple conditions to test.
 * If any of the condition is true, a block of code or statements are executed
 * In case all conditions are false, there is specified block of code that is executed.
 *
 * syntax:
 * if (condition 1) {
 * 	// block(s) of code to execute if condition i is true.
 * }
 * else if (condition 2) {
 * 	// block(s) of codes to execute if condition 2 is true.
 * }
 * .
 * .
 * .
 * .
 * else {
 * 	//block(s) of code to execute if all conditions are false/ non of the conditions are true
 * }
 *
 * example:
 * 	Create using Java, a basic grading system that:
 * 	1. Accepts scores of a student for assignment, cat and examination.
 * 	2. Grades the student based on the total marks out of 100
 * 	3. Sends an encouraging message to the student based on the grade attained.
 *
 * 	Use the following criteria:
 * 	above 100 or less 0, inalid entry
 * 	80 -100 -> A
 * 	65 - 79 -> B
 * 	55 - 64 -> C
 * 	40 - 54 -> D
 * 	0 - 39 -> E
 *
 */
import java.util.*;

public class NestedIf {
	public static void main(String[] args) {

		Scanner Input = new Scanner(System.in);
		System.out.println("Please provide your total assignment marks /20: ");
		int TotalAssMarks = Input.nextInt();

		System.out.println("Also provide your CAT marks /30: ");
		int TotalCATMarks = Input.nextInt();

		System.out.println("Provide your examination score /50: ");
		int ExamScore = Input.nextInt();

		// calculate total marks/100
		int TotalMarks = TotalAssMarks + TotalCATMarks + ExamScore;

		if (TotalMarks > 100 && TotalCATMarks < 0) {
			System.out.println("Invalid Entry!");
			System.out.println("Try another number.");
		}
		else if (TotalMarks >= 80 && TotalCATMarks <= 100) {
			System.out.println("Grade A!");
			System.out.println("Excellent job");
		} else if (TotalMarks >= 65 && TotalCATMarks <=79) {
			System.out.println("Grade B!");
			System.out.println("Good Job");
		} else if (TotalMarks >= 55 && TotalCATMarks <= 64) {
			System.out.println("Grade C!");
			System.out.println("Average");
		} else if (TotalMarks >= 40 && TotalCATMarks <= 54) {
			System.out.println("Grade D!");
			System.out.println("Below Average...");
		} else {
			System.out.println("Grade E..");
			System.out.println("Poor performance. Apply for supplementary examination");
			System.out.println("Apply for a supplementary exam");
		}
	}
}
