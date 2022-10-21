import java.util.Scanner;
import java.util.*;

public class ArrayException {
    public String getPriceDetails() {
        Scanner scan = new Scanner(System.in);
         int n;
        System.out.println("Enter the number of elements in the array");
        int l = scan.nextInt();
        int[] a = new int[l];

        System.out.println("Enter the price details");

		for(int i=0;i<a.length;i++) 
		{
			a[i]=scan.nextInt();
                }
         System.out.println("Enter the index of the array");
         
         try {
        	 n=scan.nextInt();
        	 return("The array element is"+a[n]);
         }catch(ArrayIndexOutOfBoundsException e) {
        	 return("Array index out of range");
         }catch(InputMismatchException e) {
        	 return("Input was not in correct format");
         }
    }
    public static void main (String args[]) {
    	ArrayException obj=new ArrayException();
    	System.out.println(obj.getPriceDetails());
         }  	 
        	 
         }
        	 
         