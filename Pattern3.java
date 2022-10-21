import java.util.Scanner;

public class Pattern3
{
    public static void main(String[] args)
    {
        
        Scanner scan = new Scanner(System.in);

       
        System.out.println("Enter the number of rows needed to print the pattern ");

        int n = scan.nextInt();
        System.out.println("## Printing the pattern ##");
        
        
        for (int i=1; i<=n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i=1; i<=n-1; i++) 
        { 
           
            for (int j = n-1; j >= i; j--)
            {
                System.out.print("*");
            }
           
            for (int k = 1; k < i; k++)
            {
                System.out.print(" ");
            }
            
            System.out.println();
        }
       
    }
}