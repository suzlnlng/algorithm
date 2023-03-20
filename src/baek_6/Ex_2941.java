package baek_6;

import java.util.Scanner;

public class Ex_2941 {

	public static void main(String[] args) {
		
		String[] dict = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		for (int s=0; s<dict.length; s++) {
			str = str.replace(dict[s], "1");
		}

		System.out.println(str.length());

	}

}
