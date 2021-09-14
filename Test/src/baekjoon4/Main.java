package baekjoon4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int N = sc.nextInt();
	int arr[] = new int[N];
	int max = Integer.MIN_VALUE;
	int min = Integer.MAX_VALUE;
	
	for(int i = 0; i <arr.length; i++) {
	 arr[i] = sc.nextInt();
	if(min > arr[i]) {
		min = arr[i];
	}
	if(max < arr[i])
	max = arr[i];
	}
	System.out.println(min+" "+max);
	}
	
	}



