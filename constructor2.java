package constructor2;


public class Constructor {
    String name,department;
    int id;
    Constructor(){
        System.out.println("No Information");
    }
    Constructor(String n, String d){
        name=n;
        department=d;
    }
    Constructor(String n,String d,int i){
        name=n;
        id=i;
        department=d;
    }
    void display(){
        System.out.println("Name:" +name);
        System.out.println("Department:" +department);
        System.out.println("Id:" +id);
    }
package constructor2;


public class Sub_cons {
    public static void main(String[] args) {
        Constructor Student1=new Constructor();
        Constructor Student2=new Constructor("Bonna" ,"CSE");
        Constructor Student3=new Constructor("Lily","EEE",214);
        Constructor Student4=new Constructor("Tuktuki","LLB",555);
        Constructor Student5=new Constructor();
        
        
        Student1.display();
         Student2.display();
         Student3.display();
          Student4.display();
          Student5.display();
  }
}
        
        
        
        
    
    

    
    
}
