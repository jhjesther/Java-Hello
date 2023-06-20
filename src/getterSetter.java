
public class getterSetter {
	
	//Object Oriented Programing(객체지향언어) = 자바
	
	class Student{
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

	class Circle{
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
	class Rectangle2{
		double width,height;
		
		void setwidthHeight(double width,double height) {
			
			this.width=width;
			this.height = height;
			
			double getArea()
			return width*height;
			
		}
	}
//클래스와 객체-인스턴스의 차이
	public class MainClass {
		
	   public static void main(String[] args) {
		  
		  Rectangle2 rec = new Rectangle2();
		  
		  rec.setwidthHeight(10, 5);
		  
		  System.out.println(rec);
		  
		  System.out.println(rec.getArea());
		 

		  
		  
		  
		  ///////////////////////////////////////////////////////////
	      int num = 0;
	      
	      Circle circle = new Circle();
	      
	      circle.setRadius(10);
	      
	      double area = circle.getArea();
	      
	      System.out.println(area);
	      
	   }

	}
