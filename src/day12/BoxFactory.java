package day12;

public class BoxFactory {
	public static <T>Box<T>makeBox(T o){
		Box<T>box = new Box<T>();
		box.set(o);
		return box;
	}
}

Class GenericMethodBoxMaker{
	public static void main(String[] args) {
		
		Box<String>sBox = BoxFactory.<String>makeBox("Sweet");
		System.out.println(sBox.get());
		
		Box<Double> dBox = BoxFactory.<Double>makeBox(7.59);
		System.out.println(dBox.get());
	}
}