import java.util.Scanner;
public class Palindrome{
	public static void main(String[] args) {
	    int n,rev=0,num,digit;
	     
	    Scanner sc = new Scanner(System.in);
		System.out.println("enter the Num");
		num= sc.nextInt();
		n=num;
		while(num>0){
		    digit= num%10;
		    rev= rev*10+digit;
		    num=num / 10;
		}
		if(rev==n){
		      System.out.println("no. is palindrome");
		 }else{
		    System.out.println("no. is not palindrome");
		}
	}
}