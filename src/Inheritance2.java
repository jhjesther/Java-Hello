//상속은 그닥좋은게 아님
public class Inheritance2 {

class MobilePhone{
	protected String number;
	
	public MobilePhone(String num) {
		number = num;
		
		public void answer() {
			System.out.println("Hi~from"+ number);
		}
	}
}
}

class SmartPhone extends MobilePhone{}
private String androidver;

public SmartPhone(String num, String ver) {
	super(num);
	androidver = ver;
	
	public void playApp() {
		System.out.println("App is running in" + androidVer);
		
		
	}
	
	
	public static void main(String[] args) {
		Smartphone ph1 = new SmartPhone("010-555-777", "Nougat");
		MobilePhone ph2 = new Smartphone("010-999-333, "Nougat");"
				ph1.answer();
		        ph1.playApp();
		        System.out.println();
		        
		        ph2.answer();
		        ph2.playApp();
	}
}