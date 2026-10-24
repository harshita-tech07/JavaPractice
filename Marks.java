import java.util.Scanner;
public class Marks {
    public static void main(String[] args) {
      int hindi,maths,eng,totalMarks;
      
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your hindi: ");
        hindi = sc.nextInt();
        System.out.print("Enter your maths: ");
        maths = sc.nextInt();
        System.out.print("Enter your eng: ");
        eng= sc.nextInt();
        totalMarks= maths+eng+hindi;
        double avg=maths+hindi+eng/3.0;
        System.out.print(totalMarks);
         System.out.print(avg);
        
        if (avg >=90) {
            System.out.print("Grade A ");
        } 
        else if (avg >=80 && avg<90) {
          System.out.print("Grade B ");
        } 
        else if (avg>=70 && avg <80){
          System.out.print("Grade C ");
        }
         else if (avg >=60 && avg <70){
             System.out.print("Grade D");
         }
         else if(avg<=60){
             System.out.print("Grade E");
         } else{
         System.out.print("Grade f");
         }
        
       
    }
}
