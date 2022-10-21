package practiceoct18;

import java.util.Scanner;

public class ArithmeticSwitch {

	public static void main(String[] args) {
		int a, b;
	       Scanner s=new Scanner(System.in); 
	       System.out.println("Enter First Number: ");
	       a=Integer.parseInt(s.nextLine());
	       System.out.println("Enter Second Number: ");
	       b=Integer.parseInt(s.nextLine());
	       
	       while(true){
	           System.out.println("Select any of the following Option...");
	           System.out.println("1. Add");
	           System.out.println("2. Subtract");
	           System.out.println("3. Multiply");
	           System.out.println("4. Divide");
	           System.out.println("5. Exit");
	           System.out.println("Type your selection here: ");
	           
	        String str=s.nextLine();
	        switch(str) {
	        case "1":
                System.out.println("Sum = "+(a+b));
                break;
            case "2":
                System.out.println("Difference = "+(a-b));
                break;
            case "3":
                System.out.println("Product = "+(a*b));
                break;
            case "4":
                System.out.println("Division => Quotient= "+(a/b)+" Remainder= "+(a%b));
                break;
            case "5":
                System.exit(0);
            default:
                System.out.println("Invalid Entry!!");
                break;
                    
              
        }
	       }
	}
}