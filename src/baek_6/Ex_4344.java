package baek_6;

import java.util.Scanner;

public class Ex_4344 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		
		for (int i=0; i<c; i++) {
			
			sc.nextLine();
			
			int num=0;
			double total=0, mean=0, result=0;
			
			num = sc.nextInt();
			
			int[] arr = new int[num];
			
			for (int j=0; j<num; j++) {
				arr[j] = sc.nextInt();
				total += arr[j];
			}
			
			mean = total / num;
			
			for (int j=0; j<num; j++) {
				if (arr[j] > mean)
					result++;
			}

			System.out.printf("%.3f%%%n", result/num*100.0);

		}
		

	}

}
