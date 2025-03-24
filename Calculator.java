package calculator;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		int operator , n1, n2;
		System.out.println(" 1 - Add \n 2 - Subtract \n 3 - Multiply \n 4 - Divide ");
		System.out.println("Choose Operator: ");
		Scanner sc = new Scanner(System.in);
		operator =  sc.nextInt();
		System.out.print("Enter first number : ");
		n1 = sc.nextInt();
		System.out.print("Enter second number : ");
		n2 = sc.nextInt();
		
		int result = 0;
		switch(operator)
		{		
		case 1: 
			result = n1+n2;
			break;
		case 2: 
			result = n1-n2;
			break;
		case 3: 
			result = n1 * n2;
			break;
		case 4: 
			if (n2 == 0) {
			    System.out.println("Division by zero is not allowed.");
			}
			else { 
			result = n1/n2;
			}
			break;
			
	    default:
	    	System.out.println("Fail");
		}
		System.out.println( " The result is : " + result);
		

	}

}
