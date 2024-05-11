package task8;

import java.util.Scanner;

public class Task8sixthprogram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int number = input.nextInt();
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial*i;
        }

        System.out.println("The factorial of " + number + " is: " + factorial);
    }


	}


