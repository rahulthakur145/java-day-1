import java.util.Scanner;

public class Assignment2_1 {
    String name;
    int rollNo;
    long prn;

    Assignment2_1(String n, int r, long p) {
        name = n;
        rollNo = r;
        prn = p;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("PRN: " + prn);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int roll = sc.nextInt();
        long prn = sc.nextLong();

        Assignment2_1 s = new Assignment2_1(name, roll, prn);
        s.display();
        sc.close();
    }
}
