package java_practice_task1;

public class students {
  String name;
  int rollno;
  String course;
  
  public students(String name, int rollno, String course) {
	this.name=name;
	this.rollno=rollno;
	this.course=course;
}
  
  void display() {
	  
	  System.out.println("name : " + name + " , rollno : " + rollno + " , course : " + course );
  }
  
  void show() {
	  this.display();
  }
}
