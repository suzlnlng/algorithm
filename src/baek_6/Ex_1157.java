package baek_6;

import java.util.Scanner;

public class Ex_1157 {

	public static void main(String[] args) {
		
		int max=0;
		char c = ' ';
		
		int[] arr = new int[26];
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next().toUpperCase();
		
		for (int i=0; i<str.length(); i++) {
			char ca = str.charAt(i);
			arr[ca-65] += 1;
		}
		
		for (int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				c = (char)(i+65);
			}else if(max == arr[i]) {
				c = '?';
			}

		}
		
		System.out.println(c);

	}

}
