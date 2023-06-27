package edu.global.prj.shape;

public class Circle extends Shape {

	double radius;
	
	Circle( double rad){
		radius = rad;
	
	@Override
	public double getArea() {
		return radius * radius * Math.PI
	}
	
	}
}
