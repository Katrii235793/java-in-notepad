
import java.util.Scanner;

public class Pattern1
{
    public static void main(String[] args)
    {
      
        Scanner scan = new Scanner(System.in);

       
        System.out.println("Enter the number of rows needed to print the pattern ");

        int n = scan.nextInt();
        System.out.println("## Printing the pattern ##");
        
        for (int i = 1; i <= n; i++)
        {
            for (int j = n-1; j>=i; j--)
            {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= n; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //scan.close();
    }
}