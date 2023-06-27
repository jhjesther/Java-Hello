//인터페이스 안에 올수 있는 것은 함수구현(X) -> 추상메서드 와 상수만 올수 있음
//인터페이스 자손이 구현하라.

//인터페이스를 사용하는 이유 
//1.선배들이 사용 하기 때문에(표준 = 강제 = 규약 = 프린트 드라이버)
//2.다중 상속지원

interface Printable {
   abstract public void print(String doc); // 함수선언 = 함수정의 =  abstract = 추상메서드
}

interface Movable {
   abstract public void move(); // 함수선언 = 함수정의 =  abstract = 추상메서드
}

class Printer implements Printable,Movable {

   @Override
   public void print(String doc) {
      System.out.println(doc);      
   }

   @Override
   public void move() {
      System.out.println("움직입니다.");   
      
   }
}
class SamSungPrinter{
	public void printSamsung(String doc) {
		System.out.println(doc + "프린트 되었습니다.");
	}
class LGprinter{
	public void printLG(String doc) {
		System.out.println(doc + "프린트 되었습니다.");
	}	
	
interface Printable{
	abstract void print(String doc);
	
class SamPrinter implements Printable{
	public void print(String doc) {
		System.out.println("From Samsung printer");
		System.out.println(doc);
	}
}
class LGprinter implements Printable{
	public void print(String doc) {
		System.out.println("From LG printer");
		System.out.println(doc);
	}
}
public static void main([]String args) {
	String myDoc = "This is a report about..."
			
}

