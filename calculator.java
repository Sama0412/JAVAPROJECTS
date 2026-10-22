package java_practice_task1;

public class calculator {

	int a;
	int b;
	
	void addition(int a,int b) {
		int c=a+b;
		System.out.println("The Addition Is :" +c);
	}
	
	void substraction(int a,int b) {
		int c=a-b;
		System.out.println("The Substraction is :" +c);
	}
	
	void multiplication(int a,int b) {
		int c=a*b;
		System.out.println("The Substraction is :" +c);
	}
	
	void division(int a,int b) {
		if (b!=0) {
			int c=a/b;
			System.out.println("The Substraction is :" +c);
		}
		else {
			System.out.println("Division by zero not allowed");
		}
	}
}
