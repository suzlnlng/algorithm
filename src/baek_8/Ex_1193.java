package baek_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_1193 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int start=1;
		int cnt=0, m=0;
		
		if(n == 1) {
			System.out.println("1/1");
		}
		else {
			
			while(start < n) {
				start = start + cnt;
				if(start > n) {
					start -= cnt;
					break;
				}
				cnt++;
			}
			
			m = n - start + 1;
			
			if(cnt%2 == 0) 
				System.out.printf("%d/%d", m, (cnt+1)-m);
			else 
				System.out.printf("%d/%d", (cnt+1)-m, m);
	
		}

	}

}
