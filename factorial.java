import java.util.Scanner;
public class factorial
    {
        public static void main(String args[])
        {
        int i,f=1;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the nmbr: ");
        int n=s.nextInt();
        if(n==0 || n==1)
        {
            System.out.println("Factorial is 1");
        }
        else
        {
            for(i=1;i<=n;i++)
            {
                f=f*i;                
            }
        System.out.println("Factorial is :"+f);
        }
        }
    }