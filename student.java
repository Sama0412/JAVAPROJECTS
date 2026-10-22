package java_practice_task1;

import java.util.Scanner;



public class student {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String name;
	int Roll_no;
	int age;
	int m1,m2,m3,m4,m5,Total;
	double Avg;
	char Grade;

	
	System.out.println("Enter your name ");
	name=sc.nextLine();
	
	System.out.println("Enter your Roll_number ");
	Roll_no=sc.nextInt();
	
	System.out.println("Enter your Age ");
	age=sc.nextInt();
	
	System.out.println("Enter Your Marks Subject1");
	m1=sc.nextInt();
	
	System.out.println("Enter Your Marks Subject2");
	m2=sc.nextInt();
	
	System.out.println("Enter Your Marks Subject3");
	m3=sc.nextInt();
	
	System.out.println("Enter Your Marks Subject4");
	m4=sc.nextInt();
	
	System.out.println("Enter Your Marks Subject5");
	m5=sc.nextInt();
	
	
	
	if (m1>35 && m2>35 && m3>35 && m4>35 && m5>35) {
		System.out.println("You are passed !!!");
		Total=m1+m2+m3+m4+m5;
		
		System.out.println("Total is :" +Total);
		
		Avg=Total/5f;
		
		System.out.println("Average is :"+ Avg);
	}
	else {
		System.out.println("You are Fail !!!!");
		
	}
	
	Total=m1+m2+m3+m4+m5;
	
	System.out.println("Total is :" +Total);
	
	Avg=Total/5f;
	
	System.out.println("Average is :"+ Avg);
	
	if (Avg >=85) {
		System.out.println("Distinction");
	}
	
	else if (Avg >=75) {
		System.out.println("Grade A");
	}
	
	else if (Avg >=65) {
		System.out.println("Grade B");
	}
	
	else {
		System.out.println("Grade C");
	}
}
}
