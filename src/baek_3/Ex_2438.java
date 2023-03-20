package baek_3;

import java.util.Scanner;

public class Ex_2438 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int i=1; i<=num; i++) {
			String str = "";
			for (int j=1; j<=i; j++) {
				str += "*";
			}
			System.out.println(str);
		}
		

	}

}
