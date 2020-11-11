package sec04_anonymousclass.EX04_AnonymousClass_4;

/*클래스 미정의 및 참조변수명을 사용/미사용의 경우 매개변수 객체 전달*/

interface A {
	public abstract void abc();
}
class C {
	void cde(A a) {
		a.abc();
	}
}
public class AnonymousClass_4 {
	public static void main(String[] args) {
		C c = new C();		
		//#3. 방법#3 클래스명 X + 참조변수명  O	
		A a = new A() {
			public void abc() {
				System.out.println("매개변수 전달");
			}			
		};
		c.cde(a); //매개변수 전달		
		//#4. 방법#4 클래스명 X + 참조변수명  X		
		c.cde(new A() {
			public void abc() {
				System.out.println("매개변수 전달");
			}			
		}); //매개변수 전달
	}
}
