class studentclass3_2 {
    
    static class Student {
    String name = "Rahul";
}

static class Marks {
    int marks = 85;
}

public static void main(String args[]) {

    Student s = new Student();
    Marks m = new Marks();

    System.out.println("Student Name: " + s.name);
    System.out.println("Student Marks: " + m.marks);
    System.out.println("Result Class Object Accessed");
}

    
}
