package ph.com.bpi;

import java.util.Scanner;

public class M1_Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();

        System.out.println("Sum: " + sum(num1,num2));
        System.out.println("Difference: " + difference(num1, num2));
        System.out.println("Product: "+ product(num1, num2));
    }
		

	   public static int sum(int num1, int num2) {
	        return num1 + num2;
	    }

	    public static int difference(int num1, int num2) {
	        return num1 - num2;
	    }

	    public static int product(int num1, int num2) {
	        return num1 * num2;

	    }

}
