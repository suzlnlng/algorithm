package baek_4;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_10810 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n=0, m=0, start=0, end=0, ball=0;
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		int[] arr = new int[n];
		
		for (int i=0; i<m; i++) {
			sc.nextLine();
			start = sc.nextInt();
			end = sc.nextInt();
			ball = sc.nextInt();
			
			for (int j=start; j<=end; j++) {
				arr[j-1] = ball;
			}
			
		}
		
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}

	}

}
