package java_practice_task1;

public class calculatebonus {

	 public static void main(String[] args) {
	        EmployeeBonusCalculator calc = new EmployeeBonusCalculator();

	       
	        double salary1 = 50000;
	        double bonus1 = calc.calculateBonus(salary1, 10);
	        double total1 = calc.calculateSalaryWithBonus(salary1, 10);
	        System.out.println("Employee 1: Salary = " + salary1 + 
	                           ", Bonus = " + bonus1 + 
	                           ", Total = " + total1);

	     
	        double salary2 = 60000;
	        double bonus2 = calc.calculateBonus(salary2, 15);
	        double total2 = calc.calculateSalaryWithBonus(salary2, 15);
	        System.out.println("Employee 2: Salary = " + salary2 + 
	                           ", Bonus = " + bonus2 + 
	                           ", Total = " + total2);

	      
	        double salary3 = 45000;
	        double bonus3 = calc.calculateBonus(salary3, 12);
	        double total3 = calc.calculateSalaryWithBonus(salary3, 12);
	        System.out.println("Employee 3: Salary = " + salary3 + 
	                           ", Bonus = " + bonus3 + 
	                           ", Total = " + total3);
	    }
	}

