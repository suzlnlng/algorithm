package baek_6;

import java.util.Scanner;

public class Ex_10988 {
	
	public static int palindrome(String str) {
		
		int j = 1;
		
		for (int i=str.length()/2-1; i>=0; i--) {
			
			if(str.charAt(i) != str.charAt(i+j))
				return 0;
			
			j+=2;
			
		}
		
		return 1;		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int m = str.length()/2;
		if (str.length()%2 != 0) {
			str = str.substring(0, m) + str.substring(m+1);			
		}
		
		System.out.println(palindrome(str));
		
	}

}
