package sec01_instanceinnerclass.EX02_UseMembersOfOuterClass;

/*이너클래스 내부에서 외부 클래스의 필드/메서드 사용*/

class A {
	int a = 3;
	int b = 4;
	void abc() {
		System.out.println("A 클래스 메서드");
	}	
	//인스턴스 이너클래스 정의
	class B {
		int a = 5;
		int b = 6;
		void abc() {
			System.out.println("B 클래스 메서드");
		}
		void bcd() {
			// #1. inner class의 멤버 호출 또는 사용
			System.out.println(a); //this. 자동추가  5
			System.out.println(b); //this. 자동추가  6
			abc(); //this. 자동추가  B 클래스 메서드
			
			// #2. outer class의 멤버 호출 또는 사용
			System.out.println(A.this.a); //this. 자동추가  3
			System.out.println(A.this.b); //this. 자동추가  4
			A.this.abc(); //this. 자동추가  A 클래스 메서드
		}
	}
}
public class UseMembersOfOuterClass {
	public static void main(String[] args) {
		//#1. outer class객체 생성
		A a = new A();		
		
		//#2. inner class 객체 생성
		A.B b = a.new B();
		b.bcd();		
	}
}




























