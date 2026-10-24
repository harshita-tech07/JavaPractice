import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

        
//         System.out.print("Enter number of elements: ");
//         int n = sc.nextInt();

//         int arr[] = new int[n];

        
//         System.out.println("Enter " + n +" elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();}
     
//         int greatest = arr[0];
//         int smallest = arr[0];

//         for (int i = 1; i < n; i++) {
//             if (arr[i] > greatest) {
//                 greatest = arr[i];
//             }
//             if (arr[i] < smallest) {
//                 smallest = arr[i];
//             }
//         }

        
//         System.out.println("Greatest element: " + greatest);
//         System.out.println("Smallest element: " + smallest);
//     }
// }




 
    
      
        int a[] = new int[3];
        int i,f=0,elesearch;
        Scanner sc = new Scanner(System.in);

    System.out.print("enter element which want to search: ");
      for ( i = 0; i < 3; i++) {
         a[i] = sc.nextInt();
           
      }
      System.out.print("enter element which want to search: ");
         elesearch=sc.nextInt();
      for(i=0;i<=2;i++){
          if(elesearch==a[i]){
              f=1;
          } break;
      }
     if(f==1){
         System.out.print("element found ");
     } else{
         System.out.print("element not found ");
     }
    }
}
    

