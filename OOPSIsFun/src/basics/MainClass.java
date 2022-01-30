package basics;

import encapsulation.EncapsulationIntro;

//NOTE*** in java every object which created from a any class have a super class parent named Object

///////////////-----------------ENCAPSULATION------------/////////////////////
//->1.) used for data hiding, data protection
//->2.) encapsulation is achieved with the help of packages, 
//Encapsulation means to bind both the variables and the methods on which they are associated
//with the help of encapsulation we achieve DATA HIDING

/////////////////////////////------ABSTRACTION-------------//////////////////////////
//In this we are not hiding data because of security reason (as in encapsulation), but here we want to reduce complexity
//IN JAVA we can achieve ABSTRACTION by ------------------> abstract Keyword and Interfaces

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
		
		Person p3 = new Person(23, "Ayush");
		
		/*
		System.out.println(p1.name + " " + p1.age);
		System.out.println(p2.name + " " + p2.age);
		*/
		
		p1.eat();
		
		//////-->below walk function is showing Polymorphism, as it is taking multiple forms(one is without args and other with arguments)
		//there are two types of polymorphism -> 1.) compiler time   2.)run time polymorphism
		p2.walk();
		p1.walk(23);
		
		p3.eat();
		
		System.out.println("No. of times contructor called" + Person.count);
		
		
		Developer d1 = new Developer(24, "Piyush Gaur full");
		d1.walk();
		
//		EncapsulationIntro obj = new EncapsulationIntro();
		//obj.doWork();//doWork function will be called from some other package because its visibility is public
		
	}

}


class Manager extends Person{
	
	public Manager(int age, String name) {
		super(age, name);
	}
	
}

//below is child class of person
//Extends keyword help us inherit all the properties and methods of parent(i.e Person) class to that child class(i.e Developer)
class Developer extends Person {
	
	public Developer(int age, String name) {
		super(age, name); 
		//super keyword--> is used to call parent's constructor of that class 
	}
	
	//below walk() function sets an example of RunTime Polymorphism
	void walk() {
		System.out.println("Developer "+ name + "walking in development style");
	}
	
}




//NOTE EACH CLASS HAVE TWO THINGS -: 1.)property 2.)methods(behavior)
class Person{
	
	////////////////////////////////////PROPERTIES///////////////////////////////////////
	//"protected" (access modifier) -->this is used when we want any property or function or variable which is present in parent to be only accessed by its CHILDREN ONLY
	protected String name;//----------->DATA HIDING<--------------
	int age;
	
	
	//static keyword-: gives class a property....//If we want a variable that will be constant for class, then we use static keyword
	static int count;//this is now a property of class means to access this property we don't need to create an object
	
	////////////////////////Constructor are special functions which we call to make Object out of classes//////////////////////////////////////
	//1.) The name of constructor is same as that of name of class
	//2.) We do not write any return type in constructor declaration
	//3.) We access that by public keyword
	//4) when we want to initialize our properties as soon as we create object from classes than we can use constructors with arguments
	public Person() {//Default constructor called by new keyword, 
		count++;
		System.out.println("creating/constructing an object");
	}
	
	//constructor overloading, means when we make more than one more constructors declaration in our class, like now we have two constructors
	public Person(int age, String name) {
		
		//we can use this keyword as below to call one constructor from another constructor
		this();//we use this to call default constructor from inside a constructor
		
		this.name = name; 
	    this.age = age;
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
	
	void doWork() {
		System.out.println("Person is working.");
	}
	
}
