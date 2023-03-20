package baek_3;

import java.util.Scanner;

public class Ex_11022 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			
			sc.nextLine();
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.printf("Case #%d: %d + %d = %d\n", i, a, b, a+b);
			
		}
		

	}

}
