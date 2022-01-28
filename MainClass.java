package basics;

public class MainClass {
	
	//this below static keyword suggest that if we want to access the main method of MainClass then it is not necessary to create an Object of MainClass
	public static void main(String[] args) {
//		System.out.println("Hello World");
		Person p1 = new Person();
		p1.age = 22;
		p1.name = "Piyush";
		
		Person p2 = new Person(); //this will take fresh new memory
		p2.age = 27;
		p2.name = "Kuch Bhiiii!!";
		
		/*
		System.out.println(p1.name + " " + p1.age);
		System.out.println(p2.name + " " + p2.age);
		*/
		
		p1.eat();
		p2.walk();
		p1.walk(23);
		
		System.out.println("No. of times contructor called" + Person.count);
	}

}

//NOTE EACH CLASS HAVE TWO THINGS -: 1.)property 2.)methods(behavior)
class Person{
	
	////////////////////////////////////PROPERTIES///////////////////////////////////////
	String name;
	int age;
	
	
	//static keyword-: gives class a property
	static int count;//this is now a property of class means to access this property we don't need to create an object
	
	public Person() {
		count++;
		System.out.println("creating/constructing an object");
	}
	
	////////////////////////////////BEHAVIOR(METHODS)////////////////////////////////
	void walk() {
		System.out.println(name + " is Walking.");
	}
	
	void eat() {
		System.out.println(name + " is eating.");
	}	
	
	void walk(int steps) {
		System.out.println(name + " walked " + steps);
	}
}
