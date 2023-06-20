//Object Oriented Programing(객체지향언어) = 자바
class Student {
   int age;
   char gender;

   public char getGender() {
      return gender;
   }

   public void setGender(char gender) {
      this.gender = gender;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }
}

class Circle {
   double radius;

   public double getRadius() {
      return radius;
   }

   public void setRadius(double radius) {
      this.radius = radius;
   }

   public double getArea() {
      return radius * radius * Math.PI;
   }
}

class Rectangle2 {
   double width, height;

   void setWidthHeight(double width, double height) {
      this.width = width;
      this.height = height;
   }

   double getArea() {
      return width * height;
   }
}

//클래스와 객체=인스턴스 의 차이
class StarPrint {

   void printTriangle(int num) {

      for (int i = 1; i <= num; i++) {
         for (int j = 1; j <= i; j++) {
            System.out.print("*");
         }
         System.out.println();
      }

   }

   void printReverseTriangle(int num) {

      for (int i = 1; i <= num; i++) {
         for (int j = i; j <= num; j++) {
            System.out.print("*");
         }
         System.out.println();
      }
   }
}

class GetSum {
   int num;

   void setNum(int num1) {
      num = num1;
   }

   int sum() {

      int sum = 0;
      for (int i = 1; i <= num; i++) {
         sum = sum + i;
      }

      return sum;
   }
}
class Grade{
	
	void printGrade(int grade) {
		for(grade>=80);
			System.out.println(수);
		for(grade>=70);
			System.out.println(우);
		for(grade>=60);
		    System.out.println(미);
				for(grade>=50);
						System.out.println(양);
					for(grade<50);
					    System.out.println(가);		
			
	get average(sum/3);
	get Grade();
	
	public class Average {
		 
	    public static void main(String[] args) {
	        //numbers
	        int[] nums = {1, 2, 3};
	         
	        float sum = 0;
	         
	        //compute sum
	        int i=0;
	        while(i < nums.length) {
	            sum += nums[i];
	            i++;
	        }
	         
	        //compute average
	        float average = (sum / nums.length); 
	         
	        System.out.println("Average : "+average);
	    }
	
	
	}
}
class Gugudan {

   void printGugu(int dan) {

      for (int i = 1; i <= dan; i++) {
         for (int j = 1; j < 10; j++) {
            System.out.println(i + " x " + j + " = " + i * j);

         }
      }
      
   }
}

public class MainClass {
   public static void main(String[] args) {

      Gugudan gugudan = new Gugudan();
      gugudan.printGugu(10); // 1단부터 10단까지 출력
      gugudan.printGugu(20); // 1단부터 20단까지 출력

      ///////////////////////////////////////
      GetSum getsum = new GetSum(); // 1)객체 생성
      int num; // 2)num 변수 선언

      num = 100;

      getsum.setNum(num); // 3)getsum 객체의 setNum함수 호출, num값 50 저장

      num = getsum.sum(); // 4)getsum객체의 sum함수 호출, 1-50까지 합 구함
      System.out.println(num);

      getsum.setNum(1000);
      num = getsum.sum(); // 4)getsum객체의 sum함수 호출, 1-50까지 합 구함
      System.out.println(num);

      /////////////////////////////////////
      StarPrint strPrint = new StarPrint();

      strPrint.printTriangle(3);
      System.out.println();
      strPrint.printTriangle(50);
      System.out.println();

      strPrint.printReverseTriangle(5);

   }

