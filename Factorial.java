import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
      int num,i;
      long fact=1;
      
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your num: ");
        num = sc.nextInt();
        for (i=1;i<=num;i++){
             fact*=i;
        }
    System.out.println(fact);
        
    
    
    }
}