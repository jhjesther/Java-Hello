
public class classMethod {

	class Person{
		private int regiNum;
		private int passNum;
		
	public Person (int rnum, int pnum){
		regiNum = rnum;
		passNum = pnum;
		
	}
	
	public Person(int rnum){
		regiNum = rnum;
		passNum = 0;
	}
	
	void showPersonalInfo()
	
	System.out.println("주민등록 번호: " + regiNum);
    
    if(passNum != 0)
        System.out.println("여권 번호: " + passNum + '\n');
    else
        System.out.println("여권을 가지고 있지 않습니다. \n");
    
    public static void main(string[] args) {
    	//여권 있는 사람의 정보를 담은 인스턴스 생성
    	Person jung = new Person(335577, 112233);
    	
    	//여권 없는 사람의 정보를 담은 인스턴스 생성
    	Person hong = new Person(775544)
    	
    }
	
	
}
