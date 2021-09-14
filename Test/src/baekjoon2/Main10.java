package baekjoon2;

import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		for(int i =1; i <=N; i++) {
		for(int j =N ; j > 0; j--) {
			if(i<j) {
				System.out.print(" ");
			}else {
			    System.out.print("*");
			}
		}System.out.println();
	}
	}
}
