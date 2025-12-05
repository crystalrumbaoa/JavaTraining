package bpi.com.ph;

import java.util.Scanner;

public class M1_Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		String age = scanner.nextLine();
		int ageInt = Integer.parseInt(age);
		double ageDouble = (double)(ageInt);
		
		System.out.println("Your age as int: " + ageInt);
		System.out.println("Your age as double: " + ageDouble);



	}

}
