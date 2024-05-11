package task8;

import java.util.Scanner;

public class Task8ninethprogram {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int age= sc.nextInt();
		
		if(age>=60) {
			System.out.println("The Person is Senior Citizen");
		}
		else {
			System.out.println("The Person is not Senior citizen");
		}
	}

}
