class parents{
    parents() {
        System.out.println("This is parent class constructor");
    }
}

class child extends parents{
    child() {
        super();
        System.out.println("This is child class constructor");
    }
}
public class Main{
    public static void main(String[] args) {
        child c = new child();
    }
}