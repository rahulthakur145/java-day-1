class Parent {
    int a = 10;
    int b = 20;
}

class Child extends Parent {
    int a = 30;

    void show() {
        System.out.println(super.a);
        System.out.println(super.b);
        System.out.println(a);
    }
}

public class day5_2 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}
