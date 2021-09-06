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
			char[] cArr = str.toCharArray(); // toCharArray를 사용하여 문자열을 char형 배열로바꿈
			
			for (int j = 0; j < cArr.length; j++) {
				if (cArr[j] == 'O') { //char형 배열의 O가 들어간다면
					count++;
					result += count;
					} else {
						count = 0; //X일경우 카운트를 0으로 초기화
					}
				}	System.out.println(result);

			}
		
		}
	}
