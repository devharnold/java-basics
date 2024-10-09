/*
 * Logical Operators:
 * They are used to combine two boolean expressions and return a boolean result
 *
 * Examples:
 * 1. Logical AND (&&) -> Returns true if both operands are true and otherwise returns false.
 * 2. logical OR (||) -> Returns true if atleast one of the operands is true otherwise returns false.
 * 3. logical NOT (!)-> Negates the boolean value of the operand i.e returns true if operand is false and vice versa...
 *
 * Truth Table
 * Logical AND:
 * 	TT -> true
 * 	TF -> false
 * 	FT -> false
 * 	FF -> false
 *
 * Logical OR:
 * 	TT -> true
 * 	TF -> true
 * 	FT -> true
 * 	FF -> false
 *
 * Logical NOT:
 * 	if the expression is true it returns false
 * 	when the expression is false it returns true
 *
 * example:
 * write a simple java program that declares two numbers then use the any logical operators to declare to showcase how logical operators are implemente
 *
 */
public class LogicalOp {
    public static void main(String[] args) {
        // declare two numbers
        int num1 = 3;
        int num2 = 5;

        // Use logical operators in print statements
        System.out.println((num1 > num2) && (num1 == num2)); // Logical AND
        System.out.println((num2 < num1) || (num1 != num2)); // Logical OR
        System.out.println(!(num1 == num2 && num1 < num2));  // Logical NOT
    }
}
