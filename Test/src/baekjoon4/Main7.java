package baekjoon4;

import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int c = sc.nextInt();

		for (int i = 0; i < c; i++) {
			int n = sc.nextInt(); // �л��Ǽ�
			int score[] = new int[n]; // n���� ���� �迭
			
			double sum = 0; //�������� 
			
			for (int j = 0; j < n; j++) {
				score[j] = sc.nextInt(); // n���� ���� �Է�
				sum += score[j]; // �Է��� ���� �ջ�
//				System.out.println(sum);
			}
			double avg = sum / n; // �л��� ���
			double count = 0; // ����� �Ѵ� �л� ī��Ʈ***

			for (int k = 0; k < n; k++) { // ��� �Ѵ��л� ���� ã��
				if (score[k] > avg) {
					count++;
//					System.out.println(score[k]);
				}
			}
			System.out.printf("%.3f%%\n", (count / n) * 100); // printf���� % ���� ����Ϸ��� %%
		}

	}
}
