import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter a number :");
         int n = sc.nextInt();
         System.out.print("\nUsing for loop\n ");
         for( int i=1 ; i<=n ; i++){
             System.out.println(i);
         }
          System.out.print("\n Using while loop \n");
          int j=1;
          while(j<=n){
              System.out.println(j);
              j++;
          }
           System.out.println("\n Using  do while loop ");
           int k =1 ;
           do{
               System.out.println(k);
               k++;
           }while(k <=n);
     }
}
