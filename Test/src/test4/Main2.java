package test4;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			if (A > 0 && B < 10)
				System.out.println(A + B);

		}sc.close();

	}
}