
public class ImmutableString {

	public static void main(String[] args) {
		
		String str1 = "Simple String";
		
		String str2 = "Simple String";

		String str3 = new String("Simple String");
		
		String str4 = new String("Simple String");
		
		// 참조변수의 참조 값 비교
		
		if (str1.equals(str2))
			
			System.out.println("str1과 str2는 동일 인스턴스 참조");
		
		else
			System.out.println("str1과str2는 다른 인스턴스 참조");
		
		// 참조 변수의 참조 값 비교

		if (str3 == str4)//다른 언어에서는.
			
			System.out.println("str3과 str4는 동일 인스턴스 참조");
		
		else
			
			System.out.println("str3과 str4는 다른 인스턴스 참조");
	}
}
