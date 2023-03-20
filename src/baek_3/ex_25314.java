package baek_3;

import java.util.Scanner;

public class ex_25314 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String result = "";
		int n = sc.nextInt();
		
		for (int i=1; i<=n/4; i++) {
			result += "long ";
		}
		
		result += "int";
		
		System.out.println(result);

	}

}
