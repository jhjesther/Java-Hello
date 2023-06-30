package day12; 

public class makeBox {

}








Box<String> sBox = BoxFactory.<String>makeBox("Sweet");
System.out.println(sBox.get());


Box<Double> dBox = BoxFactory.<Double>makeBox(7.59);
System.out.println(dBox.get());