package baek_2;

import java.util.Scanner;

public class ex_2480 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int award,number = 0;
		int maxNum = 0;
		int cnt = 1;
		int[] nArray = new int[3];
		
		for (int i=0; i<nArray.length; i++) {
			nArray[i] = sc.nextInt();
		}
		
		for (int i=0; i<nArray.length; i++) {
			if(i==0)
				maxNum = nArray[i];
			for(int j=0; j<i; j++) {
				if (nArray[j] == nArray[i]) {
					cnt++;
					number = nArray[i];
					break;
				}else {
					if (maxNum < nArray[i]) 
						maxNum = nArray[i];
				}
			}
		}
		
		if (cnt==3) {
			award = 10000 + (number * 1000);
		}else if(cnt==2) {
			award = 1000 + (number * 100);
		}else {
			award = maxNum * 100;
		}

		System.out.println(award);
		
	}

}
