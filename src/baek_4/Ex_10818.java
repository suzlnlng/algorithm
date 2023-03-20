package baek_4;

import java.util.Scanner;

public class Ex_10818 { 

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num=0;
		long min=1000000, max=-1000000;
		
		num = sc.nextInt();
		
		sc.nextLine();
		
		for(int i=0; i<num; i++) {
			
			int n = sc.nextInt();
			
			if(n < min) {
				min = n;
			}
			if(n > max) {
				max = n;
			}
		}
		
		System.out.printf("%d %d", min, max);
		
	}

}
