//LG 에서 만든 2017년형 32인치 TV
class TV{
	
   String brand;
   int year;
   int inch;
   
   TV(String brand,int year, int inch){
      
	  this.brand = brand;
      this.year = year;
      this.inch = inch;      
   }
   
   void show() {
      System.out.println(brand+"에서 만든 "+year+"년형 "+inch+"인치 TV");
      
      
   }
}