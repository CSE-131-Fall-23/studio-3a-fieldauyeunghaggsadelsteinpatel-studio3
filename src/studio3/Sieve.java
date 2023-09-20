package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Up to what number do you want to find the prime numbers?");
		int n = in.nextInt();
		int[] numbers = new int[n];
		for(int i = 0; i < n; i++) {
			numbers[i] = i+2;
		}
		for(int j = 0; j < n-1;j++) {
			System.out.println(numbers[j]);
		}
		//for(boolean cont  = false; cont == false; i++ ) {
			
		//}
				
		
	}

}
