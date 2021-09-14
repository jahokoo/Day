package baekjoon4;

import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int c = sc.nextInt();

		for (int i = 0; i < c; i++) {
			int n = sc.nextInt(); // 학생의수
			int score[] = new int[n]; // n명의 점수 배열
			
			double sum = 0; //성적의합 
			
			for (int j = 0; j < n; j++) {
				score[j] = sc.nextInt(); // n명의 성적 입력
				sum += score[j]; // 입력한 성적 합산
//				System.out.println(sum);
			}
			double avg = sum / n; // 학생의 평균
			double count = 0; // 평균이 넘는 학생 카운트***

			for (int k = 0; k < n; k++) { // 평균 넘는학생 비율 찾기
				if (score[k] > avg) {
					count++;
//					System.out.println(score[k]);
				}
			}
			System.out.printf("%.3f%%\n", (count / n) * 100); // printf에서 % 문자 출력하려면 %%
		}

	}
}
