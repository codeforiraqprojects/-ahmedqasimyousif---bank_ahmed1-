package A;

public class Acount1 {
	int acc_no;
	String name;
	float amount;
	int phone;

	void insert(int a, String n, float amt, int ph) {

		acc_no = a;
		name = n;
		amount = amt;
		phone = ph;

	}

	void deposit(float amt) {
		amount = amount + amt;
		System.out.println(amt + "deposit");

	}

	void withdraw(float amt) {
		if (amount < amt) {
			System.out.println("insufficient Balance");
		} else {
			amount = amount - amt;
			System.out.println(amt + " withdrawn");
		}

	}

	void checkBalance() {
		System.out.println(" Balance is :" + amount);
	}

	void display() {
		System.out.println(" "+ "Acount Namber: " +acc_no +" \n "+"Name : " + name + "\n " +"amount :" + amount+" \n"+" "+"phone Number: " + phone);
		
	}

	void phone() {

		System.out.println();
	}

}
