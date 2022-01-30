package basics;

public class Abstraction {
	
	public static void main(String[] args) {

		Audi a1 = new Audi();
		a1.start();
		
	}

}

/////////////////////CAR IS A CONCEPT,
///////////////////But Audi and BMW are actual Models


class Audi extends Car {

	void start() {
		System.out.println("Audi starting");
	}
	
	
}

class BMW extends Car{

	void start() {
		System.out.println("BMW Starting");
	}
	
}


//////------->IMPORTANT<-------------/////////
//NOTE ---> In real world we will not have a case in which we creating an Object directly from class Car, Its of NO USE
//so for this we make that class abstract by using ABSTRACT KEYWORD
abstract class Car {
	
	int price;
	
	//To make a function/method abstract we need to first MAKE THAT CLASS ABSTRACT  
	
	//Abstract method/function, we do not have the function definition
	//(we don't write body of that abstract function in abstract class WE SPECIFY that in children classes)
	// We need to Override this Abstract functions in which they are extending
	abstract void start();
	
}
