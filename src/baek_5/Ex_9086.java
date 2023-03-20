package baek_5;

import java.util.Scanner;

public class Ex_9086 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			
			sc.nextLine();
			String str = sc.next();
			
			System.out.print(str.charAt(0));
			System.out.print(str.charAt(str.length()-1));
			System.out.println();
			
		}

	}

}
