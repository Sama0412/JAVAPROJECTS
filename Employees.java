package java_practice_task1;

public class Employees {
String name;
int emo_id;
double salary;

public Employees(String name,int emo_id,double salary) {
	this.emo_id=emo_id;
	this.name=name;
	this.salary=salary;
	
}

void display() {
	
	System.out.println("name : " +name + " , emp_id : " + emo_id + " , salary : " + salary);
}
}
