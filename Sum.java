import java.util.Scanner;
public class Sum
{
	public static void main(String[] args) {
	    int i,num,sum=0,digit;
	   
	    Scanner sc= new Scanner(System.in);
		System.out.println("enter the num:");
		num = sc.nextInt();
		while(num>0){
		    digit= num%10;
		    sum=sum+digit;
		    num=num/10;
		    
		}
		  	System.out.println(sum);  
		}
		}