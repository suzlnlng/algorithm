package baek_3;

import java.util.Scanner;

public class ex_8393 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			sum += i;
		}
		
		System.out.println(sum);		
		
	}
	
}
