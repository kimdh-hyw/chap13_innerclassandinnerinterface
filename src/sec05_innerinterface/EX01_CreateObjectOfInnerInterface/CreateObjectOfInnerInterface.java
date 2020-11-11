package sec05_innerinterface.EX01_CreateObjectOfInnerInterface;

/*이너인터페이스의 두 가지 객체 생성 방법*/

class A {
	interface B {
		public abstract void bcd();
	}	
}
class C implements A.B {
	public void bcd() {
		System.out.println("이너인터페이스 구현 클래스 생성");
	}
}
public class CreateObjectOfInnerInterface {
	public static void main(String[] args) {
		//객체생성 방법 #1 (자식클래스 직접 생성)
		A.B ab = new C();
		C c = new C();		
		c.bcd();
		
		//객체생성 방법 #2 (익명이너클래스 생성)		
		A.B b = new A.B() {			
			public void bcd() {
				System.out.println("익명이너클래스로 객체 생성");
			}
		};	
		b.bcd();		
	}
}
