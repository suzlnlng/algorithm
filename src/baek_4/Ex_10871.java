package baek_4;

import java.util.Scanner;

public class Ex_10871 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[sc.nextInt()];
		
		int a = sc.nextInt();
		
		sc.nextLine();
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i=0; i<arr.length; i++) {
			if(arr[i] < a) {
				System.out.print(arr[i]);
				System.out.print(" ");
			}
			
		}

	}

}
