

class TV{
public class colorTV {
private int size;


}
class colorTV extends TV 

public static void main(String[] args) {
	colorTVmyTV = new colorTV(32,1024);
	myTV.printProperty();
}
32인치 1024컬러
--------------------------------------------------------------------------------------------------
public void bb() {
	aa();
	this.aa();
	super.aa();
	System.out.println(b);
	----------------------------------------------------------------------------------------------------
	class Vehicle {
		  protected String brand = "Ford";        // Vehicle attribute
		  public void honk() {                    // Vehicle method
		    System.out.println("Tuut, tuut!");
		  }
		}

		class Car extends Vehicle {
		  private String modelName = "Mustang";    // Car attribute
		  public static void main(String[] args) {

		    // Create a myCar object
		    Car myCar = new Car();

		    // Call the honk() method (from the Vehicle class) on the myCar object
		    myCar.honk();

		    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
		    System.out.println(myCar.brand + " " + myCar.modelName);
		  }
		}