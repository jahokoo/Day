package test5;

import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str;
		
		for (int i = 0; i < n; i++) {
			int count = 0;
			int result = 0;

			str = sc.next();
			char[] cArr = str.toCharArray(); // toCharArray�� ����Ͽ� ���ڿ��� char�� �迭�ιٲ�
			
			for (int j = 0; j < cArr.length; j++) {
				if (cArr[j] == 'O') { //char�� �迭�� O�� ���ٸ�
					count++;
					result += count;
					} else {
						count = 0; //X�ϰ�� ī��Ʈ�� 0���� �ʱ�ȭ
					}
				}	System.out.println(result);

			}
		
		}
	}
