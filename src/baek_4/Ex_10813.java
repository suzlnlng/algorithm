package baek_4;

import java.util.Scanner;

public class Ex_10813 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n=0, m=0, i=0, j=0, k=0, tmp=0;
		
		n = sc.nextInt();
		m = sc.nextInt();
		sc.nextLine();
		
		int[] arr = new int[n];
		for(k=0; k<arr.length; k++) {
			arr[k] = k+1;
		}
		
		for (k=0; k<m; k++) {
			i = sc.nextInt() - 1;
			j = sc.nextInt() - 1;
			
			tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
			
			sc.nextLine();
			
		}
		
		for(k=0; k<arr.length; k++) {
			System.out.print(arr[k]);
			System.out.print(" ");
		}

	}

}
