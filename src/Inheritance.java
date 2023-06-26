import java.util.Scanner;
	
//기존에 있던 것, 건들면 안된다=건들 수도 없는것
class A{
	private int a;
	public A() {
	public A(int a) {
		this.a = a;
	}
	public void aa() {
		System.out.println(a);
	}
}
//reuse 하기위해 상속 개념이 나왔음.
class B extends A{
	private int b = 20;
	//기본적으로 부모의 함수 및 변수의 접근 방법으 super=부모
	
	public B(int b) {
		this.b = b;
		}
	
	public B(int a, int b) {
		//this.a=a;
		//super.a=a;
		//super(a);//부모 생상저 접근 방법 = 슈퍼 생성자
		super(a);
		
		this.b=b;
		
	}
	
	public void bb() {
		aa();
		this.aa();
		super.aa();
		System.out.println(b);
	

	}
}