package baek_3;

import java.util.Scanner;

public class Ex_2439 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int i=1; i<=num; i++) {
			String str = "";
			for(int j=1; j<=num-i; j++) {
				str += " ";
			}
			for(int k=1; k<=i; k++) {
				str += "*";
			}
			System.out.println(str);
		}

	}

}
