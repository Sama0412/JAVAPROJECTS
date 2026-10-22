package java_practice_task1;

import java.util.Scanner;

public class Employee {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int Employee_id;
	String Name;
	double basic_salary;
	int allowances;
	
	System.out.println("Enter Your Employee id");
	Employee_id=sc.nextInt();
	
	sc.nextLine();
	
	System.out.println("Enter Your Name");
	Name=sc.nextLine();
	
	sc.nextLine();
	
	System.out.println("Enter Your Basic Salary");
	basic_salary=sc.nextDouble();
	
	System.out.println("Enter your allowancees");
	allowances=sc.nextInt();
	
	double HRA=basic_salary*0.20;
	System.out.println("HRA Is : " +HRA);
	
	double DA= basic_salary*0.10;
	System.out.println("DA is :" +DA);
	
	double Gross_Salary=basic_salary+HRA+DA;
	System.out.println("Gross Salary is :" +Gross_Salary);
	

	System.out.println(" Your Employee id is :" +Employee_id);
	System.out.println("Your Name is :" +Name);
	System.out.println("Your Basic_salary is :" +basic_salary);
	System.out.println(" your allowancees is :" +allowances);
	System.out.println("Gross Salary is :" +Gross_Salary);
	
}
}
