package baek_3;

import java.util.Scanner;

public class ex_10950 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b = 0;
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			
			sc.nextLine();
			a = sc.nextInt();
			b = sc.nextInt();
			
			System.out.println(a+b);
			
		}
		

	}

}
