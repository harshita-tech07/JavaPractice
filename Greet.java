import java.util.Scanner;
 class Greet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int a;
        System.out.println("enter the value a");
           a= sc.nextInt();
       if (a>=12&&a<12){
        System.out.println("good morining");
       } else if(a>=12 && a<18){
         System.out.println("good afternoon");
       }
        else if(a>=18 && a<12){
            System.out.println(" good evening");
         } else {
            System.out.println(" out of range");
         } sc.close()
        ;}

 }

