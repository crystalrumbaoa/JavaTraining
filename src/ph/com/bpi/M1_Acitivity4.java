package ph.com.bpi;

import java.util.Scanner;

public class M1_Acitivity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Determine category
        if (age < 18) {
            System.out.println("Minor");
        } else if (age >= 18 && age <= 59) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }
        
	}

}
