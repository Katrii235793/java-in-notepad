
import java.util.Scanner;

public class Pattern2
{
    public static void main(String[] args)
    {
        
        Scanner scan = new Scanner(System.in);

        
        System.out.println("Enter the number of rows needed to print the pattern ");

        int n = scan.nextInt();
        System.out.println("## Printing the pattern ##");
        
        for (int i=1; i<=n; i++)
        {
            
            for (int j=n; j >=i; j--)
            {
                if( i == 1 || j == i || j == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
           
            for (int k=1; k<i; k++)
            {
                System.out.print(" ");
            }
            
            System.out.println();
        }
     
    }
}