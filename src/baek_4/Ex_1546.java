package baek_4;

import java.util.Scanner;

public class Ex_1546 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double max=0, total=0, mean=0;
		
		int n = sc.nextInt();
		double[] arr = new double[n];
		
		sc.nextLine();
		
		for (int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			if(max < arr[i])
				max = arr[i];
		}
		
		for (int i=0; i<n; i++) {
			arr[i] = arr[i]/max * 100;
		}
		
		for(int i=0; i<n; i++) {
			total += arr[i];
		}
		
		System.out.println(max);
		System.out.println(n);
		System.out.println();
		System.out.println(total / n);
		
	}

}
