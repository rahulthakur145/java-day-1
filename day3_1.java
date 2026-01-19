public class day3_1 {
    class student{
        String name;
        int age;
        
        student(){
            name = "default name";
            age = 18;
        }
        
        void display(){
            System.out.println("Name: " + name+", Age: " + age);
        }
    }
    
    public static void main(String[] args) {
        day3_1 outer = new day3_1();
        student student1 = outer.new student();
        student1.display();
    }
}
