package org.system;

public class AxisBank extends BankInfo {

	public void deposit() {
		System.out.println("Minimum deposited amount for savings account is 5000");
	}
	
	public static void main(String[] args) {
		AxisBank aB = new AxisBank();
		aB.deposit();
		
	}
}
