package day12;

public class DBox {
//지네릭 문법 = 데이터 타입을 파라미터화 시킴
}class DBox<L , R>{
	private L left;
	private R right;
	
	public void set(L o, R r) {
		left = o;
		right = r;
	}
	
	@override
	public String toString() {
		return left + " & " + right;
	}
	
	class MultiTypeProgram{
	public static void main(String[] args) {
		DBox<String, Integer> box = new DBox<String, Integer>();
		DBox<Apple, Orange>box2 = new DBox<>;
		
		box.set("Apple", 25);
		System.out.println(box);
		
		
		System.out.println(box);
	}
}
