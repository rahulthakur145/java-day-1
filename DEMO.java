public class DEMO {

    
    DEMO() {
        this("Default Constructor");
    }

    DEMO(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        DEMO d = new DEMO(); 
    }
}
