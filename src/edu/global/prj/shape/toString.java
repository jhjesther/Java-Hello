package edu.global.prj.shape;
class Rectangle {
	   private int width;
	   private int height;
	   
	   public int getWidth() {      
	      return width;
	   }
	   public void setWidth(int width) {
	      this.width = width;
	   }
	   public int getHeight() {
	      return height;
	   }
	   public void setHeight(int height) {
	      this.height = height;
	   }
	   
	   @Override
	   public String toString() {
	      return "가로:" + width + "세로:" + height;
	   }
	   
	   //int num = (int) 3.14
	   @Override
	   public boolean equals(Object obj){
	      
	      Rectangle rec = (Rectangle) obj; // 자식 = 부모 되는 케이스트 자식 = (자식)부모 시켜서 부모에 있는 주소에 자식이 미리 메모리에 올라가 있어야함
	      
	      if( (this.width == rec.width) && (this.height == rec.height))
	         return true;
	      
	      return false;
	   }

	   
	}