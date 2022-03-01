package JAVA_Practice;

import SecondPackage.MethodsTypes;

public class RunClass {

	static int sub_result, div_result;
	static int a=20, b=10;
	
	public static void main(String[] args) {
		MethodsTypes type= new MethodsTypes();
		type.add();
		
		sub_result= type.sub();
		System.out.println("Sub= "+sub_result);
		
		type.mul(a, b);
		
		div_result= type.div(a, b);
		System.out.println("Div="+" "+div_result);	
	}
	
	

}
