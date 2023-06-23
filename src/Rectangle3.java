class Rectangle3 {

   private double width, height; // 변수선언 > 게터세터 넣기

   public Rectangle3() {
   }

   public Rectangle3(double width, double height) {
      this.width = width;
      this.height = height;
   }

   public double getArea() {
      return width * height;
   }

}