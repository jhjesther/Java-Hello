
public class Parameter {

	public static int add(int num1,int num 2) {
		int result = num1 + num2;
		return result;
	}
	public static int sub(int num1,int num2))
		int result = num1 - num2;
		return result;
		
	public static int mul(int num1,int num2)
		int result = num1 * num2;
		return result;
		
	public static char gradChar(double avg)
		char ch = '가'
		if(avg >=90) {
			ch='수'
			else if(avg>=80)
				ch='우'
					else if(avg>=70)
						ch='미'
							else if(avg>=60)
								ch='양'
								else {
									ch='가'
								}
								return ch;
		}
				
	//함수 만드는 법
	//리턴 타입 함수명(파라미터들){
		리턴값
}	
	
	public static void main(String[] args) {
		System.out.println(add(3,5));
		System.out.println(sub(3,5));
		System.out.println(mul(3,5));
		System.out.println(gradchar(90.8));
		System.out.println(gradchar(80.0));
		System.out.println(gradchar(50.0));
		
	}

}

