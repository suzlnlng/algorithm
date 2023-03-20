package baek_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex_10798 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<String>();
		
		for(int i=0; i<5; i++) {
			String str = sc.nextLine();
			for(int j=0; j<str.length(); j++) {
				if(list.size() > j) {
					String str_ = list.get(j);
					str_ += str.substring(j, j+1);
					list.set(j, str_);
				}else {
					list.add(str.substring(j, j+1));
				}
				
			}
		}
		
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
		}

	}

}
