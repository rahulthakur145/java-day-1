public class Assignment1_4 {
   static class Parent {
    String fatherName = "Mr. Thakur";
    String motherName = "Mrs. Thakur";
}

static class Child extends Parent {
    String childName = "Rahul Thakur";

    void showNames() {
        System.out.println("Child Name: " + childName);
        System.out.println("Father Name: " + fatherName);
        System.out.println("Mother Name: " + motherName);
    }
}

class Family {
    public static void main(String[] args) {
        Child c = new Child();
        c.showNames();
    }
}

}

    

