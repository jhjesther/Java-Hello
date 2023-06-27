//메소드 오버라이딩 = 상속관계에서 똑같은 함수(이름, 리턴타입, 파라미터갯수와 종류)로 바디만{}(실행 내용만) 달리 하는 것
 public class Yummy {
 
class Cake{
	 public void yummy() {
		 System.out.println("Yummy Cake");
	 }
 }
}

class Cheesecake extends Cake{
//Cake의Yummy메소드 오버라이딩
	public void yummy() {
		System.out.println("Yummy Cheese Cake");
	}
}

public static void main(String[] args) {
	Cake c1 = new Cheesecake();
	CheeseCake c2 = new CheeseCake();
	
	c1.yummy();
	c2.yummy();
}

//

class Robot{
	public void work() {
		
	}
	
class DanceRobot extends Robot{
	public void work() {
		System.out.println("춤추는 로봇입니다")
	}
}
	
class DrawRobot extends Robot{
	public void work() {
		System.out.println("그림을 그리는 로봇입니다.");
	}
}

class YummyCakeOverriding{
	public static void main(String[] args) {
		Robot[] arrRobot = {new DanceRobot(), new DrawRobot(), new WashRobot()))}
		
	}
}
	public void dance() {}	
}