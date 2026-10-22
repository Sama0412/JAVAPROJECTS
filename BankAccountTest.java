package java_practice_task1;



public class BankAccountTest {
public static void main(String[] args) {
	
	BankAccount ba = new BankAccount(60095, "Samadhan ", 25000);
	BankAccount ba1 = new BankAccount(20015, "Santosh ", 30000);
	System.out.println(ba.Acc_no);
	System.out.println(ba.account_holder_name);
	System.out.println(ba.balance);
	
	System.out.println(ba1.Acc_no);
	System.out.println(ba1.account_holder_name);
	System.out.println(ba1.balance);
	System.out.println(ba1.Status);
}
}
