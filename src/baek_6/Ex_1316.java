package baek_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex_1316 {
	
	public static boolean check(String str) {
		
		String o = "", n = "";
		
		List<String> strList = new ArrayList<String>();
		
		for (int j=0; j<str.length(); j++) {
			n = str.substring(j, j+1);
			if (o.equals(n)) {
				continue;
			}else {
				if (strList.contains(n)) {
					return false;
				}else {
					strList.add(n);
					o = n;
				}
			}
			
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		
		int num = sc.nextInt();
		
		for (int i=0; i<num; i++) {
			
			sc.nextLine();
			String str = sc.next();
			
			if (check(str))
				cnt++;
			
		}
		
		System.out.println(cnt);

	}

}
