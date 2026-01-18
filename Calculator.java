import java.util.Scanner;

public class Calculator {
    
    // Method to add two numbers
    public static double add(double a, double b) {
        return a + b;
    }
    
    // Method to subtract two numbers
    public static double subtract(double a, double b) {
        return a - b;
    }
    
    // Method to multiply two numbers
    public static double multiply(double a, double b) {
        return a * b;
    }
    
    // Method to divide two numbers
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }
    
    // Method to perform modulo operation
    public static double modulo(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot perform modulo with zero!");
            return 0;
        }
        return a % b;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        System.out.println("========================================");
        System.out.println("         SIMPLE CALCULATOR");
        System.out.println("========================================");
        System.out.println("Operations available:");
        System.out.println("  + (Addition)");
        System.out.println("  - (Subtraction)");
        System.out.println("  * (Multiplication)");
        System.out.println("  / (Division)");
        System.out.println("  % (Modulo)");
        System.out.println("  exit (To quit the calculator)");
        System.out.println("========================================\n");
        
        while (running) {
            try {
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                
                System.out.print("Enter operator (+, -, *, /, %): ");
                String operator = scanner.next();
                
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();
                
                double result = 0;
                boolean validOperation = true;
                
                switch (operator) {
                    case "+":
                        result = add(num1, num2);
                        break;
                    case "-":
                        result = subtract(num1, num2);
                        break;
                    case "*":
                        result = multiply(num1, num2);
                        break;
                    case "/":
                        result = divide(num1, num2);
                        break;
                    case "%":
                        result = modulo(num1, num2);
                        break;
                    default:
                        System.out.println("Error: Invalid operator! Please use +, -, *, /, or %\n");
                        validOperation = false;
                }
                
                if (validOperation) {
                    System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result + "\n");
                }
                
            } catch (Exception e) {
                System.out.println("Error: Invalid input! Please enter valid numbers and operator.\n");
                scanner.nextLine(); // Clear the invalid input
            }
        }
        
        scanner.close();
        System.out.println("Thank you for using the calculator!");
    }
}
