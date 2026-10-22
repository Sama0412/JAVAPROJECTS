package java_practice_task1;

public class testatm {
public static void main(String[] args) {
	 ATKMAccount acc1 = new  ATKMAccount(12345, 1111, 5000);
	 acc1.checkBalance(1111);       
     acc1.withdraw(1111, 2000);     
     acc1.withdraw(1111, -500);     
     acc1.withdraw(2222, 1000);    
     acc1.deposit(1500);            
     acc1.deposit(-200);            
     acc1.checkBalance(1111); 
}
}
