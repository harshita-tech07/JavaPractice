//without return value and without parameter

import java.util.Scanner;

class Function {
    
    void add() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
      System.out.print("Enter the value of b: ");

        int b = sc.nextInt();
         int c= a+b;
         System.out.print(c);
    }
     public static void main(String[] args) {
        Function obj=new Function();
        obj.add();
       
    }
}

//with return value and parameter
// import java.util.Scanner;
// class addition{
//     public static int add(int a,int b){
//     return a + b;
// }

// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//  System.out.println("enter the value of num1:");
//  int num1 = sc.nextInt();
//  System.out.println("enter the value of num2:");
//   int num2 = sc.nextInt();
//  int sum = add(num1,num2);

//      System.out.println(sum);
// sc.close();
// }}
 