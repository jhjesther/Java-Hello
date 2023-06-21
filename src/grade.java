
public class grade {
	"- 클래스 Grade
	- 데이타멤버 : 국어, 영어,수학,총점,평균
	- 함수 : 생성자//국어영어수학 초기화
	- getAvg() // 평균
	- getGrade() //평균에 따른 수우미양가"
	

getTotal = kor + math + eng

getAverage= (kor + math + eng) / 3


}

/*import java.util.Scanner;
 
public class 문제4 {
 
    public static void main(String[] args) {
 
        
        int tot = 0;
        int subject1 = 0;
        int subject2 = 0;
        int subject3 = 0;
        double avg = 0.0;
        char grade;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("세 과목 점수를 입력하시오 : ");
            subject1 = scanner.nextInt();
            subject2 = scanner.nextInt();
            subject3 = scanner.nextInt(); // 세과목 점수를 입력받기 위해 연달아서 스캐너 사용
            
            tot = (subject1 + subject2 + subject3);
            avg = (double)((double)tot/3);
            
        
            if (avg >= 90) {
                grade = 'A';
            
            } else if (avg >= 80 && avg <90){
                grade = 'B';
                
            } else if (avg >= 70 && avg <80) {
                grade = 'C';
            
            } else if (avg >= 60 && avg <70) {
                grade = 'D';
                
            } else {
                grade = 'F';
            }
            
            
            System.out.printf("당신의 평균:  %.1f", avg); // 소수점 첫째자리까지 나타내기 위해 %.1f 를 사용 
                                                    // %.1f %n은 줄을 바꾸는 것이므로 %n은 사용 x
            
            System.out.print( ", 당신의 학점: " + grade);
            //if 문에서 마지막 결과가 같은 경우 마지막에 한번만 작성해도 된다.
        
        
        
        scanner.close();*/