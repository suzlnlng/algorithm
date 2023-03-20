package baek_7;

import java.util.Scanner;

public class Ex_2738 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n=0, m=0;
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		int[][] sum = new int[n][m];
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<n; j++) {
				for(int k=0; k<m; k++) {
					sum[j][k] += sc.nextInt();
				}
			}
			
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
	
	/*
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n=0, m=0;
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		int[][] A = new int[n][m];
		int[][] B = new int[n][m];
		int[][] sum = new int[n][m];
		
		//배열 만들기
		for (int i=0; i<2; i++) {
			if(i==0) {
				for (int j=0; j<n; j++) {
					for(int k=0; k<m; k++) {
						A[j][k] = sc.nextInt();
					}
					sc.nextLine();					
					
				}
			}else {
				for (int j=0; j<n; j++) {
					for(int k=0; k<m; k++) {
						B[j][k] = sc.nextInt();
					}
					sc.nextLine();
				}
					
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(A[i][j] + B[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
	*/

}
