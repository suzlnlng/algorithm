package baek_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_2775 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[15][15];
		
		for (int i=0; i<15; i++) {
			int sum = 0;
			for (int j=0; j<15; j++) {
				if (i == 0) {
					arr[i][j] = j;
				}else {
					sum += arr[i-1][j];
					arr[i][j] = sum;
				}
			}
			
		}
		
		for (int i=0; i<t; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			System.out.println(arr[k][n]);
		}
		
		

	}

}
