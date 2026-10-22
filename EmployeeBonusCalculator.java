package java_practice_task1;

public class EmployeeBonusCalculator {

	public double calculateBonus(double salary, double percentage) {
        return (salary * percentage) / 100;
    }

  
    public double calculateSalaryWithBonus(double salary, double percentage) {
        double bonus = calculateBonus(salary, percentage);
        return salary + bonus;
    }
}
