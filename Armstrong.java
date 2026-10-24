import java.util.Scanner;
public class Armstrong{
	public static void main(String[] args) {
	    int n,num,digit;
	    int count=0;
	     
	    Scanner sc = new Scanner(System.in);
		System.out.println("enter the Num");
		num= sc.nextInt();
		n=num;
		int r=String.valueOf(num).length();
		while(num>0){
		    digit= num%10;
		    count= count+(int)Math.pow(digit,3);
		    num=num / 10;
		}
		if(count==n){
		      System.out.println("no. is armstrong");
		 }else{
		    System.out.println("no. is not armstrong");
		}
	}
}