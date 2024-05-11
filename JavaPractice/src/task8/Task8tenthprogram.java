package task8;

import java.util.Scanner;

public class Task8tenthprogram {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scn.nextInt();
        
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        
        System.out.println("Number of digits: " + count);
    }

	}


