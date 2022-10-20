package JAVA_Practice;

class A{  // 인터페이스를 사용하면 A 는 안건드려도된다.
	public void method(I i) { //= new C()  // ★★★인터페이스 I를 구현부 완성한놈만 와라★★★
		i.method();
	}
}

interface I{public void method();} // 리모컨삼아 이용

class B implements I{             // B를 움직임
	public void method() {
		System.out.println("B클래스의 메서드");
	}
}

class C implements I {
	public void method() {
		System.out.println("C클래스의 메서드");
	}
}


public class interface_p01 {
	public static void main(String[] args) {
		A a = new A();
		a.method(new C());  // A 가 B를 의존
		
		
	}

}
