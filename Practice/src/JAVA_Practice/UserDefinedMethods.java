package JAVA_Practice;

public class UserDefinedMethods {

	static int a=77, b=29, c;
	int num1, num2, sum;
	static int x, y, z;
	
	void add2() {
		num1= 67;
		num2= 79;
		sum= num1+num2;
		//System.out.println("The sum of Non-Static method is:"+" "+sum);
	}
	
	static void add() {
		a=10;
		b=20;
		x=100;
		y=200;
		c=a+b;
		System.out.println("The 1st Static Sum is"+" "+c);
	}
	
	static void add1() {
		z=x+y;
		c=a+b;
		System.out.println("The 2nd Static Sum is"+" "+z);
		System.out.println("The 3rd Static Sum is"+" "+c);
	}
	
	public static void main(String[] args) {
		add1();
		add();
		
		UserDefinedMethods udm= new UserDefinedMethods();
		udm.add2();
	}
	
	

}
