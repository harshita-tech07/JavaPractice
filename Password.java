import java.util.Scanner;

public  class Password  {
   public static void main(String[] args) {
    int i, pwd,correctPwd=4545;
     boolean access=false;
     Scanner sc = new Scanner(System.in);
   
       for(i=1;i<=3;i++){
          System.out.print("Enter your pwd: ");
         pwd = sc.nextInt();
          if(pwd==correctPwd){
              System.out.println("access granted");
              access=true;
              break;
          }
         else{
              System.out.println("wrong pwd");
              
         }
         
        
      } if (!access){
          System.out.println("locked out");
      } 
      }}