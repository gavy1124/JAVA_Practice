package Git;

import java.util.ArrayList;
import java.util.Collections;

public class ch11_7 {

	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1, list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
	}

	
	public static void print(ArrayList n,ArrayList n2) {
		System.out.println(n);
		System.out.println(n2);
	}
	
	
}
