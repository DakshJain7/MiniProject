import java.util.*;

public class MiniProject {

	private int custId;
	private float savings;

	public MiniProject(int custId, float savings) {
		this.custId = custId;
		this.savings = savings;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public float getSavings() {
		return savings;
	}

	public void setSavings(float savings) {
		this.savings = savings;
	}

	void getBalance() {
		System.out.println("Your balance is $" + savings);
	}

	void depositMoney(int money) {
		this.savings += money;
		System.out.println("Succesfully deposited amount of $" + money + " to your account!!!");
		System.out.println("Your balance is $" + savings);
	}

	void withdrawMoney(int money) {
		if (savings < 1000) {
			System.out.println("Can't withdraw, below minimum balance!!!");
		} else {
			System.out.println("Amount of $" + money + " withdrawn from your account!!!");
			this.savings -= money;
			System.out.println("Your balance is $" + savings);
		}
	}

	public static void main(String[] args) {
		ArrayList<MiniProject> cust = new ArrayList<>();
		cust.add(new MiniProject(101, 30000));
		cust.add(new MiniProject(102, 25000));
		cust.add(new MiniProject(103, 10000));
		cust.add(new MiniProject(104, 8000));
		
		System.out.println(cust.get(0).savings);

		cust.get(0).depositMoney(1000);

		cust.get(0).withdrawMoney(15000);

		cust.get(0).getBalance();
	}

}