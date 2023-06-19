
public class Quiz2 {

	
	   public static void main(String[] args) {
		   
	        
	        int tot = 0;
	        int subject1 = 90;
	        int subject2 = 70;
	        int subject3 = 45;
	        double avg = 76.34543;
	        char grade;
	
    System.out.print("세 과목 점수를 입력하시오 : ");
        subject1 = 90;
        subject2 = 70;
        subject3 = 45; // 세과목 점수를 입력받기 위해 연달아서 스캐너 사용
        
        tot = (subject1 + subject2 + subject3);
        avg = (double)((double)tot/3);
        
    
        if (avg >= 90) {
            grade = '수';
        
        } else if (avg >= 80 && avg <90){
            grade = '우';
            
        } else if (avg >= 70 && avg <80) {
            grade = '미';
        
        } else if (avg >= 60 && avg <70) {
            grade = '양';
            
        } else {
            grade = '가';
        }
        
}
