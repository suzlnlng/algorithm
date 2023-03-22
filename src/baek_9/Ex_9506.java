package baek_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_9506 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			
			int n = Integer.parseInt(br.readLine());
			
			if(n == -1)
				break;
			
			String str = " = 1"; 
			
			int total = 1;
			
			for(int i=2; i<n; i++) {
				
				if (n%i==0) {
					
					//System.out.println(i);
					
					total += i;
					str = str + " + " + i;
					
				}
				
			}
			
			if(n == total) {
				System.out.println(n + str);
			}else {
				System.out.println(n + " is NOT perfect.");
			}
			
		}
		
	}

}
