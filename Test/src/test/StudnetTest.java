package test;

import java.util.ArrayList;
import java.util.Scanner;

public class StudnetTest {

	public static void main(String[] args) {
		// Student ��ü����
		Student st1 = new Student("�տ���", "1234");
		Student st2 = new Student("���Ȱ�", "5678");
		Student st3 = new Student("�����", "2020");
		// Student ��ü���� �迭�� ����
		ArrayList<Student> ar = new ArrayList<Student>();

		ar.add(st1);
		ar.add(st2);
		ar.add(st3);
		// �Է¹ޱ� ���� Scanner�� ����
		Scanner sc = new Scanner(System.in);

		// while���� ����Ͽ� �˻��� �ڵ������� ��������ʰ���(���Ѱ˻�)
		while (true) {
			System.out.println("�˻��� �ϰ� �ʹٸ� y, �����ϰ� �ʹٸ� n ");
			String input = sc.next(); // input�̶�� ������ String������ ��ĳ�ʿ��� �Է¹ް���
			if (input.equals("y")) { // �Է°��� y�� ���ٸ�
				System.out.println("�л��� �̸��� �Է��ϼ���.");
				String name = sc.next(); // name�� ��ĳ�ʿ� �Է¹ް���
				boolean flag = false; // flag�� ����Ͽ� �л��� ������ �Ǵ�

				for (Student st : ar) { // for each�� ��� Student�� ������ ���ΰ�����
					if (st.getName().equals(name)) {
						System.out.println(st.getName() + " �л��� �й� �� " + st.getNo() + "�Դϴ�.");
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("�ش��ϴ� �л��� �����ϴ�.");
				}

			} else if (input.equals("n")) {
				break;
			}
		}
		System.out.println("�����մϴ�.");
	}
}
