
public class thisFor {
//this 는 두가지 용도; 객체가 생성되었을때 자기 자신
//this 생성장= 다른 생성자에서 생성

	class BankAccount () {
		int balance = 0;
		
		BankAccount(){
		this(1000);
		System.out.println("생성자 시작");
		
	}
	
/*생성자를 한개라도 개발자가만들면 디폴트를 컴파일러가 만들어주지 않는다*/
		BankAccount(int balance){
			this.balance = balance;
			System.out.println("생성자 시작2")
		}
		
		