package baek_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

//3 - 6.���� A+B
//������ �Է¹ް� ����ϴ� ����
public class Ex_15552 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for (int i=1; i<=num; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
