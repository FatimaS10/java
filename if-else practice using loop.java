import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of student :");
        int n = sc.nextInt();
       int count = 1;
       while (count<=n){
           System.out.print("Enter Marks: ");
           int marks = sc.nextInt();
           if(marks>= 80 && marks<=100){
               System.out.println("Grade : A+");
           } else if(marks>= 70){
               System.out.println("Grade : A");
           } else if(marks>= 60){
               System.out.println("Grade : A-");
           } else if(marks>= 50){
               System.out.println("Grade : B");
           } else if(marks>= 40){
               System.out.println("Grade : C");
           } else if(marks>= 33){
               System.out.println("Grade : D");
           } else if(marks>= 0){
               System.out.println("Grade : F");
           }else{
               System.out.println("Invalid Marks!");
           }
           count++;
          }
       }
    }
       
            
   

