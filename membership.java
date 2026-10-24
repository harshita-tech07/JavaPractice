  import java.util.Scanner;
public class membership {
  public static void main(String[] args) {
      int age;
      String membership;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        age = sc.nextInt();
       System.out.print("Do you have a membership card? (yes/no): ");
         membership = sc.next();

        int price;
        if (age < 12) {
            price = 5;
        } 
        else if (age >= 65) {
            price = 7;
        } 
        else {
            price = 10;
        }
       if (membership.equals("yes")) {
            price = price - 2;
        }
       System.out.println( price);

        
    }
}   
