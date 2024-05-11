package task8;

import java.util.Scanner;

public class Task8Firstprogram {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int a= scn.nextInt();
		int b= scn.nextInt();
		int c=scn.nextInt();
		int d= scn.nextInt();
		int sum1=a+b;
		int sum2=c+d;
		if(sum1>sum2) {
			System.out.println("sum of a and b is greater than sum of c and d");
		}
		
		else {
			System.out.println("sum of a and b is less than sum of c and d");
		}
	}

}
