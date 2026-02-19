package overloadingconstructor;


public class Teacher {
    
String name, gender;
    int phone;
    Teacher(){
        System.out.println("No Info");
    }
    Teacher(String n, String g){
        name= n;
        gender=g;
        }
    Teacher(String n, String g, int p){
        name=n;
        gender=g;
        phone=p;
        
    }
    void display(){
        System.out.println("Name:"+ name);
         System.out.println("Gender:"+ gender);
          System.out.println("Phone:"+ phone);
    }
    
}


package overloadingconstructor;


public class NewClass {
    
 public static void main(String[] args) {
        Teacher t1= new Teacher();
        Teacher  t2 = new Teacher("Bonna","Female");
        t2.display();
        Teacher t3= new Teacher("Rahim","Male",01254);
        t3.display();
    }
    
 }

    
