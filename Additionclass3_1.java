public class Additionclass3_1 {

    static class Addition {
        void add(int a, int b) {
            System.out.println("Sum = " + (a + b));
        }
    }

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        Addition obj = new Addition();
        obj.add(x, y);
    }
}
