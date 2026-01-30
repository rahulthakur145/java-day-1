public class Assignment2_3 {

    int rollNo;
    String name;
    static String college = "ABC Engineering College";

    Assignment2_3(int r, String n) {
        rollNo = r;
        name = n;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("College: " + college);
    }

    public static void main(String[] args) {
        Assignment2_3 s1 = new Assignment2_3(101, "Rahul");
        Assignment2_3 s2 = new Assignment2_3(102, "Amit");

        s1.display();
        System.out.println();
        s2.display();
    }
}

    

