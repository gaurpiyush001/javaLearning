import java.util.Scanner;//importing scanner class from java.util package which is provided by JDK 

public class FirstJavaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int marks = 18;
		float avgMarks = 19.345f;
		boolean pass = true;
		String name = "Piyush";
		long bigNum = 1213232323244l;*/
		//int can store upto 2X10^9 and long can store upto 2X10^18
		//System.out.println("Piyush");
		
		
		
		//Taking User Input
		Scanner sc = new Scanner(System.in);//instantiating an Object from Scanner class, which will be used to call various methods to take suitable input
		
		int age = sc.nextInt();//ek integer value user se Input lena
		//sc.nextFloat(); //to take input as float value
		//sc.nextLine(); //to take input as String
		System.out.println(age);
		sc.close();
		
		//int markss[] = new int[5];//creating an array object
		//int marks[] = {1, 2, 3, 4, 5, 5};
		/*for(int i = 0 ; i <5;i++)
				System.out.println(markss[i]);
		*/
		System.out.println(average(3, 6));
		
		//Exception Handling
		int a[]=  new int[3];
		
		try {
			System.out.println(a[4]);
		} catch(Exception err) {
			System.out.println(err.getLocalizedMessage());
		}
	}
	
	//Method or Function
	//returnType functionName(arguments) {}
	
	static int average(int firstNum, int secNum) {
		int sum = firstNum + secNum;
		return sum/2;
	}
}
