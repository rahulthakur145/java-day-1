public static void main(String[] args) {
     class counter{
        static int count = 0;
        counter(){
            count++;
            System.out.println("object created. current count:" + count);

        }

    }
    new counter();
    new counter();
    new counter();
    System.out.println("final count: " + counter.count);
}