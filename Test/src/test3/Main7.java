package test3;

import java.util.Scanner;

public class Main7 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int T = sc.nextInt();
	
	for(int i=1; i <= T; i++) {
		int A = sc.nextInt();
		int B = sc.nextInt();
		int x = i;
		System.out.println("Case #"+x+": "+(A+B));
	}
}
}
