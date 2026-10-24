import java.util.Scanner;
public class StringCode
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
		System.out.println("enter your name:");
	     String name= sc.nextLine();
	     System.out.println("enter your Lname:");
	     String Lname= sc.nextLine();
	     System.out.println("Length: " + name.length());
         System.out.println("toUpperCase: " + name.toUpperCase());
     	 System.out.println("toLowerCase: " + name.toLowerCase());
     	 System.out.println("charAt: " + name.charAt(0));
     	 System.out.println("concat: " + name.concat(Lname));
     	 System.out.println("substring: " + name.substring(0,5));
     	 System.out.println("equals: " + name.equals(Lname));
    }}



// class X{
//  int a; //instance variable
//  static int b; // static variable

// 	public static void main(String X[]) {
// 	    int c=20; //local variable
	    
// 	    X x1 = new X();
//     System.out.println(x1.a);
//      System.out.println(b);
//      System.out.println(c);
     

// 	}
	
// }