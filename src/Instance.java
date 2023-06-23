
public class Instance {
	//static == (New 객체생성보다) 먼저 한 번 올려 공유(어디에다 method area에다)
	//static 변수 = 공유 변수 = 클래스 변수 =정적 변수
	class InsCnt{
		static int instNum = 0;
	}

	 	public Instance{
	 		
			static int instNum = 0;
			
	 		Instance(){
				instNumm++;
					System.out.println("인스턴스 생성: " + instNum);
			}
		}
		
		class classvar{
			public static void main(String[] args) {
				InstCnt cntl = new Instcnt();
				InstCnt cnt2 = new Instcnt();
				InstCnt cnt3 = new Instcnt();
			}
		}

}
