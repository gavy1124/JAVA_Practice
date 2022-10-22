package Git;

import java.io.File;

public class Exception_p02 {

	public static void main(String[] args) {
		try {
			method1();
		}catch(Exception e) {
			System.out.println("main메서드 예외처리완료");
		}
	}
	
	
	static void method1() throws Exception{
		try {
			throw new Exception();
		}catch(Exception e) {
			System.out.println("method1에서 예외처리완료");
			throw e;
		}
	}
	
}
