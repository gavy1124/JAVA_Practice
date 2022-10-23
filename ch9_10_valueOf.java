package Git;

public class ch9_10_valueOf {

	public static void main(String[] args) {

		int i = 100;
		//1번 (숫자 >> 문자)
		String str = String.valueOf(i);
		System.out.println(str);
		
		//2번 (숫자 >> 문자)
		String str2 = i + "";
		System.out.println(str2);
		
		
		
		//1번(문자 >> 숫자)
		int num = Integer.valueOf("200");
		System.out.println(num);
		//2번(숫자 >> 문자)
		int num2 = Integer.parseInt("200");
		System.out.println(num2);
		
		
		// String join
		System.out.println(String.join("", str,str2));
		System.out.println(String.join(" ~구분자~ ", str,str2));
		
		
		
	}

}
