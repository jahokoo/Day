package test5;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr[] = new int[9];
		int max = 0;
		int count = 0;
		int index = 0;
		for(int i =0; i < arr.length; i++) {
			count++;
			arr[i] = sc.nextInt();
			if(max < arr[i]) {
				max = arr[i];
				index = i+1;
			}if(count == arr.length) {
			System.out.println(max+"\n"+index);
			}
		}
	}

}
