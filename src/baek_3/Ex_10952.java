package baek_3;

import java.util.Scanner;

public class Ex_10952 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,b = 1;
		
		while(true) {
			
			a = sc.nextInt();
			b = sc.nextInt();
			
			if (a==0 && b==0) {
				break;
			}
			
			System.out.println(a+b);
			sc.nextLine();
			
		}

	}

}
