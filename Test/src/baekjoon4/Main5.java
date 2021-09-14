package baekjoon4;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int score[] = new int[n];
		double m = 0;
		double sum=0;
		double avg=0;
		for (int i = 0; i < n; i++) {
			score[i] = sc.nextInt();
			if ( score[i] > m) {
				m= score[i];
			}
		}
			for(int i=0; i <n; i++) {
				sum = score[i] / m *100;
				avg +=sum;
			}
		
			System.out.println(avg/n);
			}	
		}	

