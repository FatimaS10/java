public class student {
    String name;
    int age;
    
    //constructor
    student(String n, int a){
        name=n;
        age=a;
    }
        void display(){
        System.out.println("Student Name:"+ name);
        System.out.println("Student Age:"+ age);
        
    }
    }
    


public class NewClass {
    public static void main(String[] args) {
        student s1 = new student("Bonna" ,22);
        s1.display();
    }
    
}
