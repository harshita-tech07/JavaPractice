import java.util.Scanner;
 public class Table {
 public static void main(String[] args) {
   int i,m,n;
  Scanner sc = new Scanner(System.in);  

  System.out.print("Enter your n: ");
     n= sc.nextInt();

    for(i=1;i<=10;i++){
        m=n*i;
       System.out.println(n+"*"+i+" = "  +m); 
    }}}
    