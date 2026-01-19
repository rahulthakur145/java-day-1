public class day3_4 {
    int id;
    String name;

    public static void main(String[] args) {
        day3_4 s1 = new day3_4();
        s1.id = 101;
        s1.name = "Alice";
        day3_4 s2 = new day3_4();
        s2.id = 102;
        s2.name = "Bob";
        System.out.println("Student ID: " + s1.id + ", Name: " + s1.name);
        System.out.println("Student ID: " + s2.id + ", Name: " + s2.name);
    }
}
