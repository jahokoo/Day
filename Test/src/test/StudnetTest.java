package test;

import java.util.ArrayList;
import java.util.Scanner;

public class StudnetTest {

	public static void main(String[] args) {
		// Student 객체생성
		Student st1 = new Student("손오공", "1234");
		Student st2 = new Student("저팔계", "5678");
		Student st3 = new Student("사오정", "2020");
		// Student 객체들을 배열에 넣음
		ArrayList<Student> ar = new ArrayList<Student>();

		ar.add(st1);
		ar.add(st2);
		ar.add(st3);
		// 입력받기 위해 Scanner를 선언
		Scanner sc = new Scanner(System.in);

		// while문을 사용하여 검색이 자동적으로 종료되지않게함(무한검색)
		while (true) {
			System.out.println("검색을 하고 싶다면 y, 종료하고 싶다면 n ");
			String input = sc.next(); // input이라는 변수를 String형으로 스캐너에서 입력받게함
			if (input.equals("y")) { // 입력값이 y와 같다면
				System.out.println("학생의 이름을 입력하세요.");
				String name = sc.next(); // name을 스캐너에 입력받게함
				boolean flag = false; // flag를 사용하여 학생의 유무를 판단

				for (Student st : ar) { // for each문 사용 Student의 내용을 전부가져옴
					if (st.getName().equals(name)) {
						System.out.println(st.getName() + " 학생의 학번 은 " + st.getNo() + "입니다.");
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("해당하는 학생이 없습니다.");
				}

			} else if (input.equals("n")) {
				break;
			}
		}
		System.out.println("종료합니다.");
	}
}
