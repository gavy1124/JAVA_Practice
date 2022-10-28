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
		
		
		System.out.println("containsAll" + list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		print(list1, list2);
		
		list2.set(3, "AA");
		print(list1, list2);
		
		System.out.println(list1.retainAll(list2));
		print(list1, list2);
		
		list1.add(0, "1");
		print(list1, list2);
		
		list1.add(0, 1);
		System.out.println("-----------------------");
		print(list1, list2);
		
		System.out.println("indexof : " + list1.indexOf("1"));
		
		
		for (int i = list2.size()-1; i >= 0; i--) {
			if(list1.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		System.out.println("-----------------------");
		print(list1, list2);
		
		
		
		
		
		
		
		
	}

	
	public static void print(ArrayList n,ArrayList n2) {
		System.out.println("list1 : " + n);
		System.out.println("list2 : " + n2);
	}
	
	
}
