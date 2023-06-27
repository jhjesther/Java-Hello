package edu.global.prj.shape;

public class Price {
 private double price =0;
 price(double price){
	 this.price = price;
 }
 
 
 class Computer extends Price{
	 public Computer(double price) {
		 super(price);
	 }
 }
 class Speaker extends Price{
	 
	 public Speaker(double price) {
		 super(price);
	 }
 }
}
