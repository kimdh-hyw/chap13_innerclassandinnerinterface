package sec02_staticinnerclass.EX01_CreateObjectAndAccessMember;

/*정적이너클래스에서의 외부멤버 사용 및 객체 생성*/

class A {
	int a = 3;
	static int b = 4;
	void method1() {
		System.out.println("instance method");
	}
	static void method2() {
		System.out.println("static method");
	}	
	//static inner class
	static class B {
		void bcd() {
			//#1.필드 사용
			//System.out.println(a); //static은 static만 포함 가능 
			System.out.println(b);
			//#2.메서드 호출
			//method1();//static은 static만 포함 가능
			method2();
		}
	}
}
public class CreateObjectAndAccessMember {
	public static void main(String[] args) {
		//#1. static inner class의 객체 생성
		A.B b = new A.B();
		//#2. 메서드 호출
		b.bcd();
	}
}




























