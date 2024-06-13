import java.util.Scanner;

import java.util.InputMismatchException;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
	    
	    try {
	        int num1 = scanner.nextInt();
	        int num2 = scanner.nextInt();
	        /*
	        1. Error: division by zero
	        2. Error: wrong value type
	        */
	        //your code goes here
	        
	        if(num2 > 0) {
	        	int result = num1/num2;
	        	System.out.println(result);
	        }
	        else if(num2 == 0) {
	        	throw new ArithmeticException();
	        }
	        else {
	        	throw new InputMismatchException();
	        }
	        
	        
	    } catch(ArithmeticException ae) {
	        System.out.println("Error: division by zero");
	    } catch(InputMismatchException ime){
	    	System.out.println("Error: wrong value type");
	    }
	}
}