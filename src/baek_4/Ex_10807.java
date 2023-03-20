package baek_4;

import java.util.Scanner;

public class Ex_10807 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt=0, v = 0;
		
		int num = sc.nextInt();
		
		sc.nextLine();
		
		int[] arr = new int[num];
		
		for (int i=0; i<num; i++) {

			arr[i] = sc.nextInt();
			
		}
		
		sc.nextLine();
		
		v = sc.nextInt();
		
		for (int i=0; i<num; i++) {
			if(arr[i] == v) {
				cnt++;
			}
		}
		
		System.out.println(cnt);		

	}

}
