package basics;

// How do we achieve ABSTARCTION through INTERFACES
//INTERFACES is used in achieving many things, in which abstraction is one of them
//In Interfaces, we use implements keyword instead of extends 
public class Interfaces implements Carr,Persson {
	
	public static void main() {
		
		Interfaces c1 = new Interfaces();
		Interfaces c2 = new Interfaces();

		c1.walk();
		c2.start();
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("starting starting");
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Walking walking");
	}

}


//we need to use interface keyword to declare a interface
interface Carr {
	//Inside that Interface, all the functions/methods are By-Default Public and Abstract
	//THIS IS THE MAJOR DIFFERENCE BETWEEN ACHIEVING ABSTRACTION via Abstraction keyword(we can make concrete function) and via Interfaces(this provide true abstraction)
	void start();
	
}


interface Persson {
	
	void walk();
	
}