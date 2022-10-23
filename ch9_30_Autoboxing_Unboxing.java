package Git;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import oop.basic.Calc;

public class ch9_30_Autoboxing_Unboxing {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100); // jdk 1.5 이전버전에서는 에러 >>> 이제가능 
		list.add(new Integer(100));
		
		
		
		
		//Integer i = list.get(0);
		int i = list.get(0);
		
		
		System.out.println(i);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
