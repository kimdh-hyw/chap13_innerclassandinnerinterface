package sec04_anonymousclass.EX01_AnonymousClass_1;

/*인터페이스를 상속한 이너클래스를 생성하여 인터페이스 객체 생성*/

class A {
	C c = new B();	
	void abc() {
		c.bcd();
	}	
	class B implements C {
		public void bcd() {
			System.out.println("인스턴스 이너클래스");			
		}
	}
}
interface C {
	public abstract void bcd();
}
public class AnonymousClass_1 {
	public static void main(String[] args) {
		//#1. 객체 생성 및 메서드 호출
		A a = new A();
		a.abc(); //인스턴스 이너클래스
	}
}
