package sec03_localinnerclass.EX01_AccessMemberAndLocalVariable;

/*지역이너클래스 내부에서 외부 멤버 및 메서드 지역변수 활용*/

class A {
	int a = 3; //필드
	void abc() {
		int b = 5; //지역변수		
		//지역이너클래스
		class B {
			void bcd() {
				System.out.println(a); //필드
				System.out.println(b); //지역변수
				a=5;
				//b=7; //지역이너클래스에서 사용하는 지역변수는 자동으로 final로 선언 
			}
		}		
		B bb = new B();
		bb.bcd();		
	}
}
public class AccessMemberAndLocalVariable {
	public static void main(String[] args) {
		//#1. 객체 생성 및 메서드 호출
		A a = new A();
		a.abc();
	}
}
