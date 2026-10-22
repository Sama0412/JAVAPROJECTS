package java_practice_task1;

public class ATKMAccount {
private int acc_no;
private int pin;
private double balance;

public ATKMAccount(int acc_no,int pin,double balance) {
	this.acc_no=acc_no;
	this.pin=pin;
	if (balance>=0) {
		this.balance=balance;
		
	}
	else {
		System.out.println("Invalid initial balance! Setting to 0.");
		this.balance=0;
	}
}
private boolean validatepin(int pin) {
    return this.pin == pin;
}

public void withdraw(int pin, double amount) {
    if(!validatepin(pin)) {
        System.out.println("❌ Incorrect PIN!");
        return;
    }
    if(amount <= 0) {
        System.out.println("❌ Invalid withdrawal amount!");
        return;
    }
    if(amount > balance) {
        System.out.println("❌ Insufficient balance!");
        return;
    }
    balance -= amount;
    System.out.println("✅ Withdrawal successful! Remaining balance: ₹" + balance);
}

public void deposit(double amount) {
    if(amount <= 0) {
        System.out.println("❌ Invalid deposit amount!");
        return;
    }
    balance += amount;
    System.out.println("✅ Deposit successful! Current balance: ₹" + balance);
}

public void checkBalance(int pin) {
    if(validatepin(pin)) {
        System.out.println("💰 Current balance: ₹" + balance);
    } else {
        System.out.println("❌ Incorrect PIN!");
    }
}

}
