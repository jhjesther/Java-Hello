import java.util.Scanner;

class Circle2 {
   private double radius; // 변수선언 > 게터세터 넣기

   public Circle2() {}
   
   public Circle2(double radius) {
      this.radius = radius;
   }
      
   public double getRadius() {
      return radius; // 원의 넓이를 가져오는 함수
   }

   public void setRadius(double radius) { // 외부값받아서 원의넓이를 변경하는 함수
      this.radius = radius;
   }

   public double getArea() {
      return radius * radius * Math.PI; // 원의 넓이 곱하는 함수만듦
   }




     
Circle2 circle;
      
      System.out.print("반지름:");
      
      double radius = sc.nextDouble();
      
      
      
      circle = new Circle2(radius);
      
      System.out.println("넓이는:" + circle.getArea());