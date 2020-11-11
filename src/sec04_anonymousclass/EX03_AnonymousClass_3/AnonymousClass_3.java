package sec04_anonymousclass.EX03_AnonymousClass_3;

/*클래스 정의 및 참조변수명을 사용/미사용의 경우 매개변수 객체 전달*/

interface A {
	public abstract void abc();
}
//#1. 자식클래스를 직접 생성
class B implements A {	
	public void abc() {
		System.out.println("매개변수 전달");
	}
}
class C {
	void cde(A a) {
		a.abc();
	}
}
public class AnonymousClass_3 {
	public static void main(String[] args) {
		C c = new C();		
		//#1. 방법#1 클래스명 O + 참조변수명  O
		A a = new B();
		c.cde(a); //매개변수 전달		
		//#2. 방법#2 클래스명 O + 참조변수명  X		
		c.cde(new B()); //매개변수 전달
	}
}
