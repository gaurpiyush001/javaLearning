package encapsulation;

public class EncapsulationIntro {
	
	public static void main(String[] args) {
		
		Laptop l1 = new Laptop();
		//l1.price = 23;---->by this way anyone can manipulate our data, it lacks in data hiding with respect to securities reasons
		l1.setPrice(100);
		
	}
	
	//1.)public keyword here displays the visibility of function, so that it can be access by some other package classes also(FROM ANYWHERRE WE CAN ACCES IT)
	//we have to write explicitly public keyword to make it available for external packages, 
	//2.)By default, it is only accessible to that package and its children package, if we omit public keyword, encapsulation is achieved by packages 
	
	//3.)ACCESS MODIFIERS ----> "private" keyword specifies that, doWork function will only be accessible in EncapsulationIntro class ONLY
	private void doWork() {
		System.out.println("Working Working");
	}
	
	//4) protected (access modifier) -->this is used when we want any property or function or variable which is present in parent to be only accessed by its CHILDREN ONLY
	
//	EncapsulationIntro obj = new EncapsulationIntro();
}


class Laptop{
	
	int ram;
	private int price;
	
	public int getPrice() {
		return this.price;
	}
	
	public void setPrice(int Price) {
		//validation before changing the properties
		boolean isAdmin = false;
		if(!isAdmin) {
			System.out.println("You cannot set the price as not admin!!");
		} else {
			this.price = Price;
		}
		
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}
	
}
