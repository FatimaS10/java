import java.util.Scanner;

 public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter an Integer Number : ");
        int integer_num = sc.nextInt();
         System.out.print("Enter a Double Number : ");
         double double_num = sc.nextDouble();
          System.out.print("Enter a float Number : ");
         float float_num = sc.nextFloat();
          System.out.print("Enter a Character : ");
         char character = sc.next().charAt(0);
         sc.nextLine();
          System.out.print("Enter a String : ");
         String st_value = sc.nextLine();
          System.out.println("Output");
          System.out.println("Integer : " +integer_num);
          System.out.println("Double Number : "+double_num);
          System.out.println("Float Number : "+float_num);
          System.out.println("Character : "+character);
          System.out.println("String: "+st_value);

         }

 }
