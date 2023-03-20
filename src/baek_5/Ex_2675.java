package baek_5;

import java.util.Scanner;

public class Ex_2675 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int i=0; i<num; i++) {
			
			sc.nextLine();
			int r = sc.nextInt();
			String str = sc.next();
			
			String new_str = "";
			for (int j=0; j<str.length(); j++) {
				for(int k=0; k<r; k++) {
					new_str += str.substring(j, j+1);
				}
			}
			
			System.out.println(new_str);
			
		}
		

	}

}
