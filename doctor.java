package java_practice_task1;

public class doctor extends person {

	public doctor() {
		System.out.println("doctor constructor called ......");
	}
	
	void addition (int a,float b) {
		double c= a+b;
		System.out.println("The addition is : " + c);
	}
}
