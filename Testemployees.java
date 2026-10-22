package java_practice_task1;

public class Testemployees {
public static void main(String[] args) {
	Manager m = new Manager("Samadhan", 1001, 25000, "IT", 10);
	
	Employees e= new Employees("Santosh", 2001, 50000);
	
	m.show();
	e.display();
}
}
