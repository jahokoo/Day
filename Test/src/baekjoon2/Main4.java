package baekjoon2;

import java.io.*;

public class Main4 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= T; i++) {
			String s = br.readLine();
			String arr[] = s.split(" "); //�������Ÿ� ����split�� �����
			  int A = Integer.parseInt(arr[0]); 
			  int B = Integer.parseInt(arr[1]);
			
			bw.write((A+B)+"\n");
			
		}
		bw.flush(); //�ð��ʰ��� ���� for�� �ۿ��ٰ� ����
		bw.close();

	}

}
