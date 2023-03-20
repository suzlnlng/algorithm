package baek_5;

import java.util.Scanner;

public class Ex_11720 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		int num = sc.nextInt();
		
		sc.nextLine();
		
		String str = sc.next(); 
		
		for (int i=0; i<num; i++) {
			sum += Integer.parseInt(str.substring(i, i+1));
		}
		
		System.out.println(sum);
	
	}

}
