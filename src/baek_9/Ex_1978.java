package baek_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_1978 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int cnt = 0;
		
		for (int i=0; i<N; i++) {
			
			int n = Integer.parseInt(st.nextToken());
			
			if (n==1)
				continue;
		
			for (int j=2; j<=n; j++) {
				if(n%j==0) {
					if(j==n) {
						cnt++;
					}else {
						break;
					}
				}
				
			}

		}
		
		System.out.println(cnt);
		

	}

}
