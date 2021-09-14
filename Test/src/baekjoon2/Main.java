package baekjoon2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	

	for (int n = sc.nextInt() ; n <= 9; n++) {
		for(int i =1; i <=9; i++) {
			
			System.out.println(n+ " * " +i+ " = "+ n*i);
		}break;
	}
	
}
}
