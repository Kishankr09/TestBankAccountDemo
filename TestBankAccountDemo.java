import java.util.Scanner;
import java.io.*;
class Account{
	int accNo;
	String name;
	String bankName;
	float balance;
	
	void insert(int an,String n,String bN,float bal) {
		accNo = an;
		name = n;
		bankName = bN; 
		balance = bal;
	}
	
	void deposit(float b) {
		balance = balance + b;
		System.out.println(balance + " Deposited Successfully !!");
	}
	
	void checkBalance() {
		System.out.println("Welcome to " + name);
		System.out.println("Your Account Balance is " + balance);
	}
	
	void withdraw(float money) {
		if(balance > money) {
			balance = balance - money;
			System.out.println(money + " Withdrawal Successfully !!");
			System.out.println("Your Account Balance is " + balance);
		}else {
			System.out.println("Insufficient Balance");
		}
	}
	void seeProfile() {
		System.out.println("Bank Name: " + bankName);
		System.out.println("Account Number: " + accNo);
		System.out.println("Customer Name: " + name);
		System.out.println("Balance: " +balance);
	}
}
public class TestBankAccountDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Account a = new Account();
		while(true) {
		System.out.println("\n0.Open Bank Account\n1.See Profile\n2.Deposit");
		System.out.println("3.Withdrawl\n4.Check Balance\n5.Exit");
		int ch = s.nextInt();
		switch(ch) {
		case 0:
				System.out.println("Enter The Name: ");
				String sn = s.nextLine();
				System.out.println("How Much You Want To Deposit 1st Time ");
				float bl = s.nextFloat();
				String bN = "SBI";
				int AccNo = 11110214;
				a.insert(AccNo,sn,bN,bl);
				break;
		case 1: 
				a.seeProfile();
				break;
		case 2: 
				System.out.println("How Much Deposit in Your Bank");
				float d = s.nextFloat();
				a.deposit(d);
				break;
		case 3: 
				System.out.println("How Much Money You want To Withdrawl in Your Bank");
				float w = s.nextFloat();
				a.withdraw(w);
				break;
		case 4:
				a.checkBalance();
				break;
		case 5:
				System.out.println("Thank You To Visit SBI Bank !!");
				return;			
		default:
			System.out.println("Wrong Choice !!");		
		}
		}
	}

}
