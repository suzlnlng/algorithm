package baek_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_10757 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long a = Long.parseLong(st.nextToken());
		System.out.println(a);
		String b_ = st.nextToken();
		System.out.println(b_);
		long b = Long.parseLong(b_);
		System.out.println(b);
		
		
		System.out.println(a+b);

	}

}
