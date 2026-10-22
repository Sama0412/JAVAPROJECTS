package java_practice_task1;

public class Manager extends Employees {
	String department;
    int teamSize;
    
    public Manager(String name,int emo_id,double salary,String department,int teamSize) {
    	
    	super(name,emo_id,salary);
    	this.department=department;
    	this.teamSize=teamSize;
		
	}
    
    void show() {
    	super.display();
    	System.out.println("Department: " + department);
    	System.out.println("Team Size: " + teamSize);
    }
    
    
}
