package task8;

import java.util.Scanner;

public class Task8fifthprogram {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int num=scn.nextInt();
		boolean isprime= true;
		if(num<=1) {
			isprime=false;
		}
		else {
			for(int i=2; i<=Math.sqrt(num);i++) {
				if(num%i==0) {
					isprime=false;
					break;
				}
			}
		}
				if(isprime) {
					System.out.println("num is a prime number");
			}
				else {
					System.out.println("num is not a prime number");
		}

	}

}
