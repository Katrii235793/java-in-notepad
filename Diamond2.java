import java.util.Scanner;

public class Diamond2 {

   public static void main(String[] args) {
      // take input
      Scanner scan = new Scanner(System.in);
      int n = 0;
      System.out.print("Enter N value:: ");
      n = scan.nextInt();
      printSpaceDiamond(n);
   }

   private static void printSpaceDiamond(int n) {
      if(n <= 0)
      System.out.println("Enter Positive Number");

     
      for(int i=1; i <= n; i++) {
       
         for(int j = i; j <= n; j++) {
            System.out.print("*");
         }
       
         for(int k = 1; k < 2*i-1; k++) {
            System.out.print(" ");
         }
        
         for(int l=i; l <= n; l++) {
            System.out.print("*");
         }
        
         System.out.println();
      }

     
      for(int i=n-1; i >= 1; i--) {
         
         for(int j=n; j >= i; j--) {
            System.out.print("*");
         }
        
         for(int k=1; k < 2*i-1; k++) {
            System.out.print(" ");
         }
       
         for(int l=n; l >= i; l--) {
            System.out.print("*");
         }
         
         System.out.println();
      }
   }

}