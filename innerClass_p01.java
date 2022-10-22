package Git;

import Git.Outer2.StaticInner;

class Outer2{
	class Inner2{
		int iv = 100;
	}
	static class StaticInner{
		int iv = 200;
		static int cv = 300;
	}

}
public class innerClass_p01 {
	public static void main(String[] args) {
		Outer2 oc = new Outer2(); // 클래스 내부 Instance 클래스 사용시 
		Outer2.Inner2 in = oc.new Inner2();
		System.out.println(in.iv);
		// --------------------------------------------------
		
		
		Outer2.StaticInner st = new Outer2.StaticInner(); // 클래스내부 statc클래스 사용시
		System.out.println(st.iv);
	}
}
