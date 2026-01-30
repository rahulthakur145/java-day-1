import java.util.Scanner;

public class Assinment2_2 {
    int a, b;

    Assinment2_2(int x, int y) {
        a = x;
        b = y;
    }

    void calculate(int choice) {
        switch (choice) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a / b);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int choice = sc.nextInt();

        Assinment2_2 c = new Assinment2_2(x, y);
        c.calculate(choice);
        
        sc.close();
    }
}