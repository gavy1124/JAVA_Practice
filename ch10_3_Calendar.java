package Git;

import java.util.Calendar;

public class ch10_3_Calendar {

	public static void main(String[] args) {

		Calendar today = Calendar.getInstance();
		
		System.out.println("올해연도 : " + today.get(Calendar.YEAR));
		
		System.out.println("금월 : " + (int)(today.get(Calendar.MONTH)+1));
		
		System.out.println("금일 : " + today.get(Calendar.DATE));
		
		System.out.println("1>일요일 : " + today.get(Calendar.DAY_OF_WEEK)); //1이 일요일
		
		System.out.println("올해 몇번째주 : " + today.get(Calendar.WEEK_OF_YEAR));
		
		System.out.println("이달의 몇번째주 : " + today.get(Calendar.WEEK_OF_MONTH));
		
		System.out.println("올해 몇일째 : " + today.get(Calendar.DAY_OF_YEAR));
		
		System.out.println("[시간] 0>오전, 1>오후 : " + today.get(Calendar.AM_PM));
		
		System.out.println("24시간 : " + today.get(Calendar.HOUR_OF_DAY) + ":"+today.get(Calendar.MINUTE));
		
		System.out.println("이달의 마지막일 : " + today.getActualMaximum(Calendar.DATE));
		
		
		
		
		
		
		
		
		
		
		
//		int thisYear = cal.get(Calendar.YEAR);
//		System.out.println(thisYear);
//		
//		int lastDayOfMonth = cal.getActualMaximum(Calendar.DATE);
//		System.out.println(lastDayOfMonth);
//		
//		int firstDayOfMonth = cal.getActualMinimum(Calendar.DATE);
//		System.out.println(firstDayOfMonth);
	}

}
