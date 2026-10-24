class X1 {
    int m;          // instance variable
    static int n;   // static variable
}
class X2 {
   public static void main(String[] args) {

        X1 x = new X1();
      System.out.println(x.m);  
        System.out.println(X1.n); 
}
}	
