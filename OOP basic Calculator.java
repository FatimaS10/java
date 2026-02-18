package com.mycompany.mainclass;

import java.util.Scanner;


public class Mainclass {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.println("Enter first number : ");
        int num1= sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        calc. add(num1,num2);
        calc. subtract (num1, num2);
        calc. multiply(num1,num2);
        calc. divide (num1,num2);
        
    }
}
package com.mycompany.mainclass;


public class Calculator {
    void add(int a ,int b){
    int result = a+b;
        System.out.println("Addition: "+ result);
    }
    void subtract(int a,int b){
        int result= a-b;
        System.out.println("Subtraction: "+ result);
    
    }
    void multiply(int a ,int b){
    int result = a*b;
        System.out.println("Multiplication: "+ result);
    }
    void divide(int a ,int b){
        if(b!=0){
    int result = a/b;
        System.out.println("Division: "+ result);
        }else{
            System.out.println("Division by Zero is not allowed");
        }
    }
    
}
