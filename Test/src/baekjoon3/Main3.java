package baekjoon3;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int sum  = N;
		int count = 0;
		
		while(true) {
			int A = sum / 10;
			int B = sum % 10;
			sum = B * 10 + (A + B) % 10;
			count++;
			if(N == sum) {
				break;
			}
		}
		
		System.out.println(count);
	}
}