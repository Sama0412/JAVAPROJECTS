package java_practice_task1;

public class car extends vehicle {
int seating_capacity;
String fuel_type;

public car(String brand,String registration_number,double rentel_price,int seating_capacity,String fuel_type) {
	
	super(brand, registration_number, rentel_price);
	this.seating_capacity=seating_capacity;
	this.fuel_type=fuel_type;
	
}

void display() {
	System.out.println("Brand: " + brand);
    System.out.println("Registration Number: " + registration_number);
    System.out.println("Rental Price per day: ₹" + rentel_price);
    System.out.println("Seating Capacity: " + seating_capacity);
    System.out.println("Fuel Type: " + fuel_type);
}

double calculateRentalCost(int days) {
    return rentel_price * days;
}
}
