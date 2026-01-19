
    import java.util.Scanner;
    public class Assignment1_2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            if (b == 0) {
                System.out.println("Error: Division by zero is not allowed");
            } else {
                int result = a / b;
                System.out.println("Result: " + result);
            }
        }
    }
}

    

