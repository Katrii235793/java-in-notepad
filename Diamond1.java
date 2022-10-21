


import java.util.Scanner;

public class Diamond1 {

   public static void main(String[] args) {
     
      Scanner scan = new Scanner(System.in);
      int n = 0;
      System.out.print("Enter a value ");
      n = scan.nextInt();
      printDiamond(n);
   }

   private static void printDiamond(int n) {
      if(n <= 0)
      System.out.println("Invalid Entry.Enter a Positive Number!");

      
      for(int i=1; i<=n; i++) {
         
         for(int j = i; j<=n; j++) {
            System.out.print(" ");
         }
         
         for(int k = 1; k <= 2*i-1; k++) {
            System.out.print("*");
         }
         
         System.out.println();
      }

      
      
      
      for(int i=n-1; i >=1; i--) {
        
         for(int j=n; j >= i; j--) {
            System.out.print(" ");
         }
        
         for(int k=1; k <= 2*i-1; k++) {
            System.out.print("*");
         }
         System.out.println();
      }
   }

}
			
			
			
			
		
			
			
			
			
		