package java_practice_task1;

class ElectricityBill {
	private int units;

	// Constructor
	ElectricityBill(int units) {
		this.units = units;
	}

	// Method to get units
	public int getUnits() {
		return units;
	}

	// Method to calculate bill
	public double calculateBill(int units) {
		double bill = 0;
		if (units <= 100) {
			bill = units * 5;
		} else {
			bill = (100 * 5) + ((units - 100) * 7);
		}
		return bill;
	}

	// Method to calculate tax (10% tax for example)
	public double calculateTax(double amount) {
		return amount * 0.10;
	}

	// Method to display bill
	public void displayBill() {
		double billAmount = calculateBill(units);
		double tax = calculateTax(billAmount);
		double total = billAmount + tax;

		System.out.println("----- Electricity Bill -----");
		System.out.println("Units Consumed: " + units);
		System.out.println("Bill Amount: ₹" + billAmount);
		System.out.println("Tax (10%): ₹" + tax);
		System.out.println("Total Payable: ₹" + total);
	}

	// Test the class
	public static void main(String[] args) {
		ElectricityBill e1 = new ElectricityBill(80);
		ElectricityBill e2 = new ElectricityBill(150);
		ElectricityBill e3 = new ElectricityBill(220);

		e1.displayBill();
		e2.displayBill();
		e3.displayBill();
	}
}
