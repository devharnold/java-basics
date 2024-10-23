import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1;  // Changed num1 to double
        double num2;
        double result;  // Variable 'Result' renamed to 'result' to follow Java conventions
        char operator;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();  // Changed nextFloat() to nextDouble()

        System.out.println("Enter any operator (+, -, *, /, %): ");
        operator = scanner.next().charAt(0);

        System.out.println("Enter the second number: ");
        num2 = scanner.nextDouble();

        switch(operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error! Division by zero is not allowed!");
                }
                break;

            case '%':
                if (num2 != 0) {  // Added this check for safety
                    result = num1 % num2;
                    System.out.println(num1 + " % " + num2 + " = " + result);
                } else {
                    System.out.println("Error! Division by zero is not allowed!");
                }
                break;

            default:
                System.out.println("Invalid Operator, Please enter a valid operator");
        }

        scanner.close();  // Close the scanner to avoid resource leakage
    }
}

