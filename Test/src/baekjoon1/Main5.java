package baekjoon1;

import java.util.Scanner;

public class Main5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int H = sc.nextInt();
	int M = sc.nextInt();
	

	if(M >= 45) 
	System.out.println(H+" "+(M-45));
	 else if (M < 45) 
	if(H==0) 
		System.out.println(23+" "+(M+15));
	 else if (H > 0) 
		System.out.println((H-1)+" "+(M+15));
	
	 
}
}