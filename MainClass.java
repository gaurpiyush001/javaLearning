package basics;

public class MainClass {
	
	public static void main(String[] args) {
//		System.out.println("Hello World");
		Person p1 = new Person();
		p1.age = 22;
		p1.name = "Piyush";
		
		Person p2 = new Person(); //this will take fresh new memory
		p2.age = 27;
		p2.name = "Kuch Bhiiii!!";
		
		System.out.println(p1.name + " " + p1.age);
		System.out.println(p2.name + " " + p2.age);
		p1.eat();
		p2.walk();
		p1.walk(23);
	}

}

//NOTE EACH CLASS HAVE TWO THINGS -: 1.)property 2.)methods(behavior)
class Person{
	
	////////////////////////////////////PROPERTIES///////////////////////////////////////
	String name;
	int age;
	
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
