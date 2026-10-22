package java_practice_task1;

public class employe {

	int id;
	String name;
	double salary;
	
	public employe() {
		this(0,"unknown",0.0);
	}
	
	employe(int id,String name, double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	void display() {
		System.out.println("id is : " + id + " ,  name : " + name + " ,  salary is : " + salary);
	}
}
