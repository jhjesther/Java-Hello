
public class Suwumiyanga {
	
}

 public static void main(String[] args)
 {
  System.out.println("성적을 입력하세요 : "+args[0]);

  int score = Integer.parseInt(args[0]);

 

  if(0<score & score<=100)
  {

   //switch문 사용
   switch (score/10)
   {
   case 10:
   case 9:
    System.out.println("입력하신 값 "+score+"점은 수입니다.");
    break;
   case 8:
    System.out.println("입력하신 값 "+score+"점은 우입니다.");
    break;
   case 7:
    System.out.println("입력하신 값 "+score+"점은 미입니다.");
    break;
   case 6:
    System.out.println("입력하신 값 "+score+"점은 양입니다.");
    break;
   default:
    System.out.println("입력하신 값 "+score+"점은 가입니다.");
    break;
   }

  }

  else{
   System.out.println("0~100까지의 점수를 입력해주세요");
  }

 }
}

 

 2014/08/05

 점수(1~100)를 입력받고 수우미양가 성적 출력하기(if문)

 

package homework0805;

public class Example1
{
 public static void main(String[] args)
 {
  System.out.println("성적을 입력하세요 : "+args[0]);

  int score = Integer.parseInt(args[0]);

 

  if(90<=score & score<=100){
   System.out.println("입력하신 값 "+score+"점은 수입니다.");
  }
  else if(80<=score & score<90){
   System.out.println("입력하신 값 "+score+"점은 우입니다.");
  }
  else if(70<=score & score<80){
   System.out.println("입력하신 값 "+score+"점은 미입니다.");
  }
  else if(60<=score & score<70){
   System.out.println("입력하신 값 "+score+"점은 양입니다.");
  }
  else{
   System.out.println("입력하신 값 "+score+"점은 가입니다.");
  }
 }

}

//

import java.util.Scanner;

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
        
        
        
        scanner.close();


