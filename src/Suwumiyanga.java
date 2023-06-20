
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



