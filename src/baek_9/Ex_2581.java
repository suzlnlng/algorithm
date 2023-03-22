package baek_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_2581 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		int min=0, total=0;
		
		for (int i=M; i<=N; i++) {

			for(int j=2; j<=i; j++) {
				
				if(i%j==0) {
					if(i==j) {
						if(total == 0) {
							min = j;
						}
						total += j;
					}else {
						break;
					}
				}
				
			}
			
		}
		
		if(total == 0) {
			System.out.println(-1);
		}else {
			System.out.println(total);
			System.out.println(min);
		}

	}

}
