package baek_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_2292 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int s = 2, cnt = 1;
		
		if(n ==1)
			System.out.println(1);
		else {
			while(s <= n) {
				s = s + (6*cnt);
				cnt++;
			}
			System.out.println(cnt);
		}
		
	}

}
