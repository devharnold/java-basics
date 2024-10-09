/*
 * These are operators used to assign values to value
 * We use = sign for assignment operators
 * examples:
 * Simple assignment(=) -> assigns a value to the right operand to the left operand.
 * addition and assignment(+=) -> adds the value of the right operand to the left operand and assigns the value to the left operand
 * subtraction and assignment (-=)
 * multiplication and assignment(*=)
 * division and assignment(/=)
 * modulus and assignment(%=)
 * bitwise AND assignment (&=)
 * bitwise OR assignment(|=)
 *
 *
 */

public class AssignmentOp {
	public static void main(String[] args) {
		int i = 50;
		int j = 20;
		
		// applying assignment operators
		i += j;
		System.out.println("new value of i = " +i);

		i /= j;
		System.out.println("new value of i = " +i);

		i ^= j;
		System.out.println("new value of i = " +i);

		i *= j;
		System.out.println("new value of i = " +i);

		i -= j;
		System.out.println("new value of i = " +i);

		//shift right assignment
		i >>= j;
		System.outprintln("new value of i = " +i);
}

/*
 * OPERATOR PRECEDENCE AND ASSOCIATIVITY
 * Operator precedence determines the order in which operations
 * are performed in an expression when multiple operators are present.
 *
 * Operators with higher precedence are evaluated first before operators with lower precedence.
 *
 * The order of operator precedence in java from highest to the lowest is:
 * 1. postfix expressions ie expression followed by ++ or --
 * 2. prefix expressions i.e expression preceded by ++, --, +, -, ! or ~
 * 3. multiplicative operators i.e *, / %.
 * 4. additive operators i.e +, -.
 * 5. shift operators i.e <<, >>, >>>
 * 6. relational operators i.e <, >, <=, >=
 * 7. equality operators i.e ==, !=.
 * 8. bitwise AND (&)
 * 9. bitwise XOR (^)
 * 10. bitwise OR (|)
 * 11. logical AND (&&)
 * 12. logical OR (||)
 * 13. ternary operator (?:)
 * 14. Assignment Operator(=, +=, -=, *=, /=, &=, ^=)
 *
 * n/b:
 * When multiple operators of the same precedence
 * are present in an expression, associativity
 * determines the order of evaluation. In java,
 * most operators are left-associative, meaning they
 * are evaluated from left to right. However, some operators, such as the assignment operators, are
 * right-associative  and are evaluated from right to left
 *
 * examine and explain the order in which the following expression will be solved.
 * x = (y + z) / 3x != 4w += z (y & x) << 1 == 0
 *  
 */
