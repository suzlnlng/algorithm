package baek_3;

import java.util.Scanner;

public class ex_25304 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int check = 0;
		int n, price = 0;
		
		int total = sc.nextInt();
		sc.nextLine();
		int num = sc.nextInt();
		
		for (int i=1; i<=num; i++) {
			sc.nextLine();
			
			n = sc.nextInt();
			price = sc.nextInt();
			
			check += n*price;
			
		}
		
		if(check == total) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
