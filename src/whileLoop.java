import java.util.Scanner;

public class whileLoop {
	public static void main(String[] args) {

	class Grade2 {
	   int kor, eng, math; //인스턴트 변수

	   void setGrade(int kor, int eng, int math) { 
	      this.kor = kor;
	      this.eng = eng;
	      this.math = math; 
	   }

	   double getAvg() { 
	      return (kor + eng + math) / 3.0;
	   }

	   char getGrade() {
	      char ch = '가';
	      double avg = getAvg(); 
	      
	      if(avg >=90) {
	         ch='수';
	      }
	      else if (avg >=80) {
	         ch='우';
	      }
	      else if (avg >=70) {
	         ch='미';
	      }
	      else if (avg >=60) {
	         ch='양';
	      }
	      
	      return ch;
	   }
	}

	while (true) {
		
	Scanner sc;
	Grade2 grade;
	int kor, eng, math;
	String name;
	///////////////////
	
	while(true) {
		sc = new Scanner(system.in);
		
		System.out
	
	
	
	Rectangle3 rectangle;
		
	  System.out.print("국어");
	  double korean = sc.nextDouble();
	  
	  System.out.print("수학");
	  doublel math = sc.nextDouble();
	  
	  System.out.print("영어");
	  doublel english = sc.nextDouble();
	  
	  average = 
	  
	  main()
	  System.out.println("average is:" + average());
	  
	}
		
		
		System.out.print("Continue?")
		String choice = sc.next();
		if((choice.compareToIgnoreCase("yes")==0)||choice.equals("y"))
			continue;
		else
			break;
	}
	
	System.out.println("종료되었습니다")
	
}
