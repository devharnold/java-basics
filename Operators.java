/*
 * Operators
 * An operator is a symbol that tells the computer to perform some mathematical or logical operation
 *
 * Java programming languages provides the following types of operators
 * 1. Arithmetic operators
 * they are used to perform simple mathematical operations on numerical values
 * eg. Addition(+)
 *     Multiplication(*)
 *     Subtraction(-)
 *     Division(/)
 *
 *
 */

public class Operators {
	public static void main(String[] args) {
		int x = 4;
		int y = 8;

		int sum = x + y;
		int difference = x + y;
		int product = x * y;
		int quotient = x / y;
		int remainder = x % y;


		System.out.println(sum);
		System.out.println(difference);
		System.out.println(product);
		System.out.println(quotient);
		System.out.println(remainder);
	}
}

/*
 * Relational Operators
 * They are used to compare two values and return a boolean result i.e true or false
 * Examples:
 *      Equal to(==) --> Checks if two values are equal.
 *      Not Equal to(!=) -> Checks if two values are not equal
 *      Greater than (>) -> Checks if one value is greater than another
 *      Greater than or equals to (>=) -> Checks if a value is greater than or equal to another
 *      IsLessThan (<) -> Checks if a value is less than another
 *      LessThanOrEqual (<=) ->
 *
 */

public class Operators {
	public static void main(String[] args) {

		boolean isEqual = (x == y);
		boolean isNotEqual = (x != y);
		boolean isGreaterThan = (x > y);
		boolean isLessThan = (x < y);
		boolean isGreaterThanOrEqual = (x >= y);
		boolean isLessThanOrEqual = (x <= y);

		System.out.println(isEqual);
		System.out.println(isNotEqual);
		System.out.println(isGreaterThan);
		System.out.println(isLessThan);
		System.out.println(isGreaterThanOrEqual);
		System.out.println(isLessThanOrEqual);
	}
}
