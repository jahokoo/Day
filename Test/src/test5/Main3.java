package test5;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int A= sc.nextInt();
	int B= sc.nextInt();
	int C= sc.nextInt();
	int sum = A*B*C;
	int count[] = new int[10];
	
	while (sum > 0) {
		count[sum % 10]++;
		sum /= 10;
		}
	for(int i =0; i < count.length; i++) {
		System.out.println(count[i]);
	}
		}
	}
 
