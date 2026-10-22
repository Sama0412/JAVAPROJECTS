package java_practice_task1;

public class testinheritance {
public static void main(String[] args) {
	
	car c = new car("Tata", "MH14HT3526", 91000, 4, "Diesel");
	
	c.display();
	System.out.println(c.calculateRentalCost(3));
}
}
