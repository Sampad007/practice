package SecondPackage;

public class MethodsTypes {
	int x,y,z;
	
	//No I/P, No O/P
	public void add() {
		x=10;
		y=20;
		z=x+y;
		System.out.println("Sum="+" "+z);
	}
	
	//No I/P, With O/P
	public int sub() {
		x=10;
		y=20;
		z=y-x;
		return z;
	}
	
	//With I/P, No O/P
	public void mul(int a, int b) {
		x=a;
		y=b;
		z=x*y;
		System.out.println("Mul="+" "+z);
	}
	
	//With I/P, With O/P
	public int div(int a, int b) {
		x=a;
		y=b;
		z=x/y;
		return z;
	}
	
	void default1() {
		System.out.println("Default Method");
	}
	
	void public1() {
		System.out.println("Public Method");
	}
	
	void private1() {
		System.out.println("Private Method");
	}
	
	void protected1() {
		System.out.println("Protected Method");
	}
}
