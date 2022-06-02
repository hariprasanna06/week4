package assignment.may.week4.day2;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("overriding deposit");
	}
	public static void main(String[] args) {
		AxisBank bank = new AxisBank();
		bank.deposit();
		
	}
}
