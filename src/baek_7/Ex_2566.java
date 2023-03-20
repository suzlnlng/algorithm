package baek_7;

import java.util.Scanner;

public class Ex_2566 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i=0, j=0, k=0, l=0, max=0;
		
		for(i=1; i<=9; i++) {
			
			for(j=1; j<=9;j++) {
				
				int a = sc.nextInt();
				
				if(a>=max) {
					max = a; k=i; l=j;
				}
				
			}
			
		}
		
		System.out.println(max);
		System.out.print(k + " " + l);

	}

}
