package java_practice_task1;

public class testpayment {
public static void main(String[] args) {
	

/*	CreditCardPayment c= new CreditCardPayment();
	UPIPayment u = new UPIPayment();
	NetBankingPayment n = new NetBankingPayment();*/
	
	payment credit = new CreditCardPayment();
	payment UPI = new UPIPayment();
	payment NetBanking = new NetBankingPayment();
	
	
	credit.processPayment();
	UPI.processPayment();
	NetBanking.processPayment();
}
}
