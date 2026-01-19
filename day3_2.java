public class day3_2 {
     
    class student{
        String name;
        int age;
        
        student(String n, int a){
            name = n;
            age = a;
        }
        
        void display(){
            System.out.println("Name: " + name+", Age: " + age);
        }
    }
    
    public static void main(String[] args) {
        day3_2 day3_2 = new day3_2();
        student student1 = day3_2.new student("John", 20);// Parameterized constructor
        student1.display();
    }
}

    

